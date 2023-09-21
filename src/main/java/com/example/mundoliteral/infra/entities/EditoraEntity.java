package com.example.mundoliteral.infra.entities;

import com.example.mundoliteral.domain.Endereco;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@EqualsAndHashCode
@Entity(name = "Editora")
@Table(name = "editoras")
public class EditoraEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Endereco endereco;
    private String cnpj;
    private String numeroTelefone;
    private String email;
}
