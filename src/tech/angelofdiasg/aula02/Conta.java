package tech.angelofdiasg.aula02;

public class Conta {

	int numero;
	String nome;
	double saldo;
	double limite;
	String CPF;


	void saca(double quantidade) {
		double novoSaldo = this.saldo - quantidade;
		this.saldo = novoSaldo;
	}

	public Conta() {
		System.out.println("Objeto Conta Criado!");
	}

	public Conta(int numero, String nome, double saldo, double limite, String CPF) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
		this.limite = limite;
		this.CPF = CPF;
	}
	
	
}