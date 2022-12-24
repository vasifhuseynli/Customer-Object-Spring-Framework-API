package com.orient.customerobjectbalance.service;

import com.orient.customerobjectbalance.model.DeviceServicePrice;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DeviceServicePriceService {

    List<DeviceServicePrice> findAll();

    DeviceServicePrice findById(Long id);

    void create(DeviceServicePrice deviceServicePrice);

    void update(Long id, DeviceServicePrice deviceServicePrice);

    void delete(Long id);
}
