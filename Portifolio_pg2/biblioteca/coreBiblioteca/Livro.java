package biblioteca.coreBiblioteca;

import interfaces.ILivro;

public class Livro implements ILivro{
	public String titulo;
	public String isbn;
	public String autor;
	public String lancamento;
	public boolean emprestado;
	public boolean estado;
	public boolean digital;
	
	public Livro(String titutlo, String isbn, 
		String autor, String lancamento, 
		boolean estado, boolean digital
	) {
		this.emprestado = false;
		this.titulo = titutlo;
		this.isbn = isbn;
		this.autor = autor;
		this.lancamento = lancamento;
		this.estado = estado;
		this.digital = digital;
	}

	public String getTitulo(){
		return this.titulo;
	}

	public String getIsbn(){
		return this.isbn;
	}

	public String getAutor(){
		return this.autor;
	}

	public String getLancamento(){
		return this.lancamento;
	}

	public boolean getEstado(){
		return this.estado;
	}

	public void setEstado(boolean estado){
		this.estado = estado;
	}

	public boolean getEmprestado(){
		return this.emprestado;
	}

	public void setEmprestado(boolean estado){
		this.emprestado = estado;
	}

	public boolean getDigital(){
    return this.digital;
  }

	public String getUrl(){
		throw new InternalError("Nada consta");
	}

	public void setUrl(String newURL){
		throw new InternalError("Nada consta " +newURL);
	}
}
