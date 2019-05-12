package com.example.application.domain;

import javax.persistence.*;

@Entity
public class Option {

    private Long id;
    private String name;
    private Integer payment;
    private Integer price;


    public Option(Long id, String name, Integer payment, Integer price) {
        this.id = id;
        this.name = name;
        this.payment = payment;
        this.price = price;
    }

    public Option() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPayment() {
        return payment;
    }

    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
