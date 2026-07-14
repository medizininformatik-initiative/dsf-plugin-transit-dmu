ALTER TABLE domain
    ADD COLUMN expiration_properties VARCHAR(1023);

ALTER TABLE psn
    ADD COLUMN encoded_expiration_date SMALLINT;

ALTER TABLE mpsn
    ADD COLUMN encoded_expiration_date SMALLINT;
