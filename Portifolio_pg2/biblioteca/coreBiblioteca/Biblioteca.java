package biblioteca.coreBiblioteca;

import java.util.ArrayList;

import interfaces.ILivro;

public class Biblioteca {
	
	ArrayList<ILivro> livros;

	public Biblioteca() {
		this.livros = new ArrayList<ILivro>();
	}

	public void cadastrarLivro(
		String titulo, 
		String isbn, 
		String autor, 
		String lancamento, 
		boolean estado) 
	{
		Livro novo = new Livro(titulo, isbn, autor, lancamento, estado, false);
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
		LivroDigital livroNovo = new LivroDigital(titulo, isbn, autor, lancamento, estado, url, false);
		this.livros.add(livroNovo);
	}

	public boolean removerLivro(String titulo) {
		ILivro livro = buscar("titulo", titulo);
		if (livro != null) {
			this.livros.remove(livro);
			return true;
		}
		return false;
	}

	public ILivro buscar(String campo, String valor){
		switch (campo) {
		case "titulo":
			for (ILivro livro : livros) {
				if (livro.getTitulo().equals(valor)) {
					return livro;
				}
			}
			break;
		case "isbn":
			for (ILivro livro : livros) {
				if (livro.getIsbn().equals(valor)) {
					return livro;
				}
			}
			break;
		case "autores":
			for (ILivro livro : livros) {
				if (livro.getAutor().equals(valor)) {
					return livro;
				}
			}
			break;
		case "lancamento":
			for (ILivro livro : livros) {
				if (livro.getLancamento().toString().equals(valor)) {
					return livro;
				}
			}
			break;
		case "emprestado":
			for (ILivro livro : livros) {
				if (livro.getEmprestado() == Boolean.getBoolean(valor)) {
					return livro;
				}
			}
			break;
		case "estado":
			for (ILivro livro : livros) {
				if (livro.getEstado() == Boolean.getBoolean(valor)) {
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
		ILivro livro = buscar("titulo", titulo);
		if (livro != null) {
			livro.setEstado(!livro.getEstado());
			return true;
		}
		return false;
	}
	
	public void trocarSituacao(String titulo) {
		ILivro livro = buscar("titulo", titulo);
		if (livro != null)
			livro.setEmprestado(!livro.getEmprestado());
	}

	public boolean trocarURL(String newurl,  String titulo){
		ILivro livro = buscar("titulo", titulo);

		if (livro != null && livro.getDigital() == true) {
			livro.setUrl(newurl);
			return true;
		}
		return false;
	}

}