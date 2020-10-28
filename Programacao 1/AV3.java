import java.util.Scanner;
import java.util.Random

class AV3{
	
	public void jogadorDeTenis(){	
		//Declarando o objeto Scanner para obter informacoes do teclado;
		Scanner console = new Scanner(System.in);
		System.out.println("Informe a situação climatica: ");
		//Apresentando ao usuario um menu de escolhas de acordo com o clima 
		//No momento
		System.out.print("Digite:\n1 para Nublado\n2 para Chuvoso\n3 para Solarado\nResposta: ");
		int clima = console.nextInt();
		//Verificando se  a informacoes do teclado for igual a 1 = nublado, entao:
		if (clima == 1)
		//Printa para o jogador que ele pode sair para jogar
			System.out.println("Voce pode sair para jogar tenis\nFim");
		//Entao se for igual a 2 = Chuvosom, entao:
		}else if(clima == 2){
			//Informa que precisamos ralizar outra verificacao
			System.out.println("Devemos verificar o vento: ");
			//Apresentamos ao usuario um meno de escolhas de acordo com o vento no momento
			System.out.print("Digite:\n1 para vento Fraco;\n2 para vento Forte.\nResposta: ");
			int vento = console.nextInt();
			//Se informacao do usuario for igual a 1 = vento fraco, entao:
			if (vento == 1){
			//Printa que o jogador pode sair para jogar
				System.out.println("Voce pode sair para jogar tenis.\nFim");
			}
			//Caso contrario, printa que nao pode sair para jogar
			else{
				System.out.println("Voce nao pode sair para jogar tenis");
			}
		}
		//Caso a informacao do menu seja diferente das demais = Solorado, entao:
		else{
			//Printa que devemos ralizar outra verificacao
			System.out.println("Devemos verificar a humidade.\nDigite:");
			//Apresenta para o usuario um menu de humidade;
			System.out.print("1 para Alto\n2 para normal\nResposta: ");
			int humidade = console.nextInt();
			//Caso humidade seja igual a 1 = alto
			if ( humidade == 1){
			//Printa que o jogador pode sair para jogar tenis
				System.out.println("Voce pode sair para jogar tenis\nFim");
			}
			//Caso contrario nao podera sair para jogar
			else{
				System.out.println("Voce nao pode sair para jogar tenis\nFim");
			}
		}
	}
	//Metodo que sorteara o numero 7
	public void sorteandoNumeroSete(){
		//Declarando o objeto Random
		Random r = new Random();
		//Declarando a variavel do numero premiado
		int numeroPremiado = 7;
		//Declarando a variavel contador
		int contador = 0;
		//Declarando a variavel numero sorteado
		int numeroSorteado = 0;
		//Declarando a variavel que ira receber a soma dos numeros sorteados
		int somaDosNumerosSorteados = 0;
		//variavel que ira receber os maiores numero no momento
		int maiorNumero = 0;
		//Variavel que ira receber o menor numero sorteado,
		int menorNumero = 0;
		while (true){
			//A cada execusao a variavel contador receberá +1;
			contador+=1;
			//sorteado um numero de 1 a 20;
			numeroSorteado = r.nextInt(20)+1;
			System.out.println("Foi sorteado: " +numeroSorteado);
			//A cada numero sorteado sera atribuido a variavel somaDosNumerosSorteados
			somaDosNumerosSorteados+=numeroSorteado;
			//Verificando se o numero sorteado for igual ao numero premiado
			if (numeroSorteado == numeroPremiado){
				//Entao verificacao se nunhuma das duas variavel recebeu alteração;
			    if (maiorNumero == 0 && menorNumero == 0){
					//Entao as duas variaveis recebem o numero sortedo
			        maiorNumero = numeroSorteado;
			        menorNumero = numeroSorteado;
					//Interrompendo o loop
                    break;
			    }
				//Caso contrario finalizamos a exrecusao
			    else{
			        break;
			    }
			}
			//Caso numero sorteado for maior que o menor numero sorteado ate o momento
			// E maior que o maior numero sorteado ate o momento, entao:
			else if (numeroSorteado > menorNumero && numeroSorteado > maiorNumero){
					//A variavel maiorNumero recebe o numeroSorteado
					maiorNumero = numeroSorteado;
				}
			//Caso contrario, verifica-se o numeroSorteado é igual a 0
			// ou menor que o menorNumero, entao,
			}else {
				if (menorNumero == 0 || menorNumero > numeroSorteado){
				//MenorNumero recebe o numeroSorteado
					menorNumero = numeroSorteado;
				//Caso contrario, continue
				}else{
				    continue;
				}
			}
		}
		//Printando as informacoes
    	System.out.println("Foi sorteado: " + contador +" numeros");
    	System.out.println("Maior numero sorteado: "+maiorNumero);
    	System.out.println("Menor numero sorteado: " +menorNumero);
    	System.out.println("Soma dos numeros sorteados: "+somaDosNumerosSorteados);
    }
}
//Declarando uma class para testar os codigos
public class TestarCodigo {
    public static void main(String[] args){
		//Declarando o contruror da classe AV3
	    AV3 avaliando = new AV3();
		//avaliando.jogadorDeTenis();
		avaliando.sorteandoNumeroSete();
    }
}