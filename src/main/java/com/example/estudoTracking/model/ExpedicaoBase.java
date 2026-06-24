package com.example.estudoTracking.model;

import com.example.estudoTracking.enums.TipoExpedicao;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.data.annotation.Id;
import java.time.LocalDateTime;

@Data
public class ExpedicaoBase {

    @Id
    private String id;

    private LocalDateTime timestamp;

    @NotBlank(message = "Expedição não definida!")
    private TipoExpedicao expedicao;

    private String obs;

}