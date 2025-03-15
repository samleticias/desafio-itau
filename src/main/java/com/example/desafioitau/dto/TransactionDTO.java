package com.example.desafioitau.dto;

import jakarta.validation.constraints.NotNull;

import java.time.OffsetDateTime;

public class TransactionDTO {
    @NotNull
    private Double valor;

    @NotNull
    private OffsetDateTime dataHora;

    public TransactionDTO(final double value, final OffsetDateTime dataHora) {
        this.valor = value;
        this.dataHora = dataHora;
    }


    public double getValue() {
        return valor;
    }

    public OffsetDateTime getDataHora() {
        return dataHora;
    }
}
