package io.github.Thiago279.padroesProjeto.service;

import io.github.Thiago279.padroesProjeto.model.Cliente;
import org.springframework.stereotype.Service;

public interface ClienteService {

    Iterable <Cliente> buscarTodos();

    Cliente buscaPorId(Long id);
    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
