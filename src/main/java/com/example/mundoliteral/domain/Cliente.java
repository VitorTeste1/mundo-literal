package com.example.mundoliteral.domain;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@EqualsAndHashCode
public class Cliente {
    private Long id;
    private String nome;
    private String email;
    private String numeroTelefone;
    private String cpf;
    private Endereco endereco;




}
