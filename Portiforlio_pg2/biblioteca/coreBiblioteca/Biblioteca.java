package biblioteca.coreBiblioteca;

import java.util.ArrayList;

public class Biblioteca {
	
	ArrayList<Livro> livros;
	ArrayList<LivroDigital> livrosDigitais;

	public Biblioteca() {
		this.livros = new ArrayList<Livro>();
		this.livrosDigitais = new ArrayList<LivroDigital>();
	}

	public void cadastrarLivro(
		String titulo, 
		String isbn, 
		String autor, 
		String lancamento, 
		boolean estado) 
	{
		Livro novo = new Livro(titulo, isbn, autor, lancamento, estado);
		this.livros.add(novo);
	}

	public void cadastrarLivroDigital(
		String titulo,
		String isbn,
		String autor,
		String lancamento,
		boolean estado,
		String url
	){
		LivroDigital livroNovo = new LivroDigital(titulo, isbn, autor, lancamento, estado, url);
		this.livrosDigitais.add(livroNovo);
	}

	public boolean removerLivroDigital(String titulo) {
		LivroDigital livro = buscarLivroDigital("titulo", titulo);
		if (livro != null){
			this.livrosDigitais.remove(livro);
			return true;
		}
		return false;
	}

	public boolean removerLivro(String titulo) {
		Livro livro = buscar("titulo", titulo);
		if (livro != null) {
			this.livros.remove(livro);
			return true;
		}
		return false;
	}

	public LivroDigital buscarLivroDigital(String campo, String titulo) {
		for (LivroDigital livro : livrosDigitais) {
			if (livro.titulo.equals(titulo)) {
				return livro;
			}
		}
		return null;
	}	

	public Livro buscar(String campo, String valor){
		switch (campo) {
		case "titulo":
			for (Livro livro : livros) {
				if (livro.titulo.equals(valor)) {
					return livro;
				}
			}
			break;
		case "isbn":
			for (Livro livro : livros) {
				if (livro.isbn.equals(valor)) {
					return livro;
				}
			}
			break;
		case "autores":
			for (Livro livro : livros) {
				if (livro.autor.equals(valor)) {
					return livro;
				}
			}
			break;
		case "lancamento":
			for (Livro livro : livros) {
				if (livro.lancamento.toString().equals(valor)) {
					return livro;
				}
			}
			break;
		case "emprestado":
			for (Livro livro : livros) {
				if (livro.emprestado == Boolean.getBoolean(valor)) {
					return livro;
				}
			}
			break;
		case "estado":
			for (Livro livro : livros) {
				if (livro.estado == Boolean.getBoolean(valor)) {
					return livro;
				}
			}
			break;
		default:
			break;
		}
		
		return null;
	}

	public boolean trocarEstado(String titulo) {
		Livro livro = buscar("titulo", titulo);
		if (livro != null) {
			livro.estado = ! livro.estado;
			return true;
		}
		return false;
	}
	
	public void trocarSituacao(String titulo) {
		Livro livro = buscar("titulo", titulo);
		livro.emprestado = ! livro.emprestado;
	}
}
