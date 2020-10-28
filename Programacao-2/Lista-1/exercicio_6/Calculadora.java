package exercicio_6;
import java.util.ArrayList;

public class Calculadora {
	
	public float divisao( float numero1, float numero2) {
		
		Divisao dividir = new Divisao(numero1, numero2);

		float resultado = dividir.resultado();
		
		return resultado;
	}
		
	public float multiplicacao(ArrayList<Float> numeros) {
		
		Multiplicacao multiplicar = new Multiplicacao(numeros);
		float resultado = multiplicar.resultado();
		
		return resultado;
	}	
		
	public float subtracao(float numero1, float numero2) {
		
		Subtracao subtrair = new Subtracao(numero1, numero2);
		float resultado = subtrair.resultado();
		
		return resultado;
	}
	
	public float adicao(ArrayList<Float> numeros){
		
		Adicao soma = new Adicao(numeros);
		float resultado = soma.resultado();
		
		return resultado;
	}
}