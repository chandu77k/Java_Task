package com.questk2.sbeans;

import org.springframework.stereotype.Component;

@Component
public class Company {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
