package com.example.application.repos;

import com.example.application.domain.Option;
import org.springframework.data.repository.CrudRepository;

public interface OptionRepo extends CrudRepository<Option, Long> {
}
