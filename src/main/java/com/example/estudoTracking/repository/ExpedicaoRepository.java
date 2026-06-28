package com.example.estudoTracking.repository;

import com.example.estudoTracking.model.ExpedicaoUm;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExpedicaoRepository extends MongoRepository<ExpedicaoUm, String> {
    Optional<ExpedicaoUm> findByNuNota(String nuNota);

}
