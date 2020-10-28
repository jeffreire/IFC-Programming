import java.util.Scanner;

class Avaliacao_1 {
    //Criando o objeto console para obter as entradas do usuario
        Scanner console = new Scanner(System.in);
		
    public void CalculandoFatorial(){
        //Pritando informações ao usuario
		System.out.println("Calculando o Fatoral");
        System.out.print("Informe o numero para calular: ");
        //Obtendo informaçoes do usuario e armazenando na variavel numero
        int numero = console.nextInt();
        //Declarando uma variavel resultado para armazenar a multiplicação
        int resultado = 1;
        //Enquanto o numero informado for diferente de zero, nao entrará no bloco.
        //Ou seja, temos um limite que é zero junto com uma validação implícita
        while (numero!=0){
            //Multiplicando e atribuindo o resultado a variavel resultado
            resultado*= numero;
            //Em cada execusao diminuimos 1 do numero informado ate chegar a zero que 
            //Finalizara a execusao
            numero--;
        }
        //Printando os resultados e a informçao final.
        //Informando ao usuario o final da execução
        System.out.println("Resultado Final: " + resultado);
        System.out.println("Fim");
	}
	
	public void Triangulos(){
	    System.out.print("Informe o lado A do triangulo: \nLado A: ");
	    int ladoA = console.nextInt();
	    System.out.print("Informe o lado b do triangulo: \nLado B: ");
	    int ladoB = console.nextInt();
	    System.out.print("Informe o lado C do triangulo: \nLado C: ");
	    int ladoC = console.nextInt();
	    if (ladoA == ladoB && ladoA == ladoC){
	        System.out.print("Tres lados Iguais. Seu triangulo é Equilatero.");
	    }
	    else if (ladoA == ladoB || ladoA ==ladoC){
	        System.out.print("Dois lados iguais. Seu triangulo é isosceles.");
	    }
	    else{
	        System.out.println("Tres lados diferentes. Nao é um triangulo Isosceles e nem Equilatero.");
	    }
	}
	
    public void CalcularIMC(){
        
        //solicitando ao usuario as informaçoes como peso e altura
        System.out.println("Calculadora do IMC !!");
        System.out.print("Informe: \nPeso: ");
        float peso = console.nextFloat();
        System.out.print("Altura: ");
        float altura = console.nextFloat();
        
        //calculando com a formula do IMC
        float imc = peso/(altura*altura);
        System.out.println("Seu IMC: " +(imc));
        
        //imc abaixo de 17, entao, Muito abaixo do peso
        if (imc < 17){
            System.out.println("Muito abaixo do peso.");
        }
        //imc maior ou igual a 17 e menor ou igual a 18.49, entao Abaixo do peso
        else if (imc >= 17 && imc <= 18.49){
            System.out.println("Abaixo do peso.");
        }
         //imc maior ou igual a 18.5 e menor ou igual a 24.99, entao peso normal
        else if(imc >=18.5 && imc <= 24.99){
            System.out.println("Peso normal.");
        }
         //imc maior ou igual a 25 e menor ou igual a 29.99, entao Acima do peso
        else if(imc >= 25 && imc <= 29.99){
            System.out.println("Acima do peso.");
        }
         //imc maior ou igual a 30 e menor ou igual a 34.99, entao obesidade 1
        else if(imc >= 30 && imc <= 34.99){
            System.out.println("Obesidade 1");
        }
         //imc maior ou igual a 35 e menor ou igual a 39.99, entao obesidade 2
        else if(imc >= 35 && imc <= 39.99){
            System.out.println("Obesidade 2");
        }
         //imc maior que 40, entao obesidade 3
        else{
            System.out.print("Obesidade 3");
        }
    }
}

public class TestarCodigo {
    public static void main(String args[]){
        // Criando um objeto da classe avaliação_1
        Avaliacao_1 avalia = new Avaliacao_1();
        //Chamando o método desejado 
        avalia.CalculandoFatorial();
        System.out.println("-------------------------------------------");
        avalia.Triangulos();
        System.out.println("-------------------------------------------");
        avalia.CalcularIMC();
    }
}