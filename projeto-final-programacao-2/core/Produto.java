package core;

import java.util.UUID;

import interfaces.IProduto;

public class Produto implements IProduto{
	protected String produto;
	protected String descricao;
	protected int quantidade;
	protected String marca;
	protected Double preco;
	protected String cor;
	private String codigo = UUID.randomUUID().toString();

	public Produto(
		String produto,
		String descricao, 
		int quantidade, 
		String marca, 
		double preco,
		String cor
	){
		this.descricao 	= descricao;
		this.quantidade = quantidade;
		this.marca 			= marca;
		this.preco			= preco;
		this.cor				= cor;
		this.produto 		= produto;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public int getQuantidade() {
		return this.quantidade;
	}

	public String getMarca() {
		return this.marca;
	}
	
	public double getPreco() {
		return this.preco;
	}

	public String getCodigo(){
		return this.codigo;
	}

	public String getProduto(){
		return this.produto;
	}

	public void setQuantidade(int newQuantidade) {
		this.quantidade = newQuantidade;
	}
}