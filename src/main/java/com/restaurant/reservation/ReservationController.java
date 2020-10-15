package com.restaurant.reservation;

@RestController
public class ReservationController {

@RequestMapping(value="/availableTables", method=GET)
public ResponseEntity<Object> getAvailableTables(@RequestParam String restaurantId, 
      @RequestParam Long fromTime, @RequestParam Long toTime) {
}

@RequestMapping(value="/reserveTable", method=POST)
public ResponseEntity<Object> reserveTable(@RequestParam String restaurantId, @RequestParam String tableId,
        @RequestParam Long fromTime, @RequestParam Long toTime,
        @RequestParam String customerName, @RequestParam Integer numberOfPeople) {
}

}
