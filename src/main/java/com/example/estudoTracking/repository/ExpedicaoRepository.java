package com.example.estudoTracking.repository;

import com.example.estudoTracking.model.ExpedicaoUm;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpedicaoRepository extends MongoRepository<ExpedicaoUm, String> {

}
