package com.example.estudoTracking.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "Logistica")
public class Logistica extends ExpedicaoBase {

    private LocalDateTime dataEntrega;

}