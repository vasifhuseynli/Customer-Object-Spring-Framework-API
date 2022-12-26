package com.orient.customerobjectbalance.model;




import com.fasterxml.jackson.annotation.JsonAutoDetect;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "device")
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String deviceName;
    private String deviceService;
    private Long customer_object_id;

    @OneToMany
    @JoinColumn(name = "device_id")
    private List<DeviceServicePrice> deviceServicePrices = new ArrayList<>();

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", deviceName='" + deviceName + '\'' +
                ", deviceService='" + deviceService + '\'' +
                ", customer_object_id=" + customer_object_id +
                '}';
    }

    public Long getCustomer_object_id() {
        return customer_object_id;
    }

    public void setCustomer_object_id(Long customer_object_id) {
        this.customer_object_id = customer_object_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceService() {
        return deviceService;
    }

    public void setDeviceService(String deviceService) {
        this.deviceService = deviceService;
    }

    public Device() {
    }

    public Device(Long id, String deviceName, String deviceService, Long customer_object_id) {
        this.id = id;
        this.deviceName = deviceName;
        this.deviceService = deviceService;
        this.customer_object_id = customer_object_id;
    }
}
