package com.example.mavenProject;

import com.example.mavenProject.MavenProjectApplication;

public class MavenProjectApplication {
    public Integer operations(Integer first, Integer second, Integer third,Integer fourth,Integer fifth) {
        return first + second * third - fourth / fifth;
    }

    public static void main(String[] args) {
        MavenProjectApplication mavenProjectApplication = new MavenProjectApplication();
        System.out.println("Result: " + mavenProjectApplication.operations(7,5,3,1,2));
    }
}
