package banco.coreBanco;

import java.util.ArrayList;

public class Agencia {
	static protected int ultimaAgencia = 0;
	protected int numero;
	private ArrayList<Conta> contas;
	private ArrayList<ContaVip> contasVips;

	public Agencia() {
		ultimaAgencia++;
		this.numero = ultimaAgencia;
		this.contas = new ArrayList<Conta>();
	}

	public void abrirConta(Usuario usuario) {
		Conta novaConta = new Conta(usuario);
		this.contas.add(novaConta);
	}
	
	public boolean abrirContaVip(Usuario usuario, int numCont, float valor) {
		this.depositar(numCont, valor);
		if (valor >= 5000){ 
			ContaVip novaConta = new ContaVip(usuario);
			this.contasVips.add(novaConta);
			return true;
		}
		return false;
	}

	public void fecharConta(int numero) {
		Conta conta = buscarConta(numero);
		if (conta != null) {
			this.contas.remove(conta);
		}
	}
	
	public void fecharContaVip(int numero) {
		ContaVip conta = buscarContaVip(numero);
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

	public ContaVip buscarContaVip(int numero) {
		for (ContaVip contaVip : contasVips) {
			if (contaVip.numero == numero) {
				return contaVip;
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
	
	public boolean sacarContaVip(int numCont, float valor){
		ContaVip contaVip = buscarContaVip(numCont);
		if(contaVip != null){
			if (contaVip.sacar(valor)){
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

	public float saldoFinalVip(int numCont) {
		ContaVip conta = buscarContaVip(numCont);
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

	public boolean depositarContaVip(int numCont, float valor) {
		ContaVip conta = buscarContaVip(numCont);
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