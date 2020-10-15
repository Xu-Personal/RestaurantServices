package com.restaurant.reservation;

@RestController
public class ReservationController {

@RequestMapping(value="/availableTables", method=GET)
public ResponseEntity<Object> getAvailableTables(@RequestParam String restaurantId, 
      @RequestParam Long fromTime, @RequestParam Long toTime) {
      // return an array of Table objects
}

@RequestMapping(value="/reserveTable", method=POST)
public ResponseEntity<Object> reserveTable(@RequestBody Reservation reservation) {
      // return the same Reservation object with additional inforamtion filled
}

}
