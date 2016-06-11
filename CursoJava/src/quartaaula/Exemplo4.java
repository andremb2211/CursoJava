package quartaaula;

import java.util.Iterator;

import terceiraaula.Conta;

public class Exemplo4 {

	public static void main(String[] args) {
		
		Conta[] contas = new Conta[5];
		Conta contaRenato = new Conta();
		contaRenato.setNumero(001);
		contaRenato.setSaldo(100);
		contaRenato.setLimite(1000);
		contaRenato.getTitular().nome = "Renato";
		

		Conta contaAryene = new Conta();
		contaAryene.numero = 050;
		contaAryene.saldo = 100000;
		contaAryene.limite = 100000;
		contaRenato.titular.nome = "Aryene";
		
		contas[0] = contaRenato;
		contas[4] = contaAryene;
		
		for(Conta conta : contas){
			if(conta != null){
				conta.agencia = 10;
				System.out.println(conta.saldo);
			}
		}
		System.out.println("Saiu do FOR");
	}

}
