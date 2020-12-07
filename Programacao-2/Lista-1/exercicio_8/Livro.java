package exercicio_8;

import java.util.List;
import java.util.Scanner;

import java.util.ArrayList;

public class Livro
{
   List<String> livros = new ArrayList<String>();
   
   private String nome;
   private String nome2;
   private String situacao;
   private String situacao2;
   private String estado;
   private String estado2;
   private String resposta;

   Scanner in = new Scanner(System.in);
  
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

   public String getEstado2() {
	   return this.estado2;
   }

   public void setEstado2(String estado2) {
	   this.estado2 = estado2;
   }

   public String getSituacao() {
	   return this.situacao;
   }

   public void setSituacao(String situacao) {
	   this.situacao = situacao;
   }

   public String getEstado() {
	   return this.estado;
   }

   public void setEstado(String estado) {
	   this.estado = estado;
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

   public void setNome(String nome){
      this.nome = nome;
   }

   public List<String> listagem(int selecao){

      if(selecao == 1){
         livros.add(getNome());
         livros.add(getEstado());
         livros.add(getSituacao());
      }
      if(selecao == 2){

         livros.remove(getNome());
      }
      if(selecao == 3 && this.resposta == "nome"){
    	   System.out.println("\nPara qual livro deseja alterar? ");
         setNome2(in.nextLine());
         livros.remove(getNome());
         livros.add(getNome2());
         
      }
      if(selecao == 3 && this.resposta.equals("estado")){
    	   System.out.println("\nPara qual estado deseja alterar? ");
         setEstado2(in.nextLine());
         livros.remove(getEstado());
         livros.add(getEstado2());
     
      }
      if(selecao == 3 && this.resposta.equals("situacao")){
    	   System.out.println("\nPara qual situacao deseja alterar? ");
         setSituacao2(in.nextLine());
         livros.remove(getSituacao());
         livros.add(getSituacao2());
      }
      if(selecao == 4){
         System.out.println("\nDigite o nome que deseja buscar: ");
         String busca = in.nextLine();

    	   if (livros.contains(busca)) {
            System.out.println("\nO nome " + busca + " cont�m na lista."); 
    	   }else{
            System.out.println("\nO nome " + busca + " n�o cont�m na lista.");
         }
      }
	return livros;
   }
}