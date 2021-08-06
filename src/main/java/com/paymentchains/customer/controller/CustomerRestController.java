/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paymentchains.customer.controller;

import com.paymentchains.customer.entities.Customer;
import com.paymentchains.customer.repository.CustomerRepository;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

/**
 *
 * @author Yanire
 */
@RestController
@RequestMapping("/url")
public class CustomerRestController {
    
    @Autowired
    CustomerRepository customerRepository;
    
    @GetMapping()
    public List<Customer> list() {
        return (List<Customer>) customerRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public Customer get(@PathVariable String id) {
        return null;
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<?> put(@PathVariable String id, @RequestBody Customer input) {
        return null;
    }
    
    @PostMapping
    public ResponseEntity<?> post(@RequestBody Customer input) {
        return null;
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        return null;
    }
    
}
