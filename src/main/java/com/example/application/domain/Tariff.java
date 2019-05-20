package com.example.application.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "tariffs")
public class Tariff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;


    @ManyToMany
    @JoinTable(name = "tariff_option",
            joinColumns = @JoinColumn(name = "tariff_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "option_id", referencedColumnName = "id"))
    @JsonIgnore
    private Set<Option> avaliableOptions;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "tariff")
    @JsonIgnore
    private Set<Contract> contracts;

    private String name;
    private Integer payment;

    public Tariff(Set<Option> avaliableOptions, Set<Contract> contracts, String name, Integer payment) {
        this.avaliableOptions = avaliableOptions;
        this.contracts = contracts;
        this.name = name;
        this.payment = payment;
    }

    public Tariff() {
    }


    public Set<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Set<Contract> contracts) {
        this.contracts = contracts;
    }

    public Set<Option> getAvaliableOptions() {
        return avaliableOptions;
    }

    public void setAvaliableOptions(Set<Option> avaliableOptions) {
        this.avaliableOptions = avaliableOptions;
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

}
