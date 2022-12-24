package com.orient.customerobjectbalance.controller;

import com.orient.customerobjectbalance.model.DeviceServicePrice;
import com.orient.customerobjectbalance.service.DeviceServicePriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/device-service-price")
public class DeviceServicePriceController {

    @Autowired
    DeviceServicePriceService deviceServicePriceService;

    @GetMapping(value = "/all")
    public List<DeviceServicePrice> findAll() {
        return deviceServicePriceService.findAll();
    }

    @GetMapping(value = "/findById/{id}")
    public DeviceServicePrice findById(@PathVariable Long id) {
        return deviceServicePriceService.findById(id);
    }

    @PostMapping(value = "/create")
    public void create(@RequestBody DeviceServicePrice deviceServicePrice) {
        deviceServicePriceService.create(deviceServicePrice);
    }

    @PutMapping(value = "/update/{id}")
    public void update(@PathVariable Long id, @RequestBody DeviceServicePrice deviceServicePrice) {
        deviceServicePriceService.update(id, deviceServicePrice);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable Long id) {
        deviceServicePriceService.delete(id);
    }
}
