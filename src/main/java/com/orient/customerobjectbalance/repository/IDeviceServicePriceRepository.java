package com.orient.customerobjectbalance.repository;

import com.orient.customerobjectbalance.model.DeviceServicePrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDeviceServicePriceRepository extends JpaRepository<DeviceServicePrice, Long> {
}
