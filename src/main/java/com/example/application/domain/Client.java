package com.example.application.domain;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    private String firstName;
    private String secondName;
    private String birthDate;
    private String passportInfo;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "client")
    private Set<Contract> contracts;

    private String address;
    @Column(name = "email", unique = true, nullable = false)
    private String email;
    private String password;

    public Client(String firstName, String secondName, String birthDate, String passportInfo,
                  Set<Contract> contracts, String address, String email, String password) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthDate = birthDate;
        this.passportInfo = passportInfo;
        this.contracts = contracts;
        this.address = address;
        this.email = email;
        this.password = password;
    }

    public Client() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Set<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Set<Contract> contracts) {
        this.contracts = contracts;
    }

    public String getPassportInfo() {
        return passportInfo;
    }

    public void setPassportInfo(String passportInfo) {
        this.passportInfo = passportInfo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
