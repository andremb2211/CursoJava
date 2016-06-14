package Funcionario;

public class Departamento {

	private int cod;
	private String nomedep;
	

	//metodo construtor padrao
	public Departamento() {
		super();
	}


	public Departamento(int cod, String nomedep) {
		super();
		this.cod = cod;
		this.nomedep = nomedep;
	}
	
	
	   @Override
	   public String toString() {
	      return new StringBuilder(20).append("Departamento:").append(this.nomedep).toString();
	   }
	
	
	public int getCod() {
		return cod; 
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getNomedep() {
		return nomedep;
	}
	public void setNomedep(String nomedep) {
		this.nomedep = nomedep;
	}
	
	
	
}
