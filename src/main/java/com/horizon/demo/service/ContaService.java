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

    public void sacar(UUID idConta, double valor){
        Conta conta = contaRepository.findById(idConta)
                .orElseThrow(() -> new RuntimeException("Conta não encontrada"));

        if (valor <= 0) {
            throw new RuntimeException("O valor do saque deve ser positivo");
        }

        if (conta.getSaldo() < valor) {
            throw new RuntimeException("Saldo insuficiente para realizar o saque");
        }

        conta.setSaldo(conta.getSaldo() - valor);
        contaRepository.save(conta);
    }

    public Conta atualizar(Conta conta){
        return contaRepository.save(conta);
    }

    public void deletar(UUID id){
        Conta conta = contaRepository.findById(id).get();
        contaRepository.delete(conta);
    }
}
