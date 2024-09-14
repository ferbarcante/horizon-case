package com.horizon.demo.entities;

import com.horizon.demo.enums.TipoConta;
import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name = "contas")
@Data
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id_conta;
    private String numero;
    private long digito;
    private double saldo;
    private TipoConta tipoConta;

    @ManyToOne
    @JoinColumn(name = "fk_id_pessoa")
    private Pessoa pessoa;
}
