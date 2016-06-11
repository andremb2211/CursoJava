package terceiraaula;

public class Exemplo1 {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.deposita(100);
		
		Conta conta2 =  conta1;
		conta2.deposita(200);
	
		System.out.println(conta1.saldo);
		System.out.println(conta2.saldo);

	}

}
