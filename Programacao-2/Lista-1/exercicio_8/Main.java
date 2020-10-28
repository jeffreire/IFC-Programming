package exercicio_8;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main extends Livro{
   
   public static void main(String args[]){
      
      Scanner scan = new Scanner(System.in);
      List<String> teste = new ArrayList<String>();
      Livro livro = new Livro();
      int opcao;

      while(true)
      {
         System.out.println("\n Escolha uma das seguintes opcoes:\n\n"
                           +" 1 - Cadastrar Livro\n"
                           +" 2 - Remover Livro\n"
                           +" 3 - Alterar Livro\n"
                           +" 4 - Buscar Livro\n"
                           +" 5 - Consultar Dados dos Livros\n"
                           +" 6 - Sair\n");

         System.out.print(" opcoes escolhida: ");
         opcao = scan.nextInt();

         switch(opcao)
         {
            case 1:
               scan.nextLine();
               System.out.print("\n\t\t\t\t\t Livro: ");
               livro.setNome(scan.nextLine());
               System.out.print("\n\t\t\t\t\t Estado: ");
               livro.setEstado(scan.nextLine());
               System.out.print("\n\t\t\t\t\t Situacao: ");
               livro.setSituacao(scan.nextLine());
               livro.listagem(opcao);
               
               break;

            case 2:
               scan.nextLine();
               System.out.print("Qual livro deseja remover? ");
               livro.setNome(scan.nextLine());
               livro.listagem(opcao);
               
               break;

            case 3:
               scan.nextLine();
               System.out.print("Digite o nome do livro que deseja fazer alteracao ");
               livro.setNome(scan.nextLine());
               System.out.print("Deseja alterar o nome, estado ou situacao do livro? ");
               livro.setResposta(scan.nextLine());
               livro.listagem(opcao);
               
               break;
            
            case 4:
               scan.nextLine();
               livro.listagem(opcao);
               
               break;

            case 5:
               teste.addAll(livro.listagem(opcao));
               System.out.println("\t\t\t\t\t _____________________________________________");
               System.out.println("\t\t\t\t\t                  LIVROS");
               System.out.println("\t\t\t\t\t _____________________________________________");

               for(int i = 0; i < teste.size(); i++){
                  System.out.println("\t\t\t\t\t " + " " + teste.get(i));
               }
               System.out.println("\t\t\t\t\t _____________________________________________\n\n");
               
               break;  

            case 6:
               System.exit(0);
               scan.close();
               break;
            
            default:
               System.out.println("\t\t\t\t\t Opcao inexistente! Tente novamente.\n\n");
         }
      }
   }
}