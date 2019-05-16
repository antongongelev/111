package com.example.application.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "contracts")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @OneToOne(optional = false, mappedBy = "contract")
    private PhoneNumber phoneNumber;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "tariff_id", nullable = false)
    private Tariff tariff;

    @OneToMany
    @JoinTable(name = "options_contracts",
            joinColumns = @JoinColumn(name = "option_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "contract_id", referencedColumnName = "id"))
    private Set<Option> chosenOptions;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    public Contract() {
    }

    public Contract(PhoneNumber phoneNumber, Tariff tariff, Set<Option> chosenOptions, Client client) {
        this.phoneNumber = phoneNumber;
        this.tariff = tariff;
        this.chosenOptions = chosenOptions;
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Tariff getTariff() {
        return tariff;
    }

    public void setTariff(Tariff tariff) {
        this.tariff = tariff;
    }

    public Set<Option> getChosenOptions() {
        return chosenOptions;
    }

    public void setChosenOptions(Set<Option> chosenOptions) {
        this.chosenOptions = chosenOptions;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
