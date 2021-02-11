package banco.coreBanco;

import java.util.ArrayList;
import arquivos.ManipuladorDeArquivos;
import interfaces.IConta;

public class ManipuladorDeBanco {

	public static boolean escreverBanco(String caminho, Usuario usuario, IConta conta, Agencia agencia, Banco banco){
		ManipuladorDeArquivos.escreverArquivo(caminho, usuario.toString());
		ManipuladorDeArquivos.escreverArquivo(caminho, conta.toString());
		ManipuladorDeArquivos.escreverArquivo(caminho, agencia.toString());
		return ManipuladorDeArquivos.escreverArquivo(caminho, banco.toString());
	}

	public static Banco lerBanco(String caminho) {
		
		Usuario usuario;
		Banco banco;

		ArrayList<String> texto = ManipuladorDeArquivos.lerArquivo(caminho);
		String linha = texto.get(0);
		String[] dados = linha.split(";");

		usuario = new Usuario(dados[0], dados[1]);
		new Conta(usuario);
		new Agencia();
		banco = new Banco(dados[2]);

		return banco;
	}

	public static Usuario lerUsuario(String caminho){
		Usuario usuario;

		ArrayList<String> texto = ManipuladorDeArquivos.lerArquivo(caminho);
		String linha = texto.get(0);
		String[] dados = linha.split(";");

		usuario = new Usuario(dados[0], dados[1]);

		return usuario;
	}
}
