package com.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Ankush Chaudhary on Aug / 2018
 */


@ConfigurationProperties(prefix = "application")
public class Application {
    public static class Config {
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String name;

    }

    public Config getConfig() {
        return config;
    }

    public void setConfig(Config config) {
        this.config = config;
    }

    public Config config = new Config();
}
