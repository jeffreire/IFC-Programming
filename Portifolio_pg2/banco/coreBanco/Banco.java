package banco.coreBanco;

import java.util.ArrayList;

public class Banco {
	private ArrayList<Agencia> agencias;
	private ArrayList<Usuario> usuarios;
	public String nome;

	public Banco(String nome) {
		this.nome = nome;
		this.agencias = new ArrayList<Agencia>();
		this.usuarios = new ArrayList<Usuario>();
	}

	public String getNome(){
		return this.nome;
	}

	public ArrayList<Usuario> getUsuarios(){
		return this.usuarios;
	}
	
	public ArrayList<Agencia> getAgencias(){
		return this.agencias;
	}

	public void cadastrarUsuario(String nome, String cpf) {
		Usuario novo = new Usuario(nome, cpf);
		this.usuarios.add(novo);
	}

	public void cadastrarConta(String cpf, int numAg) {
		Agencia ag = buscarAgencia(numAg);
		Usuario usuario = buscarUsuario(cpf);
		ag.abrirConta(usuario);
	}
	
	public Usuario buscarUsuario(String cpf) {
		for (Usuario usuario : usuarios) {
			if (usuario.getCpf().equals(cpf))
				return usuario;
		}
		return null;
	}
	
	public Agencia buscarAgencia(int numero) {
		for (Agencia agencia : agencias) {
			if (agencia.numero == numero)
				return agencia;
		}
		return null;
	}

	public void criarAgencia() {
		Agencia nova = new Agencia();
		this.agencias.add(nova);
	}

	public void apagarAgencia(int numero) {
		Agencia ag = buscarAgencia(numero);
		if (ag != null)
			this.agencias.remove(ag);
	}

	public boolean sacar(int numAg, int numCont, float valor) {
		Agencia ag = buscarAgencia(numAg);
		if (ag != null) {
			if (ag.sacar(numCont, valor)){
				return true;
			}
			return false;
		}
		return false;
	}
	
	public boolean depositar(int numAg, int numCont,float valor) {
		Agencia ag = buscarAgencia(numAg);
		if (ag != null) {
			if(ag.depositar(numCont, valor)){
				return true;
			}
			return false;
		}
		return false;
	}
	
	public float saldo(int numAg, int numCont) {
		Agencia ag = buscarAgencia(numAg);
		if (ag != null) {
			return ag.saldoFinal(numCont);
		}
		return -1;
	}

	@Override
	public String toString(){
		return this.nome;
	}
}