package com.restaurant.common.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Delivery {
  String transactionId;   // ID tracking B2B request
  String restaurantId;
  String deliveryProviderId;
  long pickupTime;
  long deliveryTime;
  String customerName;
  String customerPhoneNumber;
  String customerAddress;
   
}
