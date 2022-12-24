package com.orient.customerobjectbalance.service.impl;

import com.orient.customerobjectbalance.model.Customer;
import com.orient.customerobjectbalance.repository.CustomerRepository;
import com.orient.customerobjectbalance.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public void create(Customer customer) {
        Customer newCustomer = new Customer();
        newCustomer.setDiller(customer.getDiller());
        newCustomer.setName(customer.getName());
        newCustomer.setVoen(customer.getVoen());
        newCustomer.setAdress(customer.getAdress());
        newCustomer.setPhone(customer.getPhone());
        newCustomer.setBalance(customer.getBalance());
        customerRepository.save(newCustomer);

    }

    @Override
    public void update(Long id, Customer customer) {
        Customer oldCustomer = findById(id);
        oldCustomer.setDiller(customer.getDiller());
        oldCustomer.setName(customer.getName());
        oldCustomer.setVoen(customer.getVoen());
        oldCustomer.setAdress(customer.getAdress());
        oldCustomer.setPhone(customer.getPhone());
        oldCustomer.setBalance(customer.getBalance());
        customerRepository.save(oldCustomer);


    }

    @Override
    public void delete(Long id) {
        Customer customer = findById(id);
        if (customer != null) {
            customerRepository.delete(customer);
        }

    }
}
