package com.example.estudoTracking.mapper;

import com.example.estudoTracking.DTO.ExpedicaoDoisRequestDTO;
import com.example.estudoTracking.DTO.ExpedicaoDoisResponseDTO;
import com.example.estudoTracking.model.ExpedicaoDois;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ExpedicaoDoisMapper {

    ExpedicaoDois toEntity(ExpedicaoDoisRequestDTO dto);

    ExpedicaoDoisResponseDTO toDTO(ExpedicaoDois expedicaoDois);

}
