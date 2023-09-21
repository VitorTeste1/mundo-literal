package com.example.mundoliteral.infra.repository;

import com.example.mundoliteral.infra.entities.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {
}
