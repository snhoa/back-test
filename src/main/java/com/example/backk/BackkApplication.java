package com.example.backk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class BackkApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackkApplication.class, args);
    }

}
