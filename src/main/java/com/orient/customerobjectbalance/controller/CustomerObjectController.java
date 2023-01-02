package com.orient.customerobjectbalance.controller;

import com.orient.customerobjectbalance.model.CustomerObject;
import com.orient.customerobjectbalance.service.ICustomerObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/customer-object")
public class CustomerObjectController {

    @Autowired
    ICustomerObjectService customerObjectService;

    @GetMapping(value = "/all")
    public List<CustomerObject> findAll() {
        return customerObjectService.findAll();
    }

    @GetMapping(value = "/findById/{id}")
    public CustomerObject findById(@PathVariable Long id) {
        return customerObjectService.findById(id);
    }

    @PostMapping(value = "/create")
    public void create(@RequestBody CustomerObject customerObject) {
        customerObjectService.create(customerObject);
    }

    @PutMapping(value = "/update/{id}")
    public void update(@PathVariable Long id, @RequestBody CustomerObject customerObject) {
        customerObjectService.update(id, customerObject);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable Long id) {
        customerObjectService.delete(id);
    }
}
