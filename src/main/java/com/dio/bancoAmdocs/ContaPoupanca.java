package com.dio.bancoAmdocs;

import com.dio.bancoAmdocs.model.Cliente;
import com.dio.bancoAmdocs.model.Conta;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupanca ===");
        super.imprimirInfosComuns();
    }
}