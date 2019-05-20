package com.example.application.Controllers;


import com.example.application.Services.TariffService;
import com.example.application.domain.Tariff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin
public class TariffController {

    @Autowired
    private TariffService tariffService;

    @GetMapping("/tariffs/get-all")
    @ResponseBody
    public Iterable<Tariff> get() {
        return tariffService.getAllTariffs();
    }

    @PostMapping("/tariffs/create")
    @ResponseBody
    public Tariff create(@RequestBody(required = false) Tariff tariff) {
        return tariffService.create(tariff);
    }

    @PostMapping("tariffs/update")
    @ResponseBody
    public Tariff update(@RequestBody(required = false) Tariff tariff) {
        return tariffService.update(tariff);
    }

    @PostMapping("tariffs/delete")
    @ResponseBody
    public Iterable<Tariff> delete(@RequestBody(required = false) Tariff tariff) {
        return tariffService.delete(tariff);
    }
}
