package com.restaurant.rest.reservation;

import com.restaurant.common.model.Reservation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class ReservationController {

@RequestMapping(value="/availableTables", method=GET)
public ResponseEntity<Object> getAvailableTables(@RequestParam String restaurantId,
                                                 @RequestParam Long fromTime, @RequestParam Long toTime) {
      // return an array of Table objects
    return null;
}

@RequestMapping(value="/reserveTable", method=POST)
public ResponseEntity<Object> reserveTable(@RequestBody Reservation reservation) {
      // return the same Reservation object with additional inforamtion filled
    return null;
}

}
