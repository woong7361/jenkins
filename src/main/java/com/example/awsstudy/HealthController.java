package com.example.awsstudy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HealthController {

    @GetMapping
    public String healthCheck(){
        log.info("123123123123");
        return "떳다!";
    }
}
