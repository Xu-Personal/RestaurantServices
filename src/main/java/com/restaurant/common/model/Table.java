package com.restaurant.common.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.util.Pair;

import java.util.List;

@Document
public class Table {
  String restaurantId;
  String tableId;
  boolean outside;
  int capacity;
  List<Pair<Long,Long>> servingTimes;    // this stores the time the table is open for customers for the current reservable period (say 2 weeks)
}
