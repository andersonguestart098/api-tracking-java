package com.example.estudoTracking.mapper;

import com.example.estudoTracking.DTO.LogisticaRequestDTO;
import com.example.estudoTracking.DTO.LogisticaResponseDTO;
import com.example.estudoTracking.model.Logistica;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LogisticaMapper {

    Logistica toEntity(LogisticaRequestDTO dto);

    LogisticaResponseDTO toDTO(Logistica logistica);

}
