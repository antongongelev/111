package com.example.application.Services;

import com.example.application.domain.Option;
import com.example.application.repos.OptionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OptionService {

    @Autowired
    private OptionRepo optionRepo;

    public Iterable<Option> getAllOptions() {
        return optionRepo.findAll();
    }

    public Option create(Option option) {
        return optionRepo.save(option);
    }

    public Option update(Option option) {
        return optionRepo.save(option);
    }

    public Iterable<Option> delete(Option option) {
        optionRepo.delete(option);
        return optionRepo.findAll();
    }
}
