package com.example.estudoTracking.model;

import com.example.estudoTracking.enums.TipoVendedor;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "Vendedor")
public class Vendedor {

    @Id
    private String id;

    private LocalDateTime timestamp;

    @NotBlank(message = "Código do vendedor inválido!")
    private String codVend;

    @NotBlank(message = "Apelido inválido!")
    private String apelido;

    private TipoVendedor tipo;

}
