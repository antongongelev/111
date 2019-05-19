package com.example.application.Services;

import com.example.application.domain.Client;
import com.example.application.repos.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClientService {

    @Autowired
    private ClientRepo clientRepo;


    public Iterable<Client> getAllClients() {
        return clientRepo.findAll();
    }

    public Client create(Client client) {
        return clientRepo.save(client);
    }

    public Client update(Client client) {
        return clientRepo.save(client);
    }

    public Iterable<Client> delete(Client client) {
        clientRepo.delete(client);
        return clientRepo.findAll();
    }
}
