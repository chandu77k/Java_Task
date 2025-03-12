package com.questk2.main;


import com.questk2.config.Config;
import com.questk2.sbeans.Services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Services services = context.getBean(Services.class);
        services.displayCompanyDetails();
    }
}
