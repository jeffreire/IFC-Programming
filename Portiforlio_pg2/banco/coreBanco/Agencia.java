package banco.coreBanco;

import java.util.ArrayList;

public class Agencia {
	static protected int ultimaAgencia = 0;
	protected int numero;
	private ArrayList<Conta> contas;

	public Agencia() {
		ultimaAgencia++;
		this.numero = ultimaAgencia;
		this.contas = new ArrayList<Conta>();
	}

	public void abrirConta(Usuario usuario) {
		Conta novaConta = new Conta(usuario);
		this.contas.add(novaConta);
	}

	public void fecharConta(int numero) {
		Conta conta = buscarConta(numero);
		if (conta != null) {
			this.contas.remove(conta);
		}
	}

	public Conta buscarConta(int numero) {
		for (Conta conta : contas) {
			if (conta.numero == numero) {
				return conta;
			}
		}
		return null;
	}

	public boolean sacar(int numCont, float valor) {
		Conta conta = buscarConta(numCont);
		if (conta != null) {
			if (conta.sacar(valor)){
				return true;
			}	
			return false;
		}
		return false;
	}

	public float saldoFinal(int numCont) {
		Conta conta = buscarConta(numCont);
		if (conta != null) {
			return conta.mostrarSaldo();
		}
		return -1;
	}
	
	public boolean depositar(int numCont, float valor) {
		Conta conta = buscarConta(numCont);
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