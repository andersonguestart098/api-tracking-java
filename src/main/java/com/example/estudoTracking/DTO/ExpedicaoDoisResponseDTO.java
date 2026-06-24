package com.example.estudoTracking.DTO;

import com.example.estudoTracking.enums.TipoExpedicao;

import java.time.LocalDateTime;

public record ExpedicaoDoisResponseDTO(

        LocalDateTime timesTamp,
        TipoExpedicao expedicao,
        String obs

) {}
