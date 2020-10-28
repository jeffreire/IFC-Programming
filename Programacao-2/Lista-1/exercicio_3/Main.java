package exercicio_3;

public class Main {

    public static void main(String[] args) {
        Carro car = new Carro();
        // carro normal
        car.setPlaca("ABC1234");
        car.setCor("BRANCA");
        car.setModelo("LAND ROVER");
        car.setConversivel(false);
        car.setMovendo(false);
        System.out.println(car.toString());
        // carro conversivel
        car.setModelo("MERCEDES AMG");
        car.setConversivel(true);
        System.out.println("Carro agora é conversível e mudou modelo => " + car.toString());
        // carro está se movendo
        car.setMovendo(true);
        System.out.println("Carro está se movendo => " + car.toString());
    } 
}