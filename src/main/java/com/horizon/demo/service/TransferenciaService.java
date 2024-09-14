package com.horizon.demo.service;

import com.horizon.demo.entities.Conta;
import com.horizon.demo.entities.Transferencia;
import com.horizon.demo.repository.TransferenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TransferenciaService {

    @Autowired
    TransferenciaRepository transferenciaRepository;

    public List<Transferencia> buscarTodos(){
        return transferenciaRepository.findAll();
    }

    public Transferencia inserir(Transferencia transferencia){
        Transferencia novaTrans = transferenciaRepository.save(transferencia);
        return novaTrans;
    }

    public Transferencia atualizar(Transferencia transferencia){
        return transferenciaRepository.save(transferencia);
    }

    public void deletar(UUID id){
        Transferencia transferencia = transferenciaRepository.findById(id).get();
        transferenciaRepository.delete(transferencia);
    }
}
