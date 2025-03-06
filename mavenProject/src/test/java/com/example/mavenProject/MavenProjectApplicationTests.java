package com.example.mavenProject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MavenProjectApplicationTests {
    @Test
    public void testAddition() {
    	MavenProjectApplication mavenProjectApplication = new MavenProjectApplication();
        assertEquals(22, mavenProjectApplication.operations(7,5,3,1,2));
    }
}

