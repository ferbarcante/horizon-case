package com.horizon.demo.controller;


import com.horizon.demo.entities.Conta;
import com.horizon.demo.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/contas")
public class ContaController {

    @Autowired
    ContaService contaService;

    @GetMapping("/")
    public List<Conta> buscarTodos(){
        return contaService.buscarTodos();
    }

    @PostMapping("/")
    public Conta inserir(@RequestBody Conta conta){
        return contaService.inserir(conta);
    }

    @PutMapping("/")
    public Conta atualizar(@RequestBody Conta conta){
        return contaService.atualizar(conta);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") UUID id){
        contaService.deletar(id);
    }

}
