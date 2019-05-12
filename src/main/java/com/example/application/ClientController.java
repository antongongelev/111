package com.example.application;

import com.example.application.domain.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin
public class ClientController {
    @Autowired
    private ClientService clientService;


    @GetMapping("/clients/get-all")
    @ResponseBody
    public Iterable<Client> get() {
        return clientService.getAllClients();
    }

    @PostMapping("/clients/create")
    @ResponseBody
    public Client create(@RequestBody(required = false) Client client) {
        return clientService.create(client);
    }

    @PostMapping("clients/update")
    @ResponseBody
    public Client update(@RequestBody (required = false) Client client){
        return clientService.update(client);
    }

    @PostMapping("clients/delete")
    @ResponseBody
    public Iterable<Client> delete(@RequestBody (required = false) Client client){
         return clientService.delete(client);
    }


}