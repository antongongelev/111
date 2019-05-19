package com.example.application.repos;

import com.example.application.domain.Client;
import org.springframework.data.repository.CrudRepository;


public interface ClientRepo extends CrudRepository<Client, Long> {

}
