package com.example.estudoTracking.DTO;

import com.example.estudoTracking.enums.TipoExpedicao;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record SolicitacaoResponseDTO(

        LocalDateTime timestamp,
        String codVend,
        String nuNota,
        BigDecimal valor,
        String formaPgto,
        TipoExpedicao entregaRetira,
        LocalDateTime dataEntrega,
        String obs,
        String nf,
        TipoExpedicao expedicao

) {}
