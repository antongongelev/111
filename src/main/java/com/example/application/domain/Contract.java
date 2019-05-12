package com.example.application.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "phoneNumber", unique = true, nullable = false)
    private String phoneNumber;

    private Tariff tariff;
    private List<Option> chosenOptions;


    public Contract(String phoneNumber, Tariff tariff, List<Option> options) {
        this.phoneNumber = phoneNumber;
        this.tariff = tariff;
        this.chosenOptions = options;
    }

    public Contract() {

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Tariff getTariff() {
        return tariff;
    }

    public void setTariff(Tariff tariff) {
        this.tariff = tariff;
    }

    public List<Option> getChosenOptions() {
        return chosenOptions;
    }

    public void setChosenOptions(List<Option> options) {
        this.chosenOptions = options;
    }


}
