package com.example.estudoTracking.repository;

import com.example.estudoTracking.model.ExpedicaoDois;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpedicaoDoisRepository extends MongoRepository<ExpedicaoDois, String> {

}