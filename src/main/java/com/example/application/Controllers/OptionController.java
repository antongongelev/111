package com.example.application.Controllers;


import com.example.application.Services.OptionService;
import com.example.application.domain.Option;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin
public class OptionController {


    @Autowired
    OptionService optionService;

    @GetMapping("/options/get-all")
    @ResponseBody
    public Iterable<Option> get() {
        return optionService.getAllOptions();
    }

    @PostMapping("/options/create")
    @ResponseBody
    public Option create(@RequestBody(required = false) Option option) {
        return optionService.create(option);
    }

    @PostMapping("options/update")
    @ResponseBody
    public Option update(@RequestBody(required = false) Option option) {
        return optionService.update(option);
    }

    @PostMapping("options/delete")
    @ResponseBody
    public Iterable<Option> delete(@RequestBody(required = false) Option option) {
        return optionService.delete(option);
    }
}
