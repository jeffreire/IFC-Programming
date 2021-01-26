package funcionarios.coreFuncionarios;

import java.util.ArrayList;

public class GerenciadorFuncionarios {

	ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	ArrayList<Comercial> fnComerciais = new ArrayList<Comercial>();

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

	public boolean definirSetor(int id, String novoSetor, String clausula) {
		Funcionario fn = buscarFuncionario(id);
		if( fn != null && novoSetor == "comercial"){
			fn.setor = novoSetor;
			Comercial comercial = new Comercial(fn.id, fn.nome, fn.idade, fn.cpf, fn.salario, clausula);
			this.fnComerciais.add(comercial);
			return true;
		}
		return false;
	}

	public void calcularReajuste(float aumento) {
		for (Funcionario funcionario : funcionarios) {
			if (funcionario.setor == "comercial") {
				funcionario.salario *= (aumento+1)+3;
			}
			funcionario.salario *= (aumento + 1);
		}
	}

	public void demitir(int id) {
		for (Funcionario funcionario : funcionarios) {
			if (funcionario.id == id) {
				funcionario.demitir();
				break;
			}
			else if (funcionario.id == id && funcionario.setor == "comercial") {
				funcionario.demitir();
				for (Comercial comercial : fnComerciais){
					if (funcionario.id == comercial.id){
						comercial.demitir();
					}
				}
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
