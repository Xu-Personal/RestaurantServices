package com.restaurant.common.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Reservation {

  String restaurantId;
  String tableId;
  long time;
  int duration;
  String customerName;
  String customerPhoneNumber;
  int numberOfPeople;
  
}
