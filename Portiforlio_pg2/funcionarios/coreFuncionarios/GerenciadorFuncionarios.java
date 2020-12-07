package funcionarios.coreFuncionarios;

import java.util.ArrayList;

public class GerenciadorFuncionarios {

	ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

	public void cadastrarFuncionario(String cpf, String nome, int id, int idade, float salario) {
		Funcionario novo = new Funcionario(id, nome, idade, cpf, salario);
		this.funcionarios.add(novo);
	}

	public Funcionario buscarFuncionario(int id) {
		for (Funcionario funcionario : funcionarios) {
			if (funcionario.id == id) {
				return funcionario;
			}
		}
		return null;
	}

	public boolean definirSetor(int id, String novoSetor) {
		Funcionario funcionario = buscarFuncionario(id);
		if (funcionario != null ) {
			funcionario.setor = novoSetor;
			return true;
		}
		return false;
	}

	public void calcularReajuste(float aumento) {
		for (Funcionario funcionario : funcionarios) {
			funcionario.salario *= (aumento + 1);
		}
	}

	public void demitir(int id) {
		for (Funcionario funcionario : funcionarios) {
			if (funcionario.id == id) {
				funcionario.demitir();
				break;
			}
		}

	}

	public ArrayList<Funcionario> listarDemitidos() {
		ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
		for (Funcionario funcionario : funcionarios) {
			if (funcionario.demitido) {
				lista.add(funcionario);
			}
		}
		return lista;
	}

	public ArrayList<Funcionario> listarNaoDemitidos() {
		ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
		for (Funcionario funcionario : funcionarios) {
			if (!funcionario.demitido) {
				lista.add(funcionario);
			}
		}
		return lista;
	}
}
