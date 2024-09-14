package com.horizon.demo.service;

import com.horizon.demo.entities.Conta;
import com.horizon.demo.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ContaService {

    @Autowired
    ContaRepository contaRepository;

    public List<Conta> buscarTodos(){
        return contaRepository.findAll();
    }

    public Conta inserir(Conta conta){
        Conta contaNova = contaRepository.save(conta);
        return contaNova;
    }

    public Conta atualizar(Conta conta){
        return contaRepository.save(conta);
    }

    public void deletar(UUID id){
        Conta conta = contaRepository.findById(id).get();
        contaRepository.delete(conta);
    }
}
