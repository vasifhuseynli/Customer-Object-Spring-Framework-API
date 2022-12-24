package com.orient.customerobjectbalance.service.impl;

import com.orient.customerobjectbalance.model.DeviceServicePrice;
import com.orient.customerobjectbalance.repository.DeviceServicePriceRepository;
import com.orient.customerobjectbalance.service.DeviceServicePriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceServicePriceServiceImpl implements DeviceServicePriceService {

    @Autowired
    DeviceServicePriceRepository deviceServicePriceRepository;

    @Override
    public List<DeviceServicePrice> findAll() {
        return deviceServicePriceRepository.findAll();
    }

    @Override
    public DeviceServicePrice findById(Long id) {
        return deviceServicePriceRepository.findById(id).get();
    }

    @Override
    public void create(DeviceServicePrice deviceServicePrice) {
        DeviceServicePrice newDeviceServicePrice = new DeviceServicePrice();
        newDeviceServicePrice.setPrice(deviceServicePrice.getPrice());
        newDeviceServicePrice.setPeriod(deviceServicePrice.getPeriod());
        newDeviceServicePrice.setDevice_id(deviceServicePrice.getDevice_id());
        deviceServicePriceRepository.save(newDeviceServicePrice);


    }

    @Override
    public void update(Long id, DeviceServicePrice deviceServicePrice) {

        DeviceServicePrice oldDeviceServicePrice = findById(id);
        oldDeviceServicePrice.setPrice(deviceServicePrice.getPrice());
        oldDeviceServicePrice.setPeriod(deviceServicePrice.getPeriod());
        oldDeviceServicePrice.setDevice_id(deviceServicePrice.getDevice_id());
        deviceServicePriceRepository.save(oldDeviceServicePrice);

    }

    @Override
    public void delete(Long id) {

        DeviceServicePrice deviceServicePrice = findById(id);
        deviceServicePriceRepository.delete(deviceServicePrice);

    }
}
