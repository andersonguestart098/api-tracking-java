package com.example.estudoTracking.service;

import com.example.estudoTracking.DTO.SolicitacaoRequestDTO;
import com.example.estudoTracking.DTO.SolicitacaoResponseDTO;
import com.example.estudoTracking.exception.RecursoNaoEncontrado;
import com.example.estudoTracking.mapper.SolicitacaoMapper;
import com.example.estudoTracking.model.Solicitacao;
import com.example.estudoTracking.repository.SolicitacaoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SolicitacaoService {

    private final SolicitacaoRepository solicitacaoRepository;

    private final SolicitacaoMapper solicitacaoMapper;


    public SolicitacaoResponseDTO solicitar(SolicitacaoRequestDTO dto) {

        Solicitacao solicitacao = solicitacaoMapper.toEntity(dto);

        Solicitacao solicitacaoSalva = solicitacaoRepository.save(solicitacao);

        return solicitacaoMapper.toDTO(solicitacaoSalva);


    }

    public Page<SolicitacaoResponseDTO> listar(Pageable pageable) {

        return solicitacaoRepository.findAll(pageable)
                .map(solicitacaoMapper::toDTO);

    }

    public SolicitacaoResponseDTO buscar(String nuNota) {

        return solicitacaoRepository.findByNunNota(nuNota)
                .map(solicitacaoMapper::toDTO)
                .orElseThrow(() -> new RecursoNaoEncontrado("Solicitação não encontrada para nunota informado!"));

    }




}
