package com.example.mundoliteral.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@EqualsAndHashCode
public class Estoque {
    private Long id;
    private Integer quantidade;
    private Livro livro;
}
