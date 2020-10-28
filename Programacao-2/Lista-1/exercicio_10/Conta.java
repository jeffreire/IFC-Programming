package exercicio_10;

public class Conta {

    private int numero;
    private String nome;
    private float saldo;

    public Conta(int numero, String nome, float saldo){

        if (validacao(numero) == true){
            this.numero = numero;
            this.nome = nome;
            this.saldo = saldo;
        }else{
            System.out.print("Numero da conta ja existente.");
        }
    }

    public int getNumero(){
        return this.numero;
    }

    public String getNome(){
        return this.nome;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public boolean depositar(float valor){
        if (valor > 0){
            this.saldo += valor;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean sacar(float valor){
        if(valor > 0){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }

    public boolean validacao(int numero){
        if (numero == getNumero()){
            return false;
        }else{
            return true;
        }
    }
}
