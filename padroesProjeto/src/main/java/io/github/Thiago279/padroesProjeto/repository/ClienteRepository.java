package io.github.Thiago279.padroesProjeto.repository;

import io.github.Thiago279.padroesProjeto.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
