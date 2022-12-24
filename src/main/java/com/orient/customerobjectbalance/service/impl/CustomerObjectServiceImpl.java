package com.orient.customerobjectbalance.service.impl;

import com.orient.customerobjectbalance.model.CustomerObject;
import com.orient.customerobjectbalance.repository.CustomerObjectRepository;
import com.orient.customerobjectbalance.service.CustomerObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerObjectServiceImpl implements CustomerObjectService {

    @Autowired
    CustomerObjectRepository customerObjectRepository;


    @Override
    public List<CustomerObject> findAll() {
        List<CustomerObject> customerObjects = customerObjectRepository.findAll();
        return customerObjects;
    }

    @Override
    public CustomerObject findById(Long id) {
        return customerObjectRepository.findById(id).get();
    }

    @Override
    public void create(CustomerObject customerObject) {
        CustomerObject object = new CustomerObject();
        object.setCustomer_object_code(customerObject.getCustomer_object_code());
        object.setCustomer_object_adress(customerObject.getCustomer_object_adress());
        object.setCustomer_id(customerObject.getCustomer_id());
        customerObjectRepository.save(object);

    }

    @Override
    public void update(Long id, CustomerObject customerObject) {
        CustomerObject oldObject = findById(id);
        oldObject.setCustomer_object_code(customerObject.getCustomer_object_code());
        oldObject.setCustomer_object_adress(customerObject.getCustomer_object_adress());
        oldObject.setCustomer_id(customerObject.getCustomer_id());
        customerObjectRepository.save(oldObject);


    }

    @Override
    public void delete(Long id) {
        CustomerObject customerObject=findById(id);
        if(customerObject!=null){
            customerObjectRepository.delete(customerObject);
        }

    }
}
