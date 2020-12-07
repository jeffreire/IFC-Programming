package biblioteca.coreBiblioteca;

import java.util.ArrayList;
import arquivos.ManipuladorDeArquivos;

public class ManipuladorDeLivros {
    
    public static boolean escreverLivro(String caminho, Livro livro) {
        return ManipuladorDeArquivos.escreverArquivo(caminho, livro.toString());
    }

    public static Livro lerLivro(String caminho){
        
        Livro livro;
        ArrayList<String> texto = ManipuladorDeArquivos.lerArquivo(caminho);
		String linha = texto.get(0);
		String[] dados = linha.split(";");
        
        livro = new Livro(dados[0], 
                         dados[1],   
                         dados[2], 
                         dados[3],
                         Boolean.parseBoolean(dados[4]));
		return livro;
	}
}
