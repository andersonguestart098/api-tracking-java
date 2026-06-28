package com.example.estudoTracking.DTO;

import com.example.estudoTracking.enums.TipoExpedicao;

public record ExpedicaoUmRequestDTO(

        TipoExpedicao expedicao,

        String nuNota

) {}
