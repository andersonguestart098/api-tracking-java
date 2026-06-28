package com.example.estudoTracking.DTO;

import com.example.estudoTracking.enums.TipoExpedicao;

public record FinanceiroRequestDTO(

        String nuNota,
        String obs,
        String nf,
        TipoExpedicao expedicao

) {}
