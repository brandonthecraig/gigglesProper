package com.brandongo.giggles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
// just added config, trying to solve the problem of why my package won't package
@Configuration
public class GigglesApplication {

    public static void main(String[] args) {
        SpringApplication.run(GigglesApplication.class, args);
    }
}
