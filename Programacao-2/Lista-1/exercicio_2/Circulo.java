package exercicio_2;

public class Circulo {
	//Declarando o objeto raio e pi
	private float raio;
	private double pi;
	
	//Metodo circulo passando o raio e o pi
	public Circulo(float r, double pi){
		this.raio = r;
		this.pi = pi;
	}
	
	//Obtendo a area total do circulo
	public float Area () {
		return (float) (2*this.pi*this.raio);
	}
}