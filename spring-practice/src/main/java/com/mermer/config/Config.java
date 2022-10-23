package com.mermer.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @ConfigurationProperties("mermer")
    @Bean
    public MyProperties myProperties(){
        return new MyProperties();
    }
}
