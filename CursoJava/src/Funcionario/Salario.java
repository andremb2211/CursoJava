package Funcionario;

public class Salario {

private	double salario;


    
    //metodo construtor padrao
    public Salario() {
	super();
	// TODO Auto-generated constructor stub
}
    
	public Salario(double salario) {
	super();
	this.salario = salario;
}

	//metodos

	  void recebeAumento(double aumento) {
	      double novoSalario = this.salario + aumento;
	      this.salario = novoSalario;
	   }

	   double calculaGanhoAnual() {

	      this.salario = salario * 12;
	      return salario;

	   }
	   
	   
	   // get and set

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	
	
}


