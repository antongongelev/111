package com.example.application.Services;

import com.example.application.domain.Contract;
import com.example.application.repos.ContractRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ContractService {

    @Autowired
    private ContractRepo contractRepo;


    public Iterable<Contract> getAllContracts() {
        return contractRepo.findAll();
    }

    public Contract create(Contract contract) {
        return contractRepo.save(contract);
    }

    public Contract update(Contract contract) {
        return contractRepo.save(contract);
    }

    public Iterable<Contract> delete(Contract contract) {
        contractRepo.delete(contract);
        return contractRepo.findAll();
    }
}
