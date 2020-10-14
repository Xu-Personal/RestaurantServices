@RestController

@RequestMapping
public ResponseEntity<Object> getRestaurantInfo(String restaurantId) {
   // Check in memory Restaurant cache to see if the restaurant is cached
   // If not cached, load it from database and put in the cache
   // If ETag is sent in the request, check the last update time of the restaurant
   //   and return HTTP 304 if there is no change 
   // Return HTTP 200 with the data
}

@RequestMapping
public ResponseEntity<Object> getMenu(String restaurantId) {
  // Invoke services provided by com.restaurant.order.getMenu and return the result.
  // This permits the external clients with a single endpoint to use
}

