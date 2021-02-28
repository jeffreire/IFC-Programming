package core;

import java.util.ArrayList;

import interfaces.IEstoque;
import interfaces.IProduto;

public class Estoque implements IEstoque{
	ArrayList<IProduto> produtos;
	IProduto produto;

	public Estoque(){
		this.produtos = new ArrayList<IProduto>();
	}

	public void estocarProduto(IProduto object){
		this.produtos.add(object);
	}

	public ArrayList<IProduto> listarProdutos(){
		return this.produtos;
	}

	public void deletarProduto(IProduto produto){
		int newQuantidade = produto.getQuantidade()-1;
		produto.setQuantidade(newQuantidade);
	}

	public IProduto buscarProduto(String codigo) {
		for ( IProduto produto : produtos){
			if (produto.getCodigo().equals(codigo)){
				return produto;
			}
		}
		return null;
	}
}