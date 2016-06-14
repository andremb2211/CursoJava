package Funcionario;

public class Empresa {
	
	Funcionario[]funcionarios;
	String cnpj;
	
	
	//construtor padrao
    public Empresa() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Empresa(Funcionario[] funcionarios, String cnpj) {
		super();
		this.funcionarios = funcionarios;
		this.cnpj = cnpj;
	}


	boolean adiciona(Funcionario f) {
        for(int i=0;i<funcionarios.length;i++){//procura a proxíma posição vazia no vetor para poder acrescentar novo funcionário
               if(funcionarios[i] == null){
                  funcionarios[i] = f;
                return true;
               }
        }
         return false;      
     } 
    
    
    public  int quantidadeFuncionarios() {
        return funcionarios.length;   
     }  
    
    public void mostraFuncionarios() {   
        for(Funcionario f:funcionarios)    
         System.out.println(f);// aqui vc nao presisa fazer aquela referencia  explicita para os atributos lembra?Agora o println() faz tudo!!  
    }


	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}


	public void setFuncionarios(Funcionario[] funcionarios) {
		this.funcionarios = funcionarios;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	} 
    
}
