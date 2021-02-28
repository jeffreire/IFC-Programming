package core;

import java.util.ArrayList;
import interfaces.IProduto;

public class Livraria extends Estoque {
	ArrayList<String> produtosVendidos;
	Estoque estoque;
	String nome;
	IProduto produto;

	public Livraria(String nome){
		this.nome = nome;
		this.produtosVendidos = new ArrayList<String>();
		this.estoque = new Estoque();
	}

	public boolean vender(String codigo){
		produto = estoque.buscarProduto(codigo);
		if (produto!=null){
			produtosVendidos.add(
				"Produto: "+produto.getProduto()+
				" Codigo: "+produto.getCodigo());
			int newQuantidade = produto.getQuantidade() -1;
			produto.setQuantidade(newQuantidade);
			return true;
		}
		return false;
	}

	public void cadastrarProduto(IProduto produto){
		estoque.estocarProduto(produto);
	}

	public ArrayList<IProduto> produtosEstocados(){
		return estoque.listarProdutos();
	}

	public ArrayList<String> produtosVendidos(){
		return this.produtosVendidos;
	}
}
