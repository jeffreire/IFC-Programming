package biblioteca;

import arquivos.ManipuladorDeArquivos;
import biblioteca.coreBiblioteca.Livro;
import biblioteca.coreBiblioteca.ManipuladorDeLivros;

public class teste { 

    public static void main(String[] args) {

        Livro livro = new Livro("abc", "jeff", "joao", "25/12/2020", true);
        ManipuladorDeArquivos manipuladorDeArquivos = new ManipuladorDeArquivos();
		manipuladorDeArquivos.criarArquivo("teste.bin");
        ManipuladorDeLivros.escreverLivro("livro.txt", livro);
        
        livro = ManipuladorDeLivros.lerLivro("livro.txt");

        System.out.println(livro.autor);
    }
}