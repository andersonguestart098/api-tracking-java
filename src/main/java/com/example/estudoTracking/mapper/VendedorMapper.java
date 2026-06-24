package com.example.estudoTracking.mapper;


import com.example.estudoTracking.DTO.VendedorRequestDTO;
import com.example.estudoTracking.DTO.VendedorResponseDTO;
import com.example.estudoTracking.model.Vendedor;
import org.mapstruct.Mapper;

@Mapper(componentModel = "string")
public interface VendedorMapper {

    Vendedor toEntity(VendedorRequestDTO dto);

    VendedorResponseDTO toDTO(Vendedor vendedor);

}
