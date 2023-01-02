package com.orient.customerobjectbalance.service;

import com.orient.customerobjectbalance.model.CustomerObject;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICustomerObjectService {

    List<CustomerObject> findAll();
    CustomerObject findById(Long id);
    void create(CustomerObject CustomerObject);
    void update(Long id, CustomerObject CustomerObject);
    void delete(Long id);
}
