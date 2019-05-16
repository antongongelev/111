package com.example.application.domain;

import javax.persistence.*;

@Entity
@Table(name = "phone_numbers")
public class PhoneNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;
    private String phoneNumber;
    @OneToOne(optional = false)
    @JoinColumn(name = "contract_id", unique = true, nullable = false, updatable = false)
    private Contract contract;

    public PhoneNumber() {
    }

    public PhoneNumber(String phoneNumber, Contract contract) {
        this.phoneNumber = phoneNumber;
        this.contract = contract;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }
}
