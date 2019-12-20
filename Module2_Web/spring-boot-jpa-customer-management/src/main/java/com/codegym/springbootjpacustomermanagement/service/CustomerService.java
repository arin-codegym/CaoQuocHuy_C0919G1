package com.codegym.springbootjpacustomermanagement.service;

import com.codegym.springbootjpacustomermanagement.model.Customer;
import com.codegym.springbootjpacustomermanagement.model.Province;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);
    Iterable<Customer> findAllByProvince(Province province);
}
