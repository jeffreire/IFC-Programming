package exercicio_7;
import java.util.Scanner;

public class NotaMateria {
   public static void main(String args[]) {
      
      Scanner console = new Scanner(System.in);
      
      System.out.println("Digite nota adquirida com os trabalhos: ");
      float NotaTrabalhos = console.nextFloat();
         
      if (NotaTrabalhos < 0 && NotaTrabalhos > 3) {
            System.out.println("O valor digitado esta incorreto, pois o peso dos trabalhos e 3");
            System.exit(0);
      }
         System.out.println("\nDigite nota adquirida com o primeiro portifolio: ");
         float NotaPort1 = console.nextFloat();
      
         if (NotaPort1 < 0 && NotaTrabalhos > 3.5) {
            System.out.println("O valor digitado esta incorreto, pois o peso do primeiro portifolio e 3.5");
            System.exit(0);
      }
      
      System.out.println("\nDigite nota adquirida com o segundo portif�lio: ");
      float NotaPort2 = console.nextFloat();
      if (NotaPort1 < 0 && NotaTrabalhos > 3.5) {
            System.out.println("O valor digitado esta incorreto, pois o peso do segundo portifolio e 3.5");
            System.exit(0);
      }

      float Total = NotaTrabalhos + NotaPort1 + NotaPort2;
      System.out.println("A nota final adquirida na materia e " + Total);
      console.close();
   }
}
