package com.example.mundoliteral.domain;
import lombok.*;
import org.apache.tomcat.util.http.fileupload.util.LimitedInputStream;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@EqualsAndHashCode
public class Pedido {
    private Long id;
    private Cliente cliente;
    private List<Livro> livroList;
    private BigDecimal valor;
    private LocalDate dataPedido;
}
