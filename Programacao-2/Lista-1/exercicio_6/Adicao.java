package exercicio_6;
import java.util.ArrayList;

public class Adicao {
	
	private ArrayList<Float> numeros = new ArrayList<Float>();
	
	public Adicao(ArrayList<Float> numeros){
		
		this.numeros = numeros;
	}
	
	public float resultado(){
		
		float r = 0;
		for(float numero : numeros){
			r += numero;
		}
		
		return r;
	}
}