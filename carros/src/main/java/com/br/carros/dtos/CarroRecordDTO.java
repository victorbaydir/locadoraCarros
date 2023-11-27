package com.br.carros.dtos;

import jakarta.validation.constraints.NotBlank;

public record CarroRecordDTO(@NotBlank String ano, @NotBlank String cor, @NotBlank String placa ) {

}
