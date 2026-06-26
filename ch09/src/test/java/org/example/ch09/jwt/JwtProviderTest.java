package org.example.ch09.jwt;

import io.jsonwebtoken.Claims;
import lombok.extern.log4j.Log4j2;
import org.example.ch09.entity.User;
import org.example.ch09.security.MyUserDetails;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.Authentication;

import static org.junit.jupiter.api.Assertions.*;

@Log4j2
@SpringBootTest
class JwtProviderTest {

    @Autowired
    private JwtProvider provider;

    @Test
    void createToken() {

        User user = User.builder()
                .userid("a102")
                .name("김유신")
                .birth("1999-02-11")
                .age(23)
                .role("MANAGER")
                .build();

        String access = provider.createToken(user, -1);
        //String refresh = provider.createToken(user, 5);
        log.info(access);
        //log.info(refresh);
        /*
            eyJhbGciOiJIUzI1NiJ9.
            eyJpc3MiOiJjaGhhazA1MDNAZ21haWwuY29tIiwiaWF0IjoxNzgyMzY5Njg0LCJleHAiOjE3ODI0NTYwODQsInVzZXJuYW1lIjoiYTEwMSIsInJvbGUiOiJBRE1JTiJ9.
            MusNXvsgNeOuK4Kjv0gFWJar4qg3D2_hpzSImcukK3k
        */
    }

    @Test
    void getClaims() {

        String token = "eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJjaGhhazA1MDNAZ21haWwuY29tIiwiaWF0IjoxNzgyMzY5Njg0LCJleHAiOjE3ODI0NTYwODQsInVzZXJuYW1lIjoiYTEwMSIsInJvbGUiOiJBRE1JTiJ9.MusNXvsgNeOuK4Kjv0gFWJar4qg3D2_hpzSImcukK3k";

        Claims claims = provider.getClaims(token);

        String username = (String) claims.get("username");
        String role = (String) claims.get("role");

        log.info("username : " + username);
        log.info("role : " + role);
    }

    @Test
    void getAuthentication() {

        String token = "eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJjaGhhazA1MDNAZ21haWwuY29tIiwiaWF0IjoxNzgyMzY5Njg0LCJleHAiOjE3ODI0NTYwODQsInVzZXJuYW1lIjoiYTEwMSIsInJvbGUiOiJBRE1JTiJ9.MusNXvsgNeOuK4Kjv0gFWJar4qg3D2_hpzSImcukK3k";

        Authentication authentication = provider.getAuthentication(token);
        User user = (User) authentication.getPrincipal();

        //User user = details.getUser();

        log.info(user);
    }

    @Test
    void validateToken() {
        String token = "eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJjaGhhazA1MDNAZ21haWwuY29tIiwiaWF0IjoxNzgyMzcxODc1LCJleHAiOjE3ODIyODU0NzUsInVzZXJuYW1lIjoiYTEwMiIsInJvbGUiOiJNQU5BR0VSIn0.dVT3Jrn1alx7fiNKSTzRAvRjjylP0it0O3X3OudxkYs";
        provider.validateToken(token);
    }


}