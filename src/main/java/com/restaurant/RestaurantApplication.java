package com.restaurant;

import org.springframework.boot.SpringApplication;

public class RestaurantApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(RestaurantApplication.class);
        application.run(args);
    }
}
