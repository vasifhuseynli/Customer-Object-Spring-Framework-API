package com.orient.customerobjectbalance.service.impl;

import com.orient.customerobjectbalance.model.Device;
import com.orient.customerobjectbalance.repository.IDeviceRepository;
import com.orient.customerobjectbalance.service.IDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceServiceImpl implements IDeviceService {

    @Autowired
    IDeviceRepository deviceRepository;

    @Override
    public List<Device> findAll() {
        return deviceRepository.findAll();
    }

    @Override
    public Device findById(Long id) {
        return deviceRepository.findById(id).get();
    }

    @Override
    public void create(Device device) {
        Device newDevice = new Device();
        newDevice.setDeviceName(device.getDeviceName());
        newDevice.setDeviceService(device.getDeviceService());
        newDevice.setCustomer_object_id(device.getCustomer_object_id());
        deviceRepository.save(newDevice);

    }

    @Override
    public void update(Long id, Device device) {
        Device oldDevice = findById(id);
        oldDevice.setDeviceName(device.getDeviceName());
        oldDevice.setDeviceService(device.getDeviceService());
        oldDevice.setCustomer_object_id(device.getCustomer_object_id());
        deviceRepository.save(oldDevice);

    }

    @Override
    public void delete(Long id) {
        Device device = findById(id);
        if (device != null) {
            deviceRepository.delete(device);
        }

    }
}
