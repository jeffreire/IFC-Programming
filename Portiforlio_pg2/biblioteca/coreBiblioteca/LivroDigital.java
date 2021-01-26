package biblioteca.coreBiblioteca;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LivroDigital extends Livro {
  public String url;
  public String dataCadastramento;

  Date dataAtual = new Date();
  SimpleDateFormat formatarData = new SimpleDateFormat(); 
  
  public LivroDigital(
    String titulo, 
    String isbn, 
    String autor, 
    String lancamento, 
    boolean estado,
    String url)
  {
    super(titulo, isbn, autor, lancamento, estado);
    this.url = url;
    this.dataCadastramento = formatarData.format(dataAtual);
  }
}
