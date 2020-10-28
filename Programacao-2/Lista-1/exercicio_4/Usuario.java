package exercicio_4;

public class Usuario {
	
	//Crinado os objetos do usuario
	private int id;
	private String nome;
	private int idade;
	private String cpf;
	private String dataEntrada;
	private int salario;
	
	//Construtor da classe usuario
	public Usuario(int id, String nome, int idade, String cpf, String dataEntrada, int salario){
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.dataEntrada = dataEntrada;
		this.salario = salario;
	}
	
	//Obtendo Id do usuario
	public int getId() {
		return this.id;
	}
	
	//Obtendo nome do Usuario
	public String getNome() {
		return this.nome;
	}
	
	//Obtendo idade do Usuario
	public int getIdade() {
		return this.idade;
	}
	
	//Obtendo CPF do usuario
	public String getCPF() {
		return this.cpf;
	}
	
	//Obtendo data de contratacao do usuario
	public String getDataEntrada() {
		return this.dataEntrada;
	}
	
	//Obtendo salario do usuario
	public int getSalario() {
		return this.salario;
	}
}