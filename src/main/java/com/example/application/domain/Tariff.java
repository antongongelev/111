package com.example.application.domain;


import javax.persistence.*;
import java.util.List;

@Entity
public class Tariff {

    private String name;
    private Integer payment;
    private List<Option> options;

    public Tariff(String name, Integer payment, List<Option> options) {
        this.name = name;
        this.payment = payment;
        this.options = options;
    }

    public Tariff() {
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

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }
}
