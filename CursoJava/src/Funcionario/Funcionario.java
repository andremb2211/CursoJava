package Funcionario;

public class Funcionario {

   private String nome;
   private String RG;
   private String data;


   //metodo construtor padrao
   public Funcionario() {
      super();
   }
   //metodo construtor do funcionario 
   public Funcionario(String nome) {
      super();
      this.nome = nome;
   }
   
   

   @Override
   public String toString() {
      return new StringBuilder("Funcionario ").append(this.nome).toString();
   }
   
   
   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public String getRG() {
      return RG;
   }

   public void setRG(String rG) {
      RG = rG;
   }

   public String getData() {
      return data;
   }

   public void setData(String data) {
      this.data = data;
   }

}
