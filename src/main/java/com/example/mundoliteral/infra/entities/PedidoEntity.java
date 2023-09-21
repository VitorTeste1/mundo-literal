package com.example.mundoliteral.infra.entities;

import com.example.mundoliteral.domain.Cliente;
import com.example.mundoliteral.domain.Livro;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@EqualsAndHashCode
@Entity(name = "Pedido")
@Table(name = "pedidos")
public class PedidoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Cliente cliente;
    private List<Livro> livroList;
    private BigDecimal valor;
    private LocalDate dataPedido;
}
