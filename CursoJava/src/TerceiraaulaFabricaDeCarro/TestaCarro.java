package TerceiraaulaFabricaDeCarro;


public class TestaCarro {

	public static void main(String[] args) {
		Carro  meuCarro;
		meuCarro = new Carro();
		meuCarro.cor= "verde";
		meuCarro.modelo = "fusca";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 40;
		
		//liga carro
		meuCarro.liga();
		
		//acelera o carro
		meuCarro.acelera(20);
		System.out.println(meuCarro.velocidadeAtual);
	}

}
