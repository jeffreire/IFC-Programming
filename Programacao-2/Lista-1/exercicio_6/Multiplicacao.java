package exercicio_6;
import java.util.ArrayList;

public class Multiplicacao{
	
	private ArrayList<Float> numeros = new ArrayList<Float>();
	
	public Multiplicacao(ArrayList<Float> numeros) {
		
		this.numeros = numeros;
	}
	
	public float resultado(){
		
		float r = 1;
		for(float numero : this.numeros){
			r *= numero;
		}
		return r;
	}
}