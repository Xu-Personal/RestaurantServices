package com.restaurant.rest.payment;

import com.restaurant.common.model.Charge;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class PaymentController {

@RequestMapping(value="/charge", method=POST)
public ResponseEntity<Object> chargeByCreditCard(@RequestBody Charge charge) {
    // calls B2B service of the corresponding credit card company
    // persist the charge information in database
    // returns the same Charge object with confirmation ID filled
    return null;

}

}
