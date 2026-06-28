package com.example.estudoTracking.repository;

import com.example.estudoTracking.model.Vendedor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
public interface VendedorRepository extends MongoRepository<Vendedor, String> {
    Optional<Vendedor> findByCodVend(String codVend);
    Page<Vendedor> findAll(Pageable pageable);

}
