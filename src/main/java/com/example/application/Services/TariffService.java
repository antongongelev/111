package com.example.application.Services;


import com.example.application.domain.Tariff;
import com.example.application.repos.TariffRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TariffService {


    @Autowired
    private TariffRepo tariffRepo;

    public Iterable<Tariff> getAllTariffs() {
        return tariffRepo.findAll();
    }

    public Tariff create(Tariff tariff) {
        return tariffRepo.save(tariff);
    }

    public Tariff update(Tariff tariff) {
        return tariffRepo.save(tariff);
    }

    public Iterable<Tariff> delete(Tariff tariff) {
        tariffRepo.delete(tariff);
        return tariffRepo.findAll();
    }
}
