package com.example.test.anno;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnnoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(AnnoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("FINE...");
    }
}
