package com.example.estudoTracking.mapper;

import com.example.estudoTracking.DTO.FinanceiroRequestDTO;
import com.example.estudoTracking.DTO.SolicitacaoResponseDTO;
import com.example.estudoTracking.model.Solicitacao;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FinanceiroMapper {

    Solicitacao toEntity(FinanceiroRequestDTO dto);

    SolicitacaoResponseDTO toDTO(Solicitacao solicitacao);

}
