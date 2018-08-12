package com.demo.controller;

import com.demo.config.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ankush Chaudhary on Aug / 2018
 */

@RestController
public class ConfigController {
    @Autowired
    Application application;
    @GetMapping("/application")
    public String getName() {
        return application.config.name;
    }
}
