package com.example.estudoTracking.DTO;

import com.example.estudoTracking.enums.TipoExpedicao;

import java.time.LocalDateTime;

public record LogisticaRequestDTO(

        TipoExpedicao expedicao,
        LocalDateTime dataEntrega

) {}
