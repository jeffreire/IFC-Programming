package exercicio_10;

public class Main {
    public static void main(String[] args) {
        
        Conta conta = new Conta( 2323, "jefferson", 8000);

        Conta conta2 = new Conta( 2123, "Joao", 8000);

        boolean valid = validacao(conta.getNumero(), conta2.getNumero());
        float saldo;
        
        if (valid == false){
            System.out.print("Numero de conta ja existente!!");
        }else{
            
            System.out.println(conta.getSaldo());
            boolean depositar = conta.depositar(50);
            
            if (depositar == true){
                saldo = conta.getSaldo();
                System.out.print(saldo);
            }else{
                System.out.println("Deposito invalido!!");
            }
        }
    }

    public static boolean validacao(int numero1, int numero2){
        if(numero1 == numero2){
            return false;
        }
        else{
            return true;
        }
    }
}
