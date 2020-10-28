package exercicio_9;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Funcionario
{
   List<String> funcionarios = new ArrayList<String>();
   Scanner in = new Scanner(System.in);

   private String nome;
   private String nome2;
   private String situacao;
   private String situacao2;
   private String setor;
   private String setor2;
   private String resposta;
   
   public String getSetor2() {
	   return this.setor2;
   }

   public void setSetor2(String setor2) {
      this.setor2 = setor2;
   }

   public String getResposta() {
	   return this.resposta;
   }

   public void setResposta(String resposta) {
      this.resposta = resposta;
   }

   public String getSituacao2() {
      return this.situacao2;
   }

   public void setSituacao2(String situacao2) {
      this.situacao2 = situacao2;
   }

   public String getSituacao() {
      return situacao;
   }

   public void setSituacao(String situacao) {
      this.situacao = situacao;
   }

   public String getSetor() {
      return this.setor;
   }

   public void setSetor(String setor) {
      this.setor = setor;
   }
   
   public String getNome2() {
      return this.nome2;
   }

   public void setNome2(String nome2) {
      this.nome2 = nome2;
   }

   public String getNome(){
      return this.nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public List<String> listagem(int selecao) {  
      if(selecao == 1){
         funcionarios.add(getNome());
         funcionarios.add(getSetor());
         funcionarios.add(getSituacao());
      }
      if(selecao == 2){
         funcionarios.remove(getNome());
      }
      if(selecao == 3 && this.resposta.equals("nome")){
    	   System.out.println("\nPara qual nome deseja alterar? ");
         setNome2(in.nextLine());
         funcionarios.remove(getNome());
         funcionarios.add(getNome2());
         
      }
      if(selecao == 3 && this.resposta.equals("setor")){
    	   System.out.println("\nPara qual setor deseja alterar? ");
         setSetor2(in.nextLine());
         funcionarios.remove(getSetor());
         funcionarios.add(getSetor2());
     
      }
      if(selecao == 3 && this.resposta.equals("situacao")){
    	   System.out.println("\nPara qual situacao deseja alterar? ");
         setSituacao2(in.nextLine());
         funcionarios.remove(getSituacao());
         funcionarios.add(getSituacao2());
      }
          
      if(selecao == 4){
    	   System.out.println("\nDigite o nome que deseja buscar: ");
         String busca = in.nextLine();

    	   if (funcionarios.contains(busca)) {
    	      System.out.println("\nO nome " + busca + " contem na lista.");
    	   }else{
   	      System.out.println("\nO nome " + busca + " nao contem na lista.");
    	   }
      }
      return funcionarios;
   }
}