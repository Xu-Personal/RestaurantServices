package com.restaurant.common.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Restaurant {

  @Id
  String restaurantId;
  String address;
  String telephone;
  String website;
  String typeOfFood;
  boolean hasOutdoorSeating;
  boolean hasIndoorSeating;
  boolean hasContactlessPayment;
  boolean hasFoodDeliveryService;
  boolean hasTakeOut;
  boolean hasParking;
  String urlForMenu;
  String urlForPictures;
  
}
