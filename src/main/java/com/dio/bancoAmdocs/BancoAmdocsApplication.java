package com.dio.bancoAmdocs;

import com.dio.bancoAmdocs.model.Cliente;
import com.dio.bancoAmdocs.model.Conta;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BancoAmdocsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BancoAmdocsApplication.class, args);
		Cliente cliente = new Cliente();
		cliente.setNome("Rocha");

		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);

		cc.depositar(100);
		cc.transferir(100, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
