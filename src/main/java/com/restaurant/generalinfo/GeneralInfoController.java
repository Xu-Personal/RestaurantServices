package com.restaurant.generalinfo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class GeneralInfoController {

    @RequestMapping(value = "/restaurant/{restaurantId}", method = GET)
    public ResponseEntity<Object> getRestaurantInfo(@PathVariable String restaurantId) {
        // Check in memory Restaurant cache to see if the restaurant is cached
        // If not cached, load it from database and put in the cache
        // If ETag is sent in the request, check the last update time of the restaurant
        //   and return HTTP 304 if there is no change
        // Return HTTP 200 with the data Restaurant
        return null;
    }

    @RequestMapping(value = "/menu/{restaurantId}", method = GET)
    public ResponseEntity<Object> getMenu(@PathVariable String restaurantId) {
        // Invoke services provided by com.restaurant.order.getMenu and return the result.
        // This permits the external clients with a single endpoint to use
        // Returns an array of MenuItem entries
        return null;
    }

}

