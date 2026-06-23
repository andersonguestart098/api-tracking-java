package com.example.estudoTracking.model;

import com.example.estudoTracking.enums.Expedicao;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Document(collection = "Solicitacao")
public class Solicitacao {

    @Id
    private String id;

    private LocalDateTime timestamp;

    @NotBlank(message = "Código do vendedor inválido!")
    private String codVend;

    @NotBlank(message = "Nunota inválido!")
    private String nuNota;

    @Positive(message = "Valor da nota inválido!")
    private double valor;

    @NotBlank(message = "Forma de pagamento inválido!")
    private String formaPgto;

    @NotBlank(message = "Entrega/Retirada")
    private String entregaRetira;

    private LocalDate data;

    private String obs;

    private String nf;

    private Expedicao expedicao;

}
