package com.restaurant.rest.order;

import com.restaurant.common.model.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class OrderController {

@RequestMapping(value="/menu", method=GET)
public ResponseEntity<Object> getMenus(@PathVariable String restaurantId) {
  // return an array of MenuItem objects
    return null;
}

@RequestMapping(value="/order", method=POST)
public ResponseEntity<Object> placeOrder(@PathVariable String restaurantId, @RequestBody Order order) {
  // depending on how the order is placed, the information for reservation and payment may not be
  // filled yet
  // returns the same Order object with additional data such as Reservation and Delivery populated
    return null;
}

}
