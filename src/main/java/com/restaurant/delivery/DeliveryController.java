package com.restaurant.delivery;

@RestController
public class DeliveryController {

@RequestMapping(value="/available", method=GET)
public ResponseEntity<Object> getAvailability(@RequestParam String restaurantId, 
      @RequestParam String address, @RequestParam Long time) {
      // loop through all contracted providers and find the first one available
      // return true or false
}

@RequestMapping(value="/requestDelivery", method=POST)
public ResponseEntity<Object> reserveTable(@RequestParam String restaurantId,
        @RequestParam String address, @RequestParam String customerName,
        @RequestParam Long time, @RequestParam String customerPhoneNumber) {
        // returns confirmation ID
}

}
