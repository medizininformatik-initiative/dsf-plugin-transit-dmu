package de.fraunhofer.isst.health.transit.utils;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.Date;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

public class SignedLinkGeneratorJjwt {

    private final String secret;
    private final String cdn_base;

    public SignedLinkGeneratorJjwt(String secret, String cdnBase) {
        this.secret = secret;
        this.cdn_base = cdnBase;
    }

    public String generateLink(String userId, String filePath, long ttlSeconds) {
        SecretKey KEY = Keys.hmacShaKeyFor(this.secret.getBytes(StandardCharsets.UTF_8));
        Instant now = Instant.now();
        String jwt = Jwts.builder()
                .subject(userId)
                .claim("file", filePath)
                .issuedAt(Date.from(now))
                .expiration(Date.from(now.plusSeconds(ttlSeconds)))
                .signWith(KEY)
                .compact();

        return this.cdn_base + filePath + "?token=" + jwt;
    }

}
