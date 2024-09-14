package com.horizon.demo.controller;

import com.horizon.demo.entities.Pessoa;
import com.horizon.demo.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    PessoaService pessoaService;

    @GetMapping("/")
    public List<Pessoa> buscarTodos(){
        return pessoaService.buscarTodos();
    }

    @PostMapping("/")
    public Pessoa inserir(@RequestBody Pessoa pessoa){
        return pessoaService.inserir(pessoa);
    }

    @PutMapping("/")
    public Pessoa atualizar(@RequestBody Pessoa pessoa){
        return pessoaService.atualizar(pessoa);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") UUID id){
        pessoaService.deletar(id);
    }

}
