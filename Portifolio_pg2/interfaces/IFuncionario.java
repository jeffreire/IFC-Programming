package interfaces;

public interface IFuncionario {
  public void demitir();
  public boolean alterarCPF(String cpf);
  public int getId();
  public String getSetor();
  public void setSetor(String newSetor);
  public float getSalario();
  public void setSalario(float newSalario);
  public boolean getDemitido();
}
