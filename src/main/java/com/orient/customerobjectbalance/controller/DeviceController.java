package com.orient.customerobjectbalance.controller;

import com.orient.customerobjectbalance.model.Device;
import com.orient.customerobjectbalance.service.IDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/device")
public class DeviceController {

    @Autowired
    IDeviceService deviceService;

    @GetMapping(value = "/all")
    public List<Device> findAll() {
        return deviceService.findAll();
    }

    @GetMapping(value = "/findById/{id}")
    public Device findById(@PathVariable Long id) {
        return deviceService.findById(id);
    }

    @PostMapping(value = "/create")
    public void create(@RequestBody Device device) {
        deviceService.create(device);
    }

    @PutMapping(value = "/update/{id}")
    public void update(@PathVariable Long id, @RequestBody Device device) {
        deviceService.update(id, device);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable Long id) {
        deviceService.delete(id);
    }
}
