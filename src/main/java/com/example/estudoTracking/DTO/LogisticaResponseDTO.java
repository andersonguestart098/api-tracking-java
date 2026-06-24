package com.example.estudoTracking.DTO;

import com.example.estudoTracking.enums.TipoExpedicao;

import java.time.LocalDateTime;

public record LogisticaResponseDTO(

        LocalDateTime timesTamp,
        TipoExpedicao expedicao,
        String obs,
        LocalDateTime dataEntrega

) {
}
