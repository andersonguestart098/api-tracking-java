package com.example.estudoTracking.repository;

import com.example.estudoTracking.model.Vendedor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendedorRepository extends MongoRepository<Vendedor, String> {

}
