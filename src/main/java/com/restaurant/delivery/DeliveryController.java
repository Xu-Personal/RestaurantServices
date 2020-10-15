package com.restaurant.delivery;

@RestController
public class DeliveryController {

@RequestMapping(value="/available", method=GET)
public ResponseEntity<Object> getAvailability(@RequestParam String restaurantId, 
      @RequestParam String address, @RequestParam Long time) {
      // loop through all contracted providers and send B2B requests for availability.
      // Find the first one available
      // return the provider ID if found, otherwise returns not available
}

@RequestMapping(value="/requestDelivery", method=POST)
public ResponseEntity<Object> requestDelivery(@RequestBody Delivery deliver) {
      // call B2B service of the provider to schedule the delivery
      // Delivery.java defines the data.
      // returns Delivery object with confirmation ID filled
}

}
