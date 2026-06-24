package com.example.estudoTracking.repository;

import com.example.estudoTracking.model.Logistica;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogisticaRepository extends MongoRepository<Logistica, String> {

}
