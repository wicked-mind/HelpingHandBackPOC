package com.helpinghand.bootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;

/**
 * This is the Boot Class for Application.
 *
 * @author Gourav
 */
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class BootStartApp {
    public static void main( String[] args ) {
        SpringApplication.run(BootStartApp.class, args);
    }
}
