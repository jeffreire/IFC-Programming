package banco.coreBanco;

import java.util.ArrayList;
import interfaces.IConta;

public class Agencia {
	static protected int ultimaAgencia = 0;
	protected int numero;
	private ArrayList<IConta> contas;

	public Agencia() {
		ultimaAgencia++;
		this.numero = ultimaAgencia;
		this.contas = new ArrayList<IConta>();
	}

	public void abrirConta(Usuario usuario) {
		Conta novaConta = new Conta(usuario);
		this.contas.add(novaConta);
	}

	public void fecharConta(int numero) {
		IConta conta = buscarConta(numero);
		if (conta != null) {
			this.contas.remove(conta);
		}
	}

	public IConta buscarConta(int numero) {
		for (IConta conta : contas) {
			if (conta.getNumero() == numero) {
				return conta;
			}
		}
		return null;
	}

	public boolean sacar(int numCont, float valor) {
		IConta conta = buscarConta(numCont);
		if (conta != null) {
			if (conta.sacar(valor)){
				return true;
			}	
			return false;
		}
		return false;
	}
	
	public float saldoFinal(int numCont) {
		IConta conta = buscarConta(numCont);
		if (conta != null) {
			return conta.mostrarSaldo();
		}
		return -1;
	}

	public boolean depositar(int numCont, float valor) {
		IConta conta = buscarConta(numCont);
		if (conta != null) {
			if (conta.depositar(valor) == true){
				return true;
			}
			return false;
		}
		return false;
	}

	@Override
	public String toString(){
		return ";" + this.numero + ";";
	}
}