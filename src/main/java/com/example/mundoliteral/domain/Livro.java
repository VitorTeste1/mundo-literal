package com.example.mundoliteral.domain;

import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@EqualsAndHashCode
public class Livro {
    private Long id;
    private String nome;
    private BigDecimal valor;
    private Editora editora;
    private String autor;
}
