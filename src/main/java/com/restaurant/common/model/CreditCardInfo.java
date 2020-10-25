package com.restaurant.common.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CreditCardInfo {
  String cardType;
  String cardNumber;
  String securityCode;
  Long expirationDate;
  String cardHolderName;
  
  
}
