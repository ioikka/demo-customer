package io.ikka.democustomer.controller;

import io.ikka.democustomer.model.dto.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class CustomerController {

    @GetMapping("/customer/{id}")
    public ResponseEntity getCustomer(@PathVariable("id") Long id) {
        Customer customer = new Customer();
        customer.setName("TestName");
        customer.setId(id);
        log.info("{}", customer);
        return ResponseEntity.ok(customer);
    }
}
