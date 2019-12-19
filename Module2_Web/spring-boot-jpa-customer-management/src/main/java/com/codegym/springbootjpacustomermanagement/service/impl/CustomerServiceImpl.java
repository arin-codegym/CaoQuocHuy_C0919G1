package com.codegym.springbootjpacustomermanagement.service.impl;

import codegym.csm.model.Customer;
import codegym.csm.repository.CustomerRepository;
import codegym.csm.service.CustomerService;
import com.codegym.springbootjpacustomermanagement.model.Customer;
import com.codegym.springbootjpacustomermanagement.repository.CustomerRepository;
import com.codegym.springbootjpacustomermanagement.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return (List<Customer>)customerRepository.findAll();
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        customerRepository.remove(id);
    }
}
