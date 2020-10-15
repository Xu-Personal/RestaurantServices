package com.restaurant.common.model;

@Document
public class Charge {
  String restaurantId;
  float amount;
  CreditCardInfo creditCard;
  long time;
  String confirmationNumber;
  
}
  
