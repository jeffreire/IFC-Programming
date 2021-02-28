package core;


public class Caneta extends Produto{
	public Caneta(
		String descricao,
		int quantidade,
		String marca,
		Double preco,
		String cor
	){
		super("Caneta", descricao, quantidade, marca, preco, cor);
	}

	public String getCor(){
		return this.cor;
	}
}