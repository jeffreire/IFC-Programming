package interfaces;

import java.util.ArrayList;

public interface IEstoque {
	public IProduto buscarProduto(String codigo);
	public void estocarProduto(IProduto object);
	public ArrayList<IProduto> listarProdutos();
	public void deletarProduto(IProduto produto);
}
