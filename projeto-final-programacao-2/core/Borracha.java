package core;

public class Borracha extends Produto{
	String tamanho;
	
	public Borracha(
		String descricao, 
		int quantidade, 
		String marca, 
		Double preco,
		String cor,
		String tamanho
	){
		super("Borracha", descricao, quantidade, marca, preco, cor);
		this.tamanho = tamanho;
	}
 
	public String getTamanho(){
		return this.tamanho;
	}
	
	public String getCor(){
		return this.cor; 
	}
}
