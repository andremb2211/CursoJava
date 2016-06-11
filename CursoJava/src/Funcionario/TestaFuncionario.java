package Funcionario;

public class TestaFuncionario {

   public static void main(String[] args) {
      // TODO Auto-generated method stub

      Funcionario f1 = new Funcionario("borges");
      Departamento dep = new Departamento(20,"TI");
      Salario salario = new Salario(1500);
      
      salario.recebeAumento(700);

      System.out.println(f1);
      System.out.println(dep);
      
      System.out.println("Salario atual:" + salario.getSalario());
      System.out.println("Ganho Anual:" + salario.calculaGanhoAnual());
      
      

   }

}
