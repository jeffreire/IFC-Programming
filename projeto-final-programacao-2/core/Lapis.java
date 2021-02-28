package core;

public class Lapis extends Produto{

	public Lapis(
		String descricao,
		int quantidade,
		String marca,
		Double preco,
		String cor
	){
		super("Lapis",descricao, quantidade, marca, preco, cor);
	}

	public String getCor(){
		return this.cor;
	}
}
