package tech.angelofdiasg.aula02;

public class Programa {

	public static void main(String[] args) {
		int num =1;
		Conta c1 = new Conta();
		c1.limite = 1000;
		c1.CPF = "0222";
		c1.nome = "Aangelo";
		c1.numero = 10;
		c1.saldo = 0;
		
		Conta c2 = new Conta();
		c2.limite = 2000;
		
		c2.saca(num);
	}

}
