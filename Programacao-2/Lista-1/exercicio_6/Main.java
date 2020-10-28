package exercicio_6;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		
		int opcao;
		int contador;
		float numero1;
		float numero2;
		float resultado;
		ArrayList<Float> numeros = new ArrayList<Float>();

		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		
		Calculadora calculadora = new Calculadora();
		
		System.out.println("Menu Calculadora");
		System.out.println("1 - Divisao");
		System.out.println("2 - Multiplicacao");
		System.out.println("3 - Subtracao");
		System.out.println("4 - Adicao");
		System.out.println("0 - Sair");
		
		System.out.print("Informe: ");
		opcao = console.nextInt();

		try {
			switch( opcao ) {
				case 1:
					System.out.println("Divisao!");
					System.out.println("Informe o dividendo: ");
					numero1 = console.nextFloat();
					System.out.println("Informe o divisor: ");
					numero2 = console.nextFloat();
	
					if (numero2 == 0){
						
						System.out.print("O divisor nao pode ser zero!");
						
						break;
					}
					resultado = calculadora.divisao(numero1, numero2);
					System.out.println("O resultado da divisao: "+resultado);
					
					break;
					
				case 2:
					contador = 0;
					System.out.println("Multiplicacao!");
					
					while (true){
						contador+=1;
						System.out.println("Informe o "+contador+" numero: ");
						numero1 = console.nextFloat();
						numeros.add(numero1);
						System.out.println("Deseja informar mais numeros? S / N");
						
						String r = console.next();
						r = r.toUpperCase();
						
						if (r.equals("N")){
							
							resultado = calculadora.multiplicacao(numeros);
							System.out.println("O resultado da multiplicacao é: "+resultado);
	
							break;
	
						} else{

							continue;
						}
					}
					break;
					
				case 3:
					System.out.println("Subtracao!");
					System.out.println("Informe o primeiro numero: ");
					numero1 = console.nextFloat();
					System.out.println("Informe o segundo numero: ");
					numero2 = console.nextFloat();
					resultado = calculadora.subtracao(numero1, numero2);
					System.out.println("O resultado da subtracao é: "+resultado);
					
					break;
				
				case 4:
					contador = 0;
					System.out.println("Adicao!");
					
					while (true){
						contador+=1;
						System.out.println("Informe o "+contador+"º numero: ");
						numero1 = console.nextFloat();
						numeros.add(numero1);
						System.out.println("Deseja informar mais numeros? S / N");
						String r = console.next();
						r = r.toUpperCase();
						
						if (r.equals("N")){
	
							resultado = calculadora.adicao(numeros);
							System.out.println("O resultado da adicao: "+ resultado);
	
							break;
						}else{
							continue;
						}
					}
					break;
				
				case 0:
					break;
				
				default:
					
					System.out.println("Operacao Invalida!");
				
					break;
			}
			
		} catch (Exception e) {
			System.out.println("Informacao invalida");
		}
		
		System.out.println("Fim");
	}
}