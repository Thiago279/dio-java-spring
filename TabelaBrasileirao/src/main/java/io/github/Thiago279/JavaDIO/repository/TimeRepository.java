package io.github.Thiago279.JavaDIO.repository;

import io.github.Thiago279.JavaDIO.model.Time;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TimeRepository extends JpaRepository<Time, Long> {
     Optional<Time> findByNome(String nome);
}
