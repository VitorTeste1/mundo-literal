package com.example.mundoliteral.infra.repository;

import com.example.mundoliteral.infra.entities.PedidoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<PedidoEntity, Long> {
}
