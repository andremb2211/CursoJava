package terceiraaula;

public class Conta {

	private int numero;
	private double saldo;
	private double limite;
	private Cliente titular = new Cliente();
	private int agencia;
	private static int totalDeContas;
	
    public Conta(){
    	Conta.totalDeContas = +1;
    	
    }
	public static int getTotalDeContas() {
		return totalDeContas;
	}
	public static void setTotalDeContas(int totalDeContas) {
		Conta.totalDeContas = totalDeContas;
	}
	boolean saca(double valor) {
		if (this.saldo < valor) {
			return false;
		} else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}

	public Conta(int numero, double saldo, double limite, Cliente titular, int agencia) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.titular = titular;
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	void deposita(double quantidade) {
		this.saldo += quantidade;
	}

	boolean transfere(Conta destino, double valor) {
		if (this.saca(valor)) {
			destino.deposita(valor);
			return true;

		} else {

			return false;
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}
