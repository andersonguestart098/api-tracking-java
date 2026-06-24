package com.example.estudoTracking.repository;

import com.example.estudoTracking.model.Solicitacao;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolicitacaoRepository extends MongoRepository<Solicitacao, String> {

}
