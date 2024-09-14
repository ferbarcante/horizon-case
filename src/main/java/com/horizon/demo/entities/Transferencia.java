package com.horizon.demo.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "transferencias")
public class Transferencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id_transferencia;

    @ManyToOne
    @JoinColumn(name = "fk_id_conta_ori")
    Conta contaOrigem;
    @ManyToOne
    @JoinColumn(name = "fk_id_conta_dest")
    Conta contaDestino;

    private double valor;
    private Date data;
}
