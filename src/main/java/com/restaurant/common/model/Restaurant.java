package com.restaurant.common.model;

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
