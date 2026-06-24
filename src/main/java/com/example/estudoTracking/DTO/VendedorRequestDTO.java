package com.example.estudoTracking.DTO;

import com.example.estudoTracking.enums.TipoVendedor;

public record VendedorRequestDTO(

        String apelido,
        TipoVendedor tipo

) {}
