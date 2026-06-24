package com.example.estudoTracking.mapper;

import com.example.estudoTracking.DTO.ExpedicaoUmRequestDTO;
import com.example.estudoTracking.DTO.ExpedicaoUmResponseDTO;
import com.example.estudoTracking.model.ExpedicaoUm;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ExpedicaoUmMapper {

    ExpedicaoUm toEntity(ExpedicaoUmRequestDTO dto);

    ExpedicaoUmResponseDTO toDTO(ExpedicaoUm expedicaoUm);

}
