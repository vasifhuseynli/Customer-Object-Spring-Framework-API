package com.orient.customerobjectbalance.controller;

import com.orient.customerobjectbalance.model.Customer;
import com.orient.customerobjectbalance.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping(value = "/all")
    public List<Customer> findAll() {
        return customerService.findAll();
    }

    @GetMapping(value = "/findId/{id}")
    public Customer findById(@PathVariable Long id) {
        return customerService.findById(id);
    }

    @PostMapping(value = "/create")
    public void create(@RequestBody Customer customer) {
        customerService.create(customer);
    }

    @PutMapping(value = "/update/{id}")
    public void update(@PathVariable Long id, @RequestBody Customer customer) {
        customerService.update(id, customer);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable Long id) {
        customerService.delete(id);
    }
}
