package exercicio_2;
import java.lang.Math;

public class Raio{ 
	//Criando os objetos 
	private float X;
	private float y;
	private float X1;
	private float y1;
	
	//Contrutor da classe
	public Raio(float X, float y, float X1, float y1){
		this.X = X;
		this.y = y;
		this.X1 = X1;
		this.y1 = y1;
	}
	
	//Obtendo o valor do raio atraves da formula da distancia
	public float getRaio(){
		return (float) Math.sqrt(Math.pow((this.X - this.X1), 2.0) + Math.pow((this.y - this.y1), 2.0));
	}
}