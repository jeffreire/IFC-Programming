package exercicio_1;

public class Main{
       
    public static void main(String[] args) {

        float x = 2;
        float y = 6;

        Ponto ponto = new Ponto(x, y);
        
        System.out.println("coordenada do Ponto: ["+ponto.getX()+", "+ponto.getY()+"]");
    }
}