package com.example.mundoliteral.domain;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@EqualsAndHashCode
public class Endereco {
    private String cep;
    private String rua;
    private Integer numero;
    private String cidade;
    private String pais;
    private String estado;
    private String complemento;
}
