package io.github.Thiago279.padroesProjeto.service.impl;

import io.github.Thiago279.padroesProjeto.model.Cliente;
import io.github.Thiago279.padroesProjeto.model.Endereco;
import io.github.Thiago279.padroesProjeto.repository.ClienteRepository;
import io.github.Thiago279.padroesProjeto.repository.EnderecoRepository;
import io.github.Thiago279.padroesProjeto.service.ClienteService;
import io.github.Thiago279.padroesProjeto.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServiceImpl  implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private ViaCepService viaCepService;
    @Override
    public Iterable<Cliente> buscarTodos(){
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscaPorId(Long id){

        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }

    @Override
    public void inserir(Cliente cliente){
        salvarClienteComCep(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente){
        Optional<Cliente> clienteBd = clienteRepository.findById(id);
        if (clienteBd.isPresent()){
            salvarClienteComCep(cliente);
        }

    }

    public void deletar (Long id){
        clienteRepository.deleteById(id);
    }

    void salvarClienteComCep(Cliente cliente){
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(()-> {
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        } );
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);

    }


}
