/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paymentchains.customer.repository;

import com.paymentchains.customer.entities.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Yanire
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    
}
