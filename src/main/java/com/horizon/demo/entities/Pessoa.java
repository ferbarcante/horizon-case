package com.horizon.demo.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name="pessoas")
@Data
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id_pessoa;
    private String nome;
    private String cpf;
    private String telefone;
}
