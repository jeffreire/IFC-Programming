package exercicio_2;

public class Main {
    public static void main(String args[]){
		//Criando os dos pontos8
		Ponto ponto1 = new Ponto(5, 9);
		Ponto ponto2 = new Ponto(8, 6);
		
		//Obtendo o ponto x 1 e 2
		float X1 = ponto1.getX();
		float X2 = ponto2.getX();
		
		//Obtendo o ponto y 1 e 2
		float y1 = ponto1.getY();
		float y2 = ponto2.getY();
		
		//Criando o raio a partir dos pontos
		Raio raio = new Raio(X1, y1, X2, y2);
		//Obtendo o raio
		float r = raio.getRaio();
		//Criando o objeto circulo passando o raio e o valor de pi
		Circulo circulo = new Circulo(r, 3.14);
		
		//Printando o resultado
		System.out.println("Area do Circulo: " + circulo.Area());
    }
}