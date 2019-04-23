package com.example.application.repos;

import com.example.application.domain.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClientRepo extends CrudRepository<Client, Integer> {
    List<Client> findById(Number id);
}
