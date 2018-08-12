package com;

import com.demo.config.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ankush Chaudhary on Aug / 2018
 */

@SpringBootApplication(scanBasePackages = "com.demo")
@ComponentScan
@RestController
@EnableConfigurationProperties(Application.class)
public class RestDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestDemoApplication.class, args);
    }
}
