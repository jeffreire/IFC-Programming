package biblioteca.coreBiblioteca;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LivroDigital extends Livro {
  public String url;
  public Boolean digital;
  public String dataCadastramento;

  Date dataAtual = new Date();
  SimpleDateFormat formatarData = new SimpleDateFormat(); 
  
  public LivroDigital(
    String titulo, 
    String isbn, 
    String autor, 
    String lancamento, 
    boolean estado,
    String url,
    boolean digital)
  {
    super(titulo, isbn, autor, lancamento, estado, digital);
    this.url = url;
    this.dataCadastramento = formatarData.format(dataAtual);
    this.digital = digital;
  }

  public String getUrl(){
    return this.url;
  }

  public void setUrl(String newURL){
    this.url = newURL;
  }

  public boolean getDigital(){
    return this.digital;
  }

}
