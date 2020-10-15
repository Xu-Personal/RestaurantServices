package com.restaurant.common.mode;

@Document
public class Table {
  String restaurantId;
  String tableId;
  boolean outside;
  int capacity;
  List<Pair<Long>> servingTimes;    // this stores the time the table is open for customers for the current reservable period (say 2 weeks)
}
