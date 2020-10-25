package com.restaurant.delivery;

import com.restaurant.common.model.Delivery;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class DeliveryController {

@RequestMapping(value="/available", method=GET)
public ResponseEntity<Object> getAvailability(@RequestParam String restaurantId,
                                              @RequestParam String address, @RequestParam Long time) {
      // loop through all contracted providers and send B2B requests for availability.
      // Find the first one available
      // return the provider ID if found, otherwise returns not available
    return null;
}

@RequestMapping(value="/requestDelivery", method=POST)
public ResponseEntity<Object> requestDelivery(@RequestBody Delivery deliver) {
      // call B2B service of the provider to schedule the delivery
      // Delivery.java defines the data.
      // returns Delivery object with confirmation ID filled
    return null;
}

}
