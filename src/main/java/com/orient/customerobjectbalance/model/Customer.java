package com.orient.customerobjectbalance.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "customer")
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String diller;
    private String name;
    private String voen;
    private String adress;
    private String phone;
    private Double balance;

    @OneToMany
    @JoinColumn(name = "customer_id")
    private List<CustomerObject> customerObjects=new ArrayList<>();

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", diller='" + diller + '\'' +
                ", name='" + name + '\'' +
                ", voen='" + voen + '\'' +
                ", adress='" + adress + '\'' +
                ", phone='" + phone + '\'' +
                ", balance=" + balance +
                '}';
    }

    public Customer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDiller() {
        return diller;
    }

    public void setDiller(String diller) {
        this.diller = diller;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoen() {
        return voen;
    }

    public void setVoen(String voen) {
        this.voen = voen;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Customer(Long id, String diller, String name, String voen, String adress, String phone, Double balance) {
        this.id = id;
        this.diller = diller;
        this.name = name;
        this.voen = voen;
        this.adress = adress;
        this.phone = phone;
        this.balance = balance;
    }
}
