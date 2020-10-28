import java.util.Scanner;
import java.lang.Math;

class AV2{
    public static void verificarTemperaturaCorporal(){
		//Declarando a variavel temperatura
        int temperatura;
		//Declarando a variavel executador
        boolean executador = true;
		//Enquanto executador for verdade, continue
        while (executador){
			//Criando o objeto console que ira obter informações do usuario
            Scanner console = new Scanner(System.in);
			//Solicitando a temperatura para o usuario
            System.out.print("Informe a sua temperatura: ");
			//Armazenado o valor de entrada na variavel temperatura
            temperatura = console.nextInt();
			//Printando na tela o valor da temperatura
            System.out.println(temperatura);
			//Primeira validacao, se o valor informado for igual a zero
            if(temperatura == 0){
                System.out.println("Programa encerrado.");
				//Executador recebera falso, interropendo a execusao
				executador = false;
			}
			//Segunda validacao, Entao se temperatura for maior que 36.5
            else if ((temperatura > 36.5) && (temperatura < 37.5)){
				//Printara essa mensagem
                System.out.println("A Temperatura corporal se encontra Normal.");
            }
			//Entao Se temperatura for maior que 30 e menor que 36.5
            else if((temperatura > 30) && (temperatura < 36.5)){
				//Entao printara essa mensagem
                System.out.println("A temperatura corporal se encontra em estado de ter uma Hiportemia");
			}
			//Entao Se temperatura for menor que 30
			else if( temperatura < 30){
				//Entao printara essa mensagem
                System.out.println("A temperatura corporal se encontra em estado critico, precisa se aquecer.");
            }
			//Entao Se temperatura for maior que 37.5 e menor que 40
			else if((temperatura > 37.5) && (temperatura < 40)){
				//Printara essa mensagem
                System.out.println("A temoeratura corporal se encontra em estado Febril.");
            }
			//Entao se nao for nenhuma das validacao acima
			else
			{
				//Printa essa mensagem
                System.out.println("Febre muito alta, tem que tomar medidas urgentes.");
            }
        }
    }

    //Criando programa com While
    public static void somatorioComWhile(){
        System.out.println("Executando While");
        //Declarando o numero que será convergido
        double valorAConvergir = 2;
        //Declarando a variacel contadora e
        int n = 0;
        //Declarando a variavel que armazenara a soma
        float resultado = 1;
        // Executador while enquanto o resultado for diferente do valor esperado
        while (resultado != valorAConvergir){
            // A cada execusao é agregado +1 a variavel 
            n+=1;
            // Formula do somatorio infinito
            resultado += (1*Math.pow(0.5, n));
            // Printando o resultado atual
            System.out.println(resultado);
        }
        // Printando os resultados finais
        System.out.println("O somatorio ira convergir em: "+ resultado);
        System.out.println("A quantidade de termos exato para convergir o resultado é de: "+ n);
    }
    //Criando programa com for
    public static void somatorioComFor(){
        System.out.println("Executando For");
        // Declarando o numero maximo de vezes que o for ira executar
        int n = 24;
        // Declarando a variavel que ira armazenar o resultado da soma
        float resultado = 1;
        // For que executara enquanto i < n
        for(int i = 1; i <= n; i++) {
            // Formula do somatorio infinito
            resultado += (1*Math.pow(0.5, i));
            // Printando resultado da execusao atual
            System.out.println(resultado);
        }
        // Printando os resultados Finais
        System.out.println("O somatorio ira convergir em: "+ resultado);
        System.out.println("A quantidade de termos exato para convergir o resultado é de: "+ n);
    }
}

//Criando class para testar os metodos
public class TestarCodigo {
	//Crinado metodo
    public static void main(String[] args){
		//Criando objeto
	    AV2 testarCodigo = new AV2();
		//Chamando os metodos
	    testarCodigo.verificarTemperaturaCorporal();
		
		testarCodigo.somatorioComWhile();
		testarCodigo.somatorioComFor();
    }
}