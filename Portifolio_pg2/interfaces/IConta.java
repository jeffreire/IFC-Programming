package interfaces;

public interface IConta {
  
  public float mostrarSaldo();

	public boolean sacar(float valor);
	
	public boolean depositar(float valor);

  public int getNumero();

	public String toString();
} 