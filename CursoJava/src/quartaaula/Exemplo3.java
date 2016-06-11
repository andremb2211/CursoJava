package quartaaula;

import terceiraaula.Conta;

public class Exemplo3 {

	public static void main(String[] args) {
		Conta[] contas = new Conta[5];

		Conta contaRenato = new Conta();
		contaRenato.numero = 001;
		contaRenato.saldo = 100;
		contaRenato.limite = 1000;

		Conta contaAryene = new Conta();
		contaAryene.numero = 050;
		contaAryene.saldo = 100000;
		contaAryene.limite = 100000;

		contas[0] = contaRenato;
		contas[4] = contaAryene;

		System.out.println("O tamanho do meu array é de " + contas.length);

		for (int i = 0; i < contas.length; i++) {
			if (contas[i] != null) {
				System.out.println("Conta de numero" + i + "dentro do array");
				System.out.println(contas[i].numero);
				System.out.println(contas[i].saldo);
				System.out.println(contas[i].limite);
				System.out.println();

			}

		}

	}

}
