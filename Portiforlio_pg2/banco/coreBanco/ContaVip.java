package banco.coreBanco; 

public class ContaVip extends Conta {
  private float saldo = 5000;
 
  public ContaVip(Usuario usuario) {
    super(usuario);
  }

  public boolean sacar(float valor) {
    if (valor <= this.saldo) {
			this.saldo -= valor;
			if(this.numeroSaques >= 6)
				this.saldo -= 0.20;				
			this.numeroSaques ++;
			
			return true;
		}
		return false;
	}
}