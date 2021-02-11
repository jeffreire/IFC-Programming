package interfaces;

public interface ILivro {
  public String getTitulo();
  public String getIsbn();
  public String getAutor();
	public String getLancamento();
	public boolean getEstado();
	public void setEstado(boolean estado);
	public boolean getEmprestado();
	public void setEmprestado(boolean estado );
  public String getUrl();
  public void setUrl(String newURL);
  public boolean getDigital();
}
