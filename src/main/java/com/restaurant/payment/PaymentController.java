package com.restaurant.payment;

@RestController
public class PaymentController {

@RequestMapping(value="/charge", method=POST)
public ResponseEntity<Object> chargeByCreditCard(@RequestBody Charge charge) {
    // calls B2B service of the corresponding credit card company
    // persist the charge information in database
    // returns the same Charge object with confirmation ID filled
}

}
