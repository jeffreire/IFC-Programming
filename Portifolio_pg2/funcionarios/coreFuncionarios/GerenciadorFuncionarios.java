package funcionarios.coreFuncionarios;

import java.util.ArrayList;

import interfaces.IFuncionario;

public class GerenciadorFuncionarios {

	ArrayList<IFuncionario> funcionarios = new ArrayList<IFuncionario>();

	public void cadastrarFuncionario(String cpf, String nome, int id, int idade, float salario) {
		IFuncionario novo = new Funcionario(id, nome, idade, cpf, salario);
		this.funcionarios.add(novo);
	}

	public IFuncionario buscarFuncionario(int id) {
		for (IFuncionario funcionario : funcionarios) {
			if (funcionario.getId() == id) {
				return funcionario;
			}
		}
		return null;
	}

	public boolean definirSetor(int id, String novoSetor, String clausula) {
		IFuncionario fn = buscarFuncionario(id);
		if(fn != null){
			fn.setSetor(novoSetor);
			return true;
		}
		return false;
	}

	public void calcularReajuste(float aumento) {
		for (IFuncionario fn : funcionarios) {
			if (fn.getSetor().equals("comercial")) {
				float salario;
				salario  = fn.getSalario();
				salario *= (aumento+1)+3;
				fn.setSalario(salario);
			}
		}
	}

	public void demitir(int id) {
		for (IFuncionario funcionario : funcionarios) {
			if (funcionario.getId() == id) {
				funcionario.demitir();
				break;
			}
			else if (funcionario.getId() == id && funcionario.getSetor().equals("comercial")) {
				funcionario.demitir();
				for (IFuncionario funcionario2 : funcionarios){
					if (funcionario2.getSetor().equals("comercial")){ 
						if (funcionario.getId() == funcionario.getId()){
							funcionario.demitir();
						}
					}
				}
			}
		}
	}

	public ArrayList<IFuncionario> listarDemitidos() {
		ArrayList<IFuncionario> lista = new ArrayList<IFuncionario>();
		for (IFuncionario funcionario : funcionarios) {
			if (funcionario.getDemitido()) {
				lista.add(funcionario);
			}
		}
		return lista;
	}

	public ArrayList<IFuncionario> listarNaoDemitidos() {
		ArrayList<IFuncionario> lista = new ArrayList<IFuncionario>();
		for (IFuncionario funcionario : funcionarios) {
			if (!funcionario.getDemitido()) {
				lista.add(funcionario);
			}
		}
		return lista;
	}
}
