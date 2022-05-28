package com.dio.bancoAmdocs;

import com.dio.bancoAmdocs.model.Cliente;
import com.dio.bancoAmdocs.model.Conta;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }

}