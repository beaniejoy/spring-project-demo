package io.beaniejoy.bootapiserver.jwt;

import io.beaniejoy.bootapiserver.network.response.UserResponseDto;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;

@Component
public class JwtUtil {

    private final Long tokenValidityInMilliseconds;

    private final Key key;

    public JwtUtil(@Value("${jwt.secret}") String secret,
                   @Value("${jwt.token-validity-in-seconds}") Long tokenValidityInMilliseconds) {
        this.tokenValidityInMilliseconds = tokenValidityInMilliseconds;
        byte[] keyBytes = Decoders.BASE64.decode(secret);
        this.key = Keys.hmacShaKeyFor(keyBytes);
    }

    public String createAccessToken(UserResponseDto authentication, String claimKey) {

        Date now = new Date();
        Date validity = new Date(now.getTime() + this.tokenValidityInMilliseconds);

        return Jwts.builder()
                .setSubject(authentication.getEmail())
                .claim(claimKey, authentication)
                .signWith(key, SignatureAlgorithm.HS512)
                .setIssuedAt(now)
                .setExpiration(validity)
                .compact();
    }
}
