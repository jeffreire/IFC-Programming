import java.util.ArrayList;

import core.Borracha;
import core.Caneta;
import core.Lapis;
import core.Livraria;
import core.Papel;
import interfaces.IProduto;

public class Main {

	public static void main(String[] args) {

		Caneta caneta = new Caneta("Caneta brasil", 5,"Bic", 2.99,"Azul");
		Papel papel = new Papel("Papel A3", 3, "Eco", 1.25, "branco", "A3");
		Lapis lapis = new Lapis("lapis grafite", 12, "Eco", 1.99, "Preto");
		Borracha borracha = new Borracha("Borracha apaga", 7, "Eco", 3.49, "Rosa","medio");

		Livraria livraria = new Livraria("Brusque");

		livraria.cadastrarProduto(caneta);
		livraria.cadastrarProduto(papel);
		livraria.cadastrarProduto(lapis);
		livraria.cadastrarProduto(borracha);
		
		String codigoCaneta0 = caneta.getCodigo();
		String codigoCaneta = caneta.getCodigo();
		String codigoPapel = papel.getCodigo();

		livraria.vender(codigoCaneta0);
		livraria.vender(codigoCaneta);
		livraria.vender(codigoPapel);

		ArrayList<IProduto> produtosEstocados = livraria.produtosEstocados();
		ArrayList<String> produtosVendidos = livraria.produtosVendidos();

		for (IProduto produto: produtosEstocados) {
			System.out.println("Produto: "+produto.getProduto()+
		 										 " Quantidade: "+produto.getQuantidade()+
		 										 " Preco: "+produto.getPreco());
		}

		for (String produto: produtosVendidos) {
			System.out.println(produto);
		}
	}
}
