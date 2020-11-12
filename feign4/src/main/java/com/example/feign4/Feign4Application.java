package com.example.feign4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Feign4Application {

    public static void main(String[] args) {
        SpringApplication.run(Feign4Application.class, args);
    }

}
