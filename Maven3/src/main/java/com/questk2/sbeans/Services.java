package com.questk2.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Services {
    
    // Field Injection
    @Autowired
    private Company company;

    // Constructor Injection
    private final String companyName;

    @Autowired
    public Services(String companyName) {
        this.companyName = companyName;
    }

    // Setter Injection
    private String availableService;

    @Autowired
    public void setAvailableService(String availableService) {
        this.availableService = availableService;
    }

    public void displayCompanyDetails() {
        System.out.println("Company Name : " + companyName);
        System.out.println("Services : " + availableService);
    }
}
