package com.orient.customerobjectbalance.service;

import com.orient.customerobjectbalance.model.Customer;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public interface CustomerService {

    List<Customer> findAll();
    Customer findById(Long id);
    void create(Customer customer);
    void update(Long id,Customer customer);
    void delete(Long id);
}
