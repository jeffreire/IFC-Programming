package funcionarios.coreFuncionarios;

import java.util.Date;

import interfaces.IFuncionario;

public class Funcionario implements IFuncionario{
	String cpf;
	public String nome;
	String setor;
	final int id;
	int idade;
	final Date dataContratacao;
	float salario;
	boolean demitido = false;

	public Funcionario(int id, String nome, int idade, String cpf, float salario) {
		this.id = id;
		this.dataContratacao = new Date(System.currentTimeMillis());
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}

	public void demitir() {
		this.demitido = true;
	}

	public boolean alterarCPF(String cpf) {

		char digito_10, digito_11;
		int sm, i, r, num, peso;

		// Primeiro verificando condições simples para eliminar o cpf
		// 1 - Tamanho diferente de 11 digito.
		// 2 - Se todos os números são iguais.
		if (cpf.length() != 11)
			return false;
		String pattern = "([0-9])\\1*";

		if (cpf.matches(pattern))
			return false;

		// Calculo do 1o. Digito Verificador

		sm = 0;
		peso = 10;
		for (i = 0; i < 9; i++) {
			// converte o i-esimo caractere do CPF em um numero:
			// por exemplo, transforma o caractere '0' no inteiro 0
			// (48 eh a posicao de '0' na tabela ASCII)
			num = (int) (cpf.charAt(i) - 48);
			sm = sm + (num * peso);
			peso = peso - 1;
		}

		r = 11 - (sm % 11);
		if ((r == 10) || (r == 11))
			digito_10 = '0';
		else
			digito_10 = (char) (r + 48); // converte no respectivo caractere numerico

		// Calculo do 2o. Digito Verificador
		sm = 0;
		peso = 11;
		for (i = 0; i < 10; i++) {
			num = (int) (cpf.charAt(i) - 48);
			sm = sm + (num * peso);
			peso = peso - 1;
		}

		r = 11 - (sm % 11);
		if ((r == 10) || (r == 11))
			digito_11 = '0';
		else
			digito_11 = (char) (r + 48);

		// Verifica se os digitos calculados conferem com os digitos informados.
		if ((digito_10 == cpf.charAt(9)) && (digito_11 == cpf.charAt(10))) {
			this.cpf = cpf;
			return (true);
		} else {
			return (false);
		}
	}

	public int getId() {
		return this.id;
	}

	public String getSetor(){
		return this.setor;
	}

	public void setSetor(String newsetor) {
		this.setor = newsetor;
	}
	
	public float getSalario(){
		return this.salario;
	}

	public void setSalario(float newSalario){
		this.salario = newSalario;
	}

	public boolean getDemitido(){
		return this.demitido;
	}

	@Override
	public String toString(){
		return this.id+";"+this.nome+";"+this.idade+";"+this.cpf+";"+this.salario;
	}
}
