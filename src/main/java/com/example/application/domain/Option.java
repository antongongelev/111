package com.example.application.domain;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "options")
public class Option {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "avaliableOptions")
    private Set<Tariff> tariffs;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "chosenOptions")
    private Set<Contract> contracts;

    private String name;
    private Integer payment;
    private Integer price;


    public Option() {
    }

    public Option(Set<Tariff> tariffs, Set<Contract> contracts, String name, Integer payment, Integer price) {
        this.tariffs = tariffs;
        this.contracts = contracts;
        this.name = name;
        this.payment = payment;
        this.price = price;
    }

    public Set<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Set<Contract> contracts) {
        this.contracts = contracts;
    }

    public Set<Tariff> getTariffs() {
        return tariffs;
    }

    public void setTariffs(Set<Tariff> tariffs) {
        this.tariffs = tariffs;
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
