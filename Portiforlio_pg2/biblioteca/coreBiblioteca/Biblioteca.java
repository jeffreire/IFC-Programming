package biblioteca.coreBiblioteca;

import java.util.ArrayList;

public class Biblioteca {
	
	ArrayList<Livro> livros;

	public Biblioteca() {
		this.livros = new ArrayList<Livro>();
	}

	public void cadastrarLivro(String titulo, String isbn, String autor, String lancamento, boolean estado) {
		Livro novo = new Livro(titulo, isbn, autor, lancamento, estado);
		this.livros.add(novo);
	}

	public boolean removerLivro(String titulo) {
		Livro livro = buscar("titulo", titulo);
		if (livro != null) {
			this.livros.remove(livro);
			return true;
		}
		return false;
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
