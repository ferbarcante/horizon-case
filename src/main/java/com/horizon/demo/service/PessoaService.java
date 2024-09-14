package com.horizon.demo.service;

import com.horizon.demo.entities.Pessoa;
import com.horizon.demo.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PessoaService {

    @Autowired
    PessoaRepository pessoaRepository;

    public List<Pessoa> buscarTodos(){
        return pessoaRepository.findAll();
    }

    public Pessoa inserir(Pessoa pessoa){
        Pessoa pessoaNova = pessoaRepository.save(pessoa);
        return pessoaNova;
    }

    public Pessoa atualizar(Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }

    public void deletar(UUID id){
        Pessoa pessoa = pessoaRepository.findById(id).get();
        pessoaRepository.delete(pessoa);
    }
}
