package com.sunflower;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SunflowerApplication {
    @RestController
    class HelloworldController {
        @GetMapping("/health")
        String health() {
            return "Put some sunflower seeds in your pocket.";
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(SunflowerApplication.class, args);
    }

}
