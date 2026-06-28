package com.example.estudoTracking.service;

import com.example.estudoTracking.DTO.ExpedicaoUmRequestDTO;
import com.example.estudoTracking.DTO.ExpedicaoUmResponseDTO;
import com.example.estudoTracking.DTO.FinanceiroRequestDTO;
import com.example.estudoTracking.DTO.SolicitacaoResponseDTO;
import com.example.estudoTracking.enums.TipoExpedicao;
import com.example.estudoTracking.exception.RecursoNaoEncontrado;
import com.example.estudoTracking.mapper.ExpedicaoUmMapper;
import com.example.estudoTracking.mapper.FinanceiroMapper;
import com.example.estudoTracking.model.ExpedicaoUm;
import com.example.estudoTracking.model.Solicitacao;
import com.example.estudoTracking.repository.ExpedicaoRepository;
import com.example.estudoTracking.repository.SolicitacaoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@RequiredArgsConstructor
@Service
public class FinanceiroService {

    private final SolicitacaoRepository solicitacaoRepository;

    private final FinanceiroMapper financeiroMapper;

    private final ExpedicaoUmMapper expedicaoUmMapper;

    private final ExpedicaoRepository expedicaoRepository;

    @Transactional
    public SolicitacaoResponseDTO preencher(FinanceiroRequestDTO dto, String nuNota) {


            Solicitacao solicitacao = solicitacaoRepository.findByNunNota(nuNota)
                .orElseThrow(() -> new RecursoNaoEncontrado("Solicitacao não encontrada!"));

                solicitacao.setObs(dto.obs());
                solicitacao.setNf(dto.nf());
                solicitacao.setExpedicao(dto.expedicao());


            Solicitacao solicitacaoSalva = solicitacaoRepository.save(solicitacao);

            return financeiroMapper.toDTO(solicitacaoSalva);

    }

    @Transactional
    public ExpedicaoUmResponseDTO criar(ExpedicaoUmRequestDTO dto, String nuNota) {

        Solicitacao solEncontrada = solicitacaoRepository.findByNunNota(nuNota)
                .orElseThrow(() -> new RecursoNaoEncontrado("Nunota não encontrado!"));

        log.info("Solicitação encontrada para o nunota: {}", solEncontrada);

        ExpedicaoUm exp = expedicaoUmMapper.toEntity(dto);

        if (dto.expedicao().equals(TipoExpedicao.EXPEDICAO)) {

        exp.setExpedicao(dto.expedicao());
        exp.setNuNota(nuNota);

        expedicaoRepository.save(exp);

        }

        return expedicaoUmMapper.toDTO(exp);


    }

}
