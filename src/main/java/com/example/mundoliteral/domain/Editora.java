package com.example.mundoliteral.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@EqualsAndHashCode
public class Editora {
    private Long id;
    private String nome;
    private Endereco endereco;
    private String cnpj;
    private String numeroTelefone;
    private String email;
}
