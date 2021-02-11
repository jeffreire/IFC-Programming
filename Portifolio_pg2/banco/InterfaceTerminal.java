package banco;

import banco.coreBanco.Agencia;
import banco.coreBanco.Banco;
import banco.coreBanco.ManipuladorDeBanco;
import banco.coreBanco.Usuario;
import interfaces.IConta;

import java.util.Scanner;

import arquivos.ManipuladorDeArquivos;

public class InterfaceTerminal {
	
	Scanner in = new Scanner(System.in);
	Banco banco;
	
	public InterfaceTerminal (){ 
		System.out.print("Informe o banco: ");
		String nome = in.nextLine();
		this.banco = new Banco(nome);
	}
	
	public void imprimirMenu() {
		System.out.println("1 - Cadastrar usuario");
		System.out.println("2 - Cadastrar conta");
		System.out.println("3 - Sacar");
		System.out.println("4 - Depositar");
		System.out.println("5 - Apagar conta");		
		System.out.println("6 - Pegar Saldo");
		System.out.println("7 - Exportar contas");
		System.out.println("8 - Importar contas");
		System.out.println("9 - Sair");
	}
	
	public void rodar() {

		int opcao = 0;
		boolean sair = true;
		String nome;
		String cpf;
		int numAg;
		float valor;
		int numCont;

		while (sair) {
			imprimirMenu();
			System.out.print("Digite: ");
			opcao = in.nextInt();

			switch (opcao) {
				case 1:
					System.out.print("Nome: ");
					nome = in.next();
					System.out.print("CPF: ");
					cpf = in.next();
					banco.cadastrarUsuario(nome, cpf);
					System.out.println("Usuario cadastrado com sucesso.");
					break;
				case 2:
					System.out.print("CPF: ");
					cpf = in.next();
					banco.criarAgencia();
					banco.buscarAgencia(1);
					banco.cadastrarConta(cpf, 1);
					System.out.println("\nConta cadastrada com sucesso.");
					break;
				case 3:
					System.out.print("Agencia: ");
					numAg = in.nextInt();
					System.out.print("Conta: ");
					numCont = in.nextInt();
					System.out.print("Valor: ");
					valor = in.nextFloat();;
					if (banco.sacar(numAg, numCont, valor)){
						valor = banco.saldo(numAg, numCont);
						System.out.println("Saque concluido, valor em conta $" + valor);
						break;
					}
					else{
						System.out.print("Não foi possivel concluir o saque.");
						break;
					}
				case 4:
					System.out.print("Agencia: ");
					numCont = in.nextInt();
					System.out.print("Conta: ");
					numAg = in.nextInt();
					System.out.print("Valor: ");
					valor = in.nextFloat();
					if(banco.depositar(numAg, numCont, valor)){
						valor = banco.saldo(numAg, numCont);
						System.out.println("Deposito concluido, valor em conta $" + valor);
						break;
					}else{
						System.out.println("Não foi possivel concluir o deposito.");
						break;
					}
				case 5:
					System.out.print("Agencia: ");
					numAg = in.nextInt();
					banco.apagarAgencia(numAg);
					System.out.println("Agencia apagada com sucesso");
					break;
				
				case 6:
					System.out.print("Agencia: ");
					numAg = in.nextInt();
					System.out.print("Conta: ");
					numCont = in.nextInt();
					valor = banco.saldo(numAg, numCont);
					System.out.println("Saldo disponivel: "+ valor);
					break;
				
				case 7:
					System.out.print("CPF: ");
					cpf = in.next();
					System.out.print("Agencia: ");
					numAg = in.nextInt();
					System.out.print("Conta: ");
					numCont = in.nextInt();
					Usuario usuario = banco.buscarUsuario(cpf);
					Agencia agencia = banco.buscarAgencia(numAg);
					IConta conta = agencia.buscarConta(numCont);

					ManipuladorDeArquivos manipuladorDeArquivos = new ManipuladorDeArquivos();
					manipuladorDeArquivos.criarArquivo("teste.bin");
					if(ManipuladorDeBanco.escreverBanco("banco.txt", usuario, conta, agencia, banco)){
						System.out.println("Arquivo Salvo com Sucesso.");
						break;
					}else{
						System.out.println("Falha ao salvar arquivo.");
						break;
					}
				case 8:
					System.out.println("caminho do arquivo: ");
					String path = in.next();
					banco = ManipuladorDeBanco.lerBanco(path);
					usuario = ManipuladorDeBanco.lerUsuario(path);
					if( banco != null && usuario != null){
						System.out.println("Importacao do arquivo realizado com sucesso.");
						break;
					}
					else{
						System.out.println("Falha ao importar o arquivo.");
						break;
					}
				case 9:
					System.out.println("Fim");
					sair = false;
					break;	
			
				default:
					System.out.println("Fim");
					break;
			}
		}
	}

	public static void main(String[] args) {

		InterfaceTerminal ia = new InterfaceTerminal();
		ia.rodar();
	}
}