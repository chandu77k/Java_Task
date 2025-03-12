package com.questk2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.questk2")
public class Config {

    @Bean
    public String companyName() {
        return "QuestK2";
    }
   @Bean
    public String availableService() {
        return "All software solutions";
    }
}
