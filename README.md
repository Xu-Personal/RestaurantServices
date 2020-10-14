# RestaurantServices

These provides web services available externally for consumptions by public websites such as Yelp, mobile apps such as Apple and Google Maps, as well as the website hosted by the restaurant itself.

Unfamiliar with the softwares (web sites and web services, both exposed and consumed, shared and proprietary), I am making the following assumptions:
* Apple Map and similar defines a set of common APIs that all restaurants need to support in order to show details when a user looks the restaurant up in Apple Map.
  The API should return typically the following information
  - restaurant website URL
  - Addresses, phone numbers
  - Operating hours
  - URLs for pictures of dishes and restaurants
  - tags for types of food (i.e. Mexican, Casual)
  - options (i.e. parking available, take reservation, provide delivery, can take out, has out door seatings, contactless payment)
  - ETag (for caching)
* Menu service, consumed by Yelp/etc as well as restaurant's own website
* Ordering service, mainly consumed by the restaurant's own website
* Reservation service, mainly consumed by the restaurant's own website
* Admin services, used by the restaurant adminstrators, to change information such as menu, pictures, operating hours, etc)


* Services consumed include:
  - credit card payment to all accepted payment options (credit cards, debit cards, etc)
  - food delivery services: obtain availability (location and time), place order (set up delivery), billing
