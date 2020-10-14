# RestaurantServices

## Background

The project provides web services available externally for consumptions by public websites such as Yelp, mobile apps such as Apple and Google Maps, as well as the websites and tablet apps hosted by the restaurants themselves.

Unfamiliar with the softwares (web sites and web services, both exposed and consumed, shared and proprietary), I am making the following assumptions:
* Apple Map and similar defines a set of common APIs that all restaurants need to support in order to show details when a user looks the restaurant up in Apple Map.
  The API should return typically the following information
  - restaurant website URL
  - Addresses, phone numbers
  - Operating hours
  - URLs for pictures of dishes and restaurants
  - tags for types of food (i.e. Mexican, Casual)
  - options (i.e. parking available, take reservation, provide delivery, can take out, has out door seatings, contactless payment)
* Menu service, consumed by Yelp/etc as well as restaurants' own websites
* Ordering service, mainly consumed by the restaurants' own websites
* Reservation service, mainly consumed by the restaurants' own websites
* Admin services, used by the restaurant adminstrators, to change information such as menu, pictures, operating hours, etc.

* Services consumed include:
  - credit card payment to all accepted payment options (credit cards, debit cards, etc)
  - food delivery services: obtain availability (location and time), place order (set up delivery), 
  
## High Level Design Options
At the very high level, we may have the following choices:

1. A monolithic application including database and website running on a single machine. This is old fashioned, self contained, and maybe suitable
  for a single restaurant or a small chain of restaurants to use.
2. A cloud native solution (using Lambda, S3, SQS, etc). This is modern, much more cost effective for a single restaurant or a small chain of restaurants,
  and can also be used for large restaurant chains as well as service providers serving many independent restaurants.
3. Traditional micro services running on public or private clouds. Only suitable for large restaurant chains and service providers serving large number
   of independent restaurants.

As an exercise, 3. is most meaningful, hence that is my choice here.
Also, as an exercise I am not considering internal business functions such as billing reconcilation, accountings, human resources, supply chains, etc.

## Pandemic Consideration

The following features are designed to address specifically the challenges for the restaurant business to promote business during the pandemic
* Provide indicators to search apps whether the restaurants offer take-out, home delivery, outside seating, inside seating, contactless payment
* Implement a tablet app for waiters/waitresses to take order and payment easily for outside seated customers.
* Contract a food delivery provider (inefficient to provide deliveries using restaurant staff). A B2B interface with the provider is needed for this purpose.

## Components (Micro Services)
The diagram in ServiceDiagram.pdf provides an intuitive views of the components.
* We will have database holding any data that needs to be persisted. Examples include:
  - Restaurants
  - General information displayed on websites and apps, such as addresses, phone numbers, website addresses, types of food, etc.
    The information is for each restaurant (same for all items below).
  - Menu items
  - Orders
  - Table schedules
  - Payments
  - Delivery schedules
  - Pictures
* A General Information microservice that will provide general information to external search apps such as Apple Map, Yelp, etc.
  This service also provides APIs for restaurant menues
* A Ordering microservice primarily serving the restaurant website (for both customers and employees) and restaurant tablet app (for employees) 
  to take orders. 
* A Reservation micro service primarily serving the restaurant website and restaurant tablet app to reserve and schedule tables
* A food delivery micro service, handling B2B interaction with the food delivery service providers. This micro service
  is consumed internally by the ordering service and admin service.
* A Payment micro service, handling B2B traffic with accepted finantial transaction providers (credit cards, banks, PayPal, etc)
* An Admin micro service, serving the admin web site, for administration purposes such as changing general information, modify menu,
  updating pictures, changing operating hours, etc.
* Front end: a server hosting tablet app for the restaurant employees.
* Front end: a web server hosting the websites for consumers
* Front end: a web server for adminstrations
* Front end (optional): a server hosting a mobile app for consumers

## Performance Consideration
The general information micro service will probably carry much more traffic than others. We can utilize caching/etag on the client side (as 
these contents are relative static) and the auto-scaling group feature of AWS (if we deploy on it) to handle the high volume
of requests and ensure adequate response time.

The services for table reservation, ordering, food delivery, payment, etc., will carry relatively low traffic, auto-scaling group feature can
still be used when necessary.

## Mid Level Design
We can use Spring Boot to implement the services.
In real implementation, we will use one GitHub project per micro service, with data models and common functions in a project that is dependent by
the micro services.

__For the purpose of the exercise, I simply create a package for each micro service and the shared code within this project.__
