package com.restaurant.order;

@RestController
public class OrderController {

@RequestMapping(value="/menu", method=GET)
public ResponseEntity<Object> getMenus((@PathVariable String restaurantId) {
}

@RequestMapping(value="/order", method=POST)
public ResponseEntity<Object> placeOrder((@PathVariable String restaurantId, @RequestBody Order order) {
}

}
