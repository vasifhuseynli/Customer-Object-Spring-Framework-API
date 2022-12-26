package com.orient.customerobjectbalance.model;



import com.fasterxml.jackson.annotation.JsonAutoDetect;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "customer_object")
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class CustomerObject {

    @Id
    @GeneratedValue
    private Long id;
    private String customer_object_code;
    private String customer_object_adress;
    private Long customer_id;

    @OneToMany
    @JoinColumn(name = "customer_object_id")
    private List<Device> devices=new ArrayList<>();

    public CustomerObject(Long id, String customer_object_code, String customer_object_adress, Long customer_id) {
        this.id = id;
        this.customer_object_code = customer_object_code;
        this.customer_object_adress = customer_object_adress;
        this.customer_id = customer_id;
    }

    @Override
    public String toString() {
        return "CustomerObject{" +
                "id=" + id +
                ", customer_object_code='" + customer_object_code + '\'' +
                ", customer_object_adress='" + customer_object_adress + '\'' +
                ", customer_id=" + customer_id +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomer_object_code() {
        return customer_object_code;
    }

    public void setCustomer_object_code(String customer_object_code) {
        this.customer_object_code = customer_object_code;
    }

    public String getCustomer_object_adress() {
        return customer_object_adress;
    }

    public void setCustomer_object_adress(String customer_object_adress) {
        this.customer_object_adress = customer_object_adress;
    }

    public Long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }

    public CustomerObject() {
    }
}
