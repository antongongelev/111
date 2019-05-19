package com.example.application.repos;

import com.example.application.domain.Tariff;
import org.springframework.data.repository.CrudRepository;

public interface TariffRepo extends CrudRepository<Tariff, Long> {
}
