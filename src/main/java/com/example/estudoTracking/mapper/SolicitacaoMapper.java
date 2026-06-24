package com.example.estudoTracking.mapper;

import com.example.estudoTracking.DTO.SolicitacaoRequestDTO;
import com.example.estudoTracking.DTO.SolicitacaoResponseDTO;
import com.example.estudoTracking.model.Solicitacao;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SolicitacaoMapper {

    Solicitacao toEntity(SolicitacaoRequestDTO dto);

    SolicitacaoResponseDTO toDTO(Solicitacao solicitacao);

}
