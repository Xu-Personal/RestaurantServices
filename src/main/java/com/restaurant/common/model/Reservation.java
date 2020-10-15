package com.restaurant.common.model;

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
