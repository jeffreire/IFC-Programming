package exercicio_9;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main extends Funcionario
{
   public static void main(String args[])
   {
      Scanner scan = new Scanner(System.in);
      List<String> teste = new ArrayList<String>();
      Funcionario funcionario = new Funcionario();
      int opcao;

      while(true)
      {
         System.out.println("\n Escolha uma das seguintes opcao:\n\n"
                           +" 1 - Cadastrar Funcionario\n"
                           +" 2 - Remover Funcionario\n"
                           +" 3 - Alterar Funcionario\n"
                           +" 4 - Buscar Funcionario\n"
                           +" 5 - Consultar Dados dos Funcionario\n"
                           +" 6 - Sair\n");

         System.out.print(" Opcao escolhida: ");
         opcao = scan.nextInt();

         switch(opcao)
         {
            case 1:
               scan.nextLine();
               System.out.print("\n\t\t\t\t\t Nome: ");
               funcionario.setNome(scan.nextLine());
               System.out.print("\n\t\t\t\t\t Setor: ");
               funcionario.setSetor(scan.nextLine());
               System.out.print("\n\t\t\t\t\t Situacao: ");
               funcionario.setSituacao(scan.nextLine());
               funcionario.listagem(opcao);
               
               break;
               
            case 2:
               scan.nextLine();
               System.out.print("Qual funcionorio deseja remover? ");
               funcionario.setNome(scan.nextLine());
               funcionario.listagem(opcao);
               
               break;

            case 3:
               scan.nextLine();
               System.out.print("Digite o nome do funcionario que deseja fazer alteracao ");
               funcionario.setNome(scan.nextLine());
               System.out.print("Deseja alterar o nome, setor ou situacao do funcionario? ");
               funcionario.setResposta(scan.nextLine());
               funcionario.listagem(opcao);
              
               break;

            case 4:
               scan.nextLine();
               funcionario.listagem(opcao);
               
               break;

            case 5:
               teste.addAll(funcionario.listagem(opcao));
               System.out.println("\t\t\t\t\t _____________________________________________");
               System.out.println("\t\t\t\t\t                  FUNCIONARIOS");
               System.out.println("\t\t\t\t\t _____________________________________________");

               for(int i = 0; i < teste.size(); i++)
               {
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