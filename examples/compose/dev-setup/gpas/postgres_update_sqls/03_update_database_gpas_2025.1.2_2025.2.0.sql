-- convert_to_multi_psn_domain (Postgres)
CREATE OR REPLACE PROCEDURE convert_to_multi_psn_domain(in_domain TEXT)
LANGUAGE plpgsql
AS $$
DECLARE
    conflict INTEGER;
BEGIN
    -- prüfe ob domain existiert
    SELECT COUNT(*) INTO conflict FROM domain WHERE name = in_domain;
    IF conflict = 0 THEN
        RAISE EXCEPTION 'Domain "%" not exists.', in_domain;
    END IF;

        -- prüfe ob domain bereits in multi-psn vorhanden
    SELECT COUNT(*) INTO conflict FROM mpsn WHERE domain = in_domain;
    IF conflict > 0 THEN
        RAISE EXCEPTION 'Domain "%" already exists in mpsn-table.', in_domain;
    END IF;

    -- INSERT (mit ON CONFLICT als Ersatz für MySQL REPLACE)
    -- -> Annahme: UNIQUE(originalValue, domain). Falls anders, bitte anpassen.
    INSERT INTO mpsn (originalValue, pseudonym, domain, encoded_expiration_date)
    SELECT originalValue, pseudonym, domain, encoded_expiration_date
    FROM psn
    WHERE domain = in_domain
    ON CONFLICT (originalValue, domain)
    DO UPDATE SET
        pseudonym = EXCLUDED.pseudonym,
        encoded_expiration_date = EXCLUDED.encoded_expiration_date;

    -- lösche die psn-zeilen
    DELETE FROM psn WHERE domain = in_domain;

    -- setze MULTI_PSN_DOMAIN=true in domain.properties
    UPDATE domain
    SET properties =
        -- entferne vorhandene MULTI_PSN_DOMAIN=... Einträge und führende ';'
        regexp_replace(
            regexp_replace(coalesce(properties, ''), ';?MULTI_PSN_DOMAIN=[^;]+', '', 'g'),
            '^;', '', 'g'
        )
        -- füge evtl. ein Trennzeichen ein
        || (CASE WHEN coalesce(properties, '') = '' OR right(coalesce(properties, ''), 1) = ';' THEN '' ELSE ';' END)
        || 'MULTI_PSN_DOMAIN=true;'
    WHERE name = in_domain;
END;
$$;


-- convert_to_single_psn_domain (Postgres)
CREATE OR REPLACE PROCEDURE convert_to_single_psn_domain(in_domain TEXT)
LANGUAGE plpgsql
AS $$
DECLARE
    conflict INTEGER;
BEGIN
    -- prüfe ob domain existiert
    SELECT COUNT(*) INTO conflict FROM domain WHERE name = in_domain;
    IF conflict = 0 THEN
        RAISE EXCEPTION 'Domain "%" not exists.', in_domain;
    END IF;

    -- prüfe ob domain bereits in single-psn vorhanden
    SELECT COUNT(*) INTO conflict FROM psn WHERE domain = in_domain;
    IF conflict > 0 THEN
        RAISE EXCEPTION 'Domain "%" already exists in psn-table.', in_domain;
    END IF;

    -- prüfe Konflikte mit mehrfachen originalValue in mpsn
    SELECT COUNT(*) INTO conflict
    FROM (
        SELECT originalValue
        FROM mpsn
        WHERE domain = in_domain
        GROUP BY originalValue
        HAVING COUNT(*) > 1
        LIMIT 1
    ) t;
    IF conflict > 0 THEN
        RAISE EXCEPTION 'At least one originalValue is not unique in domain "%".', in_domain;
    END IF;

    -- INSERT in psn (kein REPLACE)
    INSERT INTO psn (originalValue, pseudonym, domain, encoded_expiration_date)
    SELECT originalValue, pseudonym, domain, encoded_expiration_date
    FROM mpsn
    WHERE domain = in_domain;

    -- lösche die mpsn-zeilen
    DELETE FROM mpsn WHERE domain = in_domain;

    -- setze MULTI_PSN_DOMAIN=false in domain.properties (falls vorhanden)
    UPDATE domain
    SET properties = regexp_replace(coalesce(properties, ''), 'MULTI_PSN_DOMAIN=[^;]+', 'MULTI_PSN_DOMAIN=false', 'g')
    WHERE name = in_domain;
END;
$$;
