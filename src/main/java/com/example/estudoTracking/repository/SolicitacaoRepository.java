package com.example.estudoTracking.repository;

import com.example.estudoTracking.model.Solicitacao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SolicitacaoRepository extends MongoRepository<Solicitacao, String> {
    Optional<Solicitacao> findByNunNota(String nuNota);
    Page<Solicitacao> findAll(Pageable pageable);

}
