package com.ankushchaudhary.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ankush Chaudhary on Aug / 2018
 */

@SpringBootApplication(scanBasePackages = "com")
@ComponentScan
@RestController
public class RestDemoApplication {
    @GetMapping("/health")
    String getHealth() {
        return "Ok";
    }

    public static void main(String[] args) {
        SpringApplication.run(RestDemoApplication.class, args);
    }
}
