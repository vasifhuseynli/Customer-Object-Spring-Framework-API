package com.orient.customerobjectbalance.repository;

import com.orient.customerobjectbalance.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDeviceRepository extends JpaRepository<Device, Long> {
}
