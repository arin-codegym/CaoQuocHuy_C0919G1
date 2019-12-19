package com.codegym.springbootjpacustomermanagement.service;

import com.codegym.springbootjpacustomermanagement.model.Customer;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> findAll();

    Optional<Customer> findById(Long id);

    void save(Customer customer);

    void remove(Long id);
}
