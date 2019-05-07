package com.example.application;

import com.example.application.domain.Client;
import com.example.application.repos.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin
public class ClientController {
    @Autowired
    private ClientRepo clientRepo;

    @GetMapping("/clients/get-all")
    @ResponseBody
    public Iterable<Client> add() {
        return clientRepo.findAll();
    }

    @PostMapping("/clients/create")
    @ResponseBody
    public Client create(@RequestBody(required = false) Client client) {
        return clientRepo.save(client);

    }

}