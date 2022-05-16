package com.example.awsstudy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HealthController {

    @Value("${jwt.secret}")
    private String secret;

    @GetMapping
    public String healthCheck(){
        log.info("secret: "+ secret);
        return "secret: " + secret;
    }
}
