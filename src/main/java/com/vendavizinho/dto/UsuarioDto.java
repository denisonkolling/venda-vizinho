package com.vendavizinho.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor

public class UsuarioDto {

    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private Boolean ativo;

}
