package biblioteca.coreBiblioteca;

public class Livro {
	public String titulo;
	public String isbn;
	public String autor;
	public String lancamento;
	public boolean emprestado;
	public boolean estado;
	
	public Livro(String titutlo, String isbn, String autor, String lancamento, boolean estado ) {
		this.emprestado = false;
		this.titulo = titutlo;
		this.isbn = isbn;
		this.autor = autor;
		this.lancamento = lancamento;
		this.estado = estado;
	}

	@Override
	public String toString(){
		return this.titulo+";"+this.isbn+";"+this.autor+";"+this.lancamento+";"+this.estado +";";
	}
}
