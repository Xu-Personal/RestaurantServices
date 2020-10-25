package com.restaurant.common.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class MenuItem {
    String restarantId;
    String dishId;
    String dishName;
    String description;
    float price;
}
