package com.horizon.demo.controller;

import com.horizon.demo.entities.Transferencia;
import com.horizon.demo.service.TransferenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/transferencias")
public class TransferenciaController {

    @Autowired
    private TransferenciaService transferenciaService;

    @RequestMapping("/")
    public List<Transferencia> buscarTodos(){
        return transferenciaService.buscarTodos();
    }

    @PostMapping("/")
    public void transferir(@RequestParam UUID contaOrigemId,
                           @RequestParam UUID contaDestinoId,
                           @RequestParam double valor){
        transferenciaService.realizarTransferencia(contaOrigemId, contaDestinoId, valor);
    }
}
