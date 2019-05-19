package com.example.application.Controllers;

import com.example.application.Services.ContractService;
import com.example.application.domain.Contract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin
public class ContractController {

    @Autowired
    private ContractService contractService;


    @GetMapping("/contracts/get-all")
    @ResponseBody
    public Iterable<Contract> get() {
        return contractService.getAllContracts();
    }

    @PostMapping("/contracts/create")
    @ResponseBody
    public Contract create(@RequestBody(required = false) Contract contract) {
        return contractService.create(contract);
    }

    @PostMapping("contracts/update")
    @ResponseBody
    public Contract update(@RequestBody (required = false)Contract contract){
        return contractService.update(contract);
    }

    @PostMapping("contracts/delete")
    @ResponseBody
    public Iterable<Contract> delete(@RequestBody (required = false) Contract contract){
        return contractService.delete(contract);
    }

}
