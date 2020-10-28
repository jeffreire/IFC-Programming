package exercicio_2;

public class Ponto{
	//Criando os objetos privado para o usuario
	private float X;
	private float y;
	
	//Contrutor da classe
	public Ponto(float x, float y){
		this.X = x;
		this.y = y;
	}
	
	//Metodo que obtem o valor de X
	public float getX(){
		return this.X;
	}
	
	//Metodo que obtem o valor de y
	public float getY(){
		return this.y;
	}
}