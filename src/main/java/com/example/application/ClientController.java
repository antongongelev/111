package com.example.application;

import com.example.application.domain.Client;
import com.example.application.repos.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
public class ClientController {
    @Autowired
    private ClientRepo clientRepo;

    @GetMapping("/")
    @ResponseBody
    public Iterable<Client> add() {
        return clientRepo.findAll();
    }

}