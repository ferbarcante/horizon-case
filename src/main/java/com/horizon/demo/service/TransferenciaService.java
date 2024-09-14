package com.horizon.demo.service;

import com.horizon.demo.entities.Conta;
import com.horizon.demo.entities.Transferencia;
import com.horizon.demo.repository.ContaRepository;
import com.horizon.demo.repository.TransferenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TransferenciaService {

    @Autowired
    TransferenciaRepository transferenciaRepository;

    @Autowired
    ContaRepository contaRepository;

    public List<Transferencia> buscarTodos(){
        return transferenciaRepository.findAll();
    }

    public void realizarTransferencia(UUID contaOrigemId, UUID contaDestinoId, double valor){
        Conta contaOrigem = contaRepository.findById(contaOrigemId).orElseThrow(()-> new RuntimeException("Conta de origem não existe!"));
        Conta contaDestino = contaRepository.findById(contaDestinoId).orElseThrow(() -> new RuntimeException("Conta de destino não existe!"));

        if(contaOrigem.getSaldo() < 0){
            throw new RuntimeException("Não é possível realizar a transferência, saldo insuficiente!");
        } else {
            contaOrigem.setSaldo(contaOrigem.getSaldo() - valor);
            contaDestino.setSaldo(contaDestino.getSaldo() + valor);

            contaRepository.save(contaDestino);
            contaRepository.save(contaOrigem);
        }
    }


}
