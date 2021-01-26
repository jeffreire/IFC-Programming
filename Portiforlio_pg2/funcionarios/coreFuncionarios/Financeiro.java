package funcionarios.coreFuncionarios;

public class Financeiro extends Funcionario{
  public String clausula;
  
  public Financeiro(
    int id, 
    String nome, 
    int idade, 
    String cpf, 
    float salario, 
    String clausula) 
  {
    super(id, nome, idade, cpf, salario);
    this.clausula = clausula;
  }
}
