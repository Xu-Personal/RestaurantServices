package com.restaurant.common.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="charge")
public class Charge {

  String restaurantId;
  float amount;
  CreditCardInfo creditCard;
  long time;
  String confirmationNumber;
  
}
  
