package com.restaurant.order;

@RestController
public class OrderController {

@RequestMapping
public ResponseEntity<Object> getMenus(String restaurantId) {
}

@RequestMapping
public ResponseEntity<Object> placeOrder(String restaurantId, Order order) {
}

}
