package core;


public class Papel extends Produto{
	protected String produto;
	protected String tamanho;

	public Papel(
		String descricao,
		int quantidade,
		String marca,
		Double preco,
		String cor,
		String tamanho
	){
		super("Papel", descricao, quantidade, marca, preco, cor);
		this.tamanho = tamanho;
	}

	public String getTamanho(){
		return this.tamanho;
	}
}
