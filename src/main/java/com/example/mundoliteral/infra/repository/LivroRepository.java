package com.example.mundoliteral.infra.repository;

import com.example.mundoliteral.infra.entities.LivroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<LivroEntity, Long> {
}
