package exercicio_4;

public class Main {
	
public static void main(String args[]) {
	Usuario usu = new Usuario(1, "NomeTeste", 21, "097.0101.0101-01", "12/12/125", 5000);
	
	int id =usu.getId(); 
	String nome = usu.getNome();
	int idade = usu.getIdade();
	String cpf = usu.getCPF();
	String dataEntrada = usu.getDataEntrada();
	int salario = usu.getSalario();
	
	System.out.println(id);
	System.out.println(nome);
	System.out.println(idade); 
	System.out.println(cpf);
	System.out.println(dataEntrada);
	System.out.println(salario);
	
	}
}