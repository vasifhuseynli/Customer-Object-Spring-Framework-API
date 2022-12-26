package com.orient.customerobjectbalance.model;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "device_service")
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class DeviceServicePrice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String period;
    private String price;
    private Long device_id;

    @Override
    public String toString() {
        return "DeviceServicePriceRepository{" +
                "id=" + id +
                ", period='" + period + '\'' +
                ", price='" + price + '\'' +
                ", device_id='" + device_id + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Long getDevice_id() {
        return device_id;
    }

    public void setDevice_id(Long device_id) {
        this.device_id = device_id;
    }

    public DeviceServicePrice(Long id, String period, String price, Long device_id) {
        this.id = id;
        this.period = period;
        this.price = price;
        this.device_id = device_id;
    }

    public DeviceServicePrice() {
    }
}
