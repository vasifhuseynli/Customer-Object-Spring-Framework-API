package com.orient.customerobjectbalance.service.impl;

import com.orient.customerobjectbalance.model.CustomerObject;
import com.orient.customerobjectbalance.repository.ICustomerObjectRepository;
import com.orient.customerobjectbalance.service.ICustomerObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerObjectServiceImpl implements ICustomerObjectService {

    @Autowired
    ICustomerObjectRepository ICustomerObjectRepository;


    @Override
    public List<CustomerObject> findAll() {
        List<CustomerObject> customerObjects = ICustomerObjectRepository.findAll();
        return customerObjects;
    }

    @Override
    public CustomerObject findById(Long id) {
        return ICustomerObjectRepository.findById(id).get();
    }

    @Override
    public void create(CustomerObject customerObject) {
        CustomerObject object = new CustomerObject();
        object.setCustomer_object_code(customerObject.getCustomer_object_code());
        object.setCustomer_object_adress(customerObject.getCustomer_object_adress());
        object.setCustomer_id(customerObject.getCustomer_id());
        ICustomerObjectRepository.save(object);

    }

    @Override
    public void update(Long id, CustomerObject customerObject) {
        CustomerObject oldObject = findById(id);
        oldObject.setCustomer_object_code(customerObject.getCustomer_object_code());
        oldObject.setCustomer_object_adress(customerObject.getCustomer_object_adress());
        oldObject.setCustomer_id(customerObject.getCustomer_id());
        ICustomerObjectRepository.save(oldObject);


    }

    @Override
    public void delete(Long id) {
        CustomerObject customerObject=findById(id);
        if(customerObject!=null){
            ICustomerObjectRepository.delete(customerObject);
        }

    }
}
