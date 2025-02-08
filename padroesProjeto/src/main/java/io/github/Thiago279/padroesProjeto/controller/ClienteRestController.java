package io.github.Thiago279.padroesProjeto.controller;

import io.github.Thiago279.padroesProjeto.model.Cliente;
import io.github.Thiago279.padroesProjeto.repository.ClienteRepository;
import io.github.Thiago279.padroesProjeto.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("clientes")
public class ClienteRestController {

    @Autowired
    private ClienteService clienteService;

    /*buscar todos
    budcar por id
    inserir
    atualizar
    deletar
    Response Entity<T>
     */

    @GetMapping
    public ResponseEntity<Iterable<Cliente>> buscarTodos(){
        return ResponseEntity.ok(clienteService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarPorId(@PathVariable("id") Long id){
        return ResponseEntity.ok(clienteService.buscaPorId(id));
    }

    @PostMapping
    public ResponseEntity<Cliente> inserir(@RequestBody Cliente cliente){
        clienteService.inserir(cliente);
        return ResponseEntity.ok(cliente);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> atualizar(@PathVariable Long id, @RequestBody Cliente cliente){
        clienteService.atualizar(id, cliente);
        return ResponseEntity.ok(cliente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Cliente> deletar(@PathVariable("id") Long id){
        clienteService.deletar(id);
        return ResponseEntity.ok().build();
    }
}
