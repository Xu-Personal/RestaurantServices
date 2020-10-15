package com.restaurant.order;

@RestController
public class OrderController {

@RequestMapping(value="/menu", method=GET)
public ResponseEntity<Object> getMenus(@PathVariable String restaurantId) {
  // return an array of MenuItem objects
}

@RequestMapping(value="/order", method=POST)
public ResponseEntity<Object> placeOrder(@PathVariable String restaurantId, @RequestBody Order order) {
  // depending on how the order is placed, the information for reservation and payment may not be
  // filled yet
  // returns the same Order object with additional data such as Reservation and Delivery populated
}

}
