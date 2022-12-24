package com.orient.customerobjectbalance.service;

import com.orient.customerobjectbalance.model.Device;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DeviceService {

    List<Device> findAll();

    Device findById(Long id);

    void create(Device device);

    void update(Long id, Device device);

    void delete(Long id);
}
