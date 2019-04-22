package com.example.application;

import com.example.application.domain.Client;
import com.example.application.domain.Message;
import com.example.application.repos.ClientRepo;
import com.example.application.repos.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@CrossOrigin
public class GreetingController {
    @Autowired
    private ClientRepo clientRepo;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
                           Map<String, Object> model) {
        model.put("name", name);
        return "greeting";
    }

//    @GetMapping("/")
//    public String main(Map<String, Object> model) {
//        Iterable<Message> messages = messageRepo.findAll();
//        model.put("messages", messages);
//        return "main";
//    }

    @GetMapping("/")
    @ResponseBody
    public Iterable<Client> add() {
        return clientRepo.findAll();
    }

}