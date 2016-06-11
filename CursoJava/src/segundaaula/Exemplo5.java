package segundaaula;

public class Exemplo5 {

	public static void main(String[] args) {
		int valor = 30;
		boolean teste = false;
		
		teste = valor < 40 && valor > 20;
		System.out.println(teste);
		teste = valor < 40 && valor > 30;
		System.out.println(teste);
		teste = valor > 30 || valor > 20;
		System.out.println(teste);
		teste = valor > 30 || valor < 20;
		System.out.println(teste);
		teste = valor < 50 && valor == 20;
		System.out.println(teste);
	}

}
