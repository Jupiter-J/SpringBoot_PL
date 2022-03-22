package com.example.board3_basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Board3BasicApplication {

    public static void main(String[] args) {
        SpringApplication.run(Board3BasicApplication.class, args);
    }

}
