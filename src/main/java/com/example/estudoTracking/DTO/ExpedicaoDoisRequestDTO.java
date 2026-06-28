package com.example.estudoTracking.DTO;

import com.example.estudoTracking.enums.TipoExpedicao;

public record ExpedicaoDoisRequestDTO(

        TipoExpedicao expedicao,

        String nuNota

) {}
