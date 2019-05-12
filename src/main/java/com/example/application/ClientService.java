package com.example.application;

import com.example.application.domain.Client;
import com.example.application.repos.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


@Service
public class ClientService {

    @Autowired
    private ClientRepo clientRepo;


    public Iterable<Client> getAllClients() {
        return clientRepo.findAll();
    }

    public Client create(@RequestBody(required = false) Client client) {
        return clientRepo.save(client);
    }

    public Client update(@RequestBody(required = false) Client client) {
        Client removeClient = clientRepo.findById(client.getId()).get(0);
        clientRepo.delete(removeClient);
        return clientRepo.save(client);
    }

    public Iterable<Client> delete(@RequestBody(required = false) Client client) {
        clientRepo.delete(client);
        return clientRepo.findAll();
    }
}
