package com.example.estudoTracking.model;

import com.example.estudoTracking.enums.TipoExpedicao;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.time.LocalDate;

@Data
public class Financeiro {

    @NotBlank(message = "Nunota não preenchido!")
    private String nuNota;

    private LocalDate data;

    private String obs;

    @NotBlank(message = "Nf não preenchida!")
    private String nf;

    @NotEmpty(message = "Expedição não definida!")
    private TipoExpedicao expedicao;

}
