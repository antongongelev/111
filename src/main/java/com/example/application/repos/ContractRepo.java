package com.example.application.repos;

import com.example.application.domain.Contract;
import org.springframework.data.repository.CrudRepository;

public interface ContractRepo extends CrudRepository <Contract, Long>{

}
