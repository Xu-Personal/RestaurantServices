package com.restaurant.common.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Order {
  @Id
  String orderId;
  @Indexed
  String restaurantId;
  long orderTime;
  Charge chargeInfo;
  OrderStatus status;
  long completeTime;
  OrderType orderType; // take out, delivery, inside seating, outside seating
  Reservation reservation;    // this includes walk-in assignments (just-in-time reservation); only for dine-in
  Delivery delivery;          // only for home delivery
  List<MenuItem> orderItems;

  public enum OrderStatus {
    InCart,
    Pending,
    Completed
  }

  public enum OrderType {
    DineIn,
    TakeOut,
    Delivery
  }

}
