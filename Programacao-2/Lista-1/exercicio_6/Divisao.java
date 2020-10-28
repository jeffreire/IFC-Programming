package exercicio_6;

public class Divisao{
	
	private float numero1;
	private float numero2;
	
	public Divisao(float numero1, float numero2){
		
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	public float resultado(){
		
		return this.numero1 / this.numero2;
	}
}