package com.ideal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaAppa {
    public static void main(String[] args) {
        SpringApplication.run(EurekaAppa.class, args);
    }
}
