package quartaaula;

import terceiraaula.Cliente;
import terceiraaula.Conta;

public class Exemplo6 {

	public static void main(String[] args) {
            Conta conta = new Conta();
            conta.setAgencia(85);
            conta.setLimite(100);
            conta.setNumero(35);
            conta.setSaldo(100);
            
            Cliente cliente = new Cliente();
            
            Conta conta2 = new Cliente(10, 1000,50000 , new Cliente(),7894);
            
            cliente.setCpf("123");
            cliente.setEndereco("endereco");
            cliente.setNome("Ana");
            cliente.setIdade(25);
            
            
            conta.setTitular(cliente);
            
            cliente.mudaCPF("546");
            
            
            
	}

}
