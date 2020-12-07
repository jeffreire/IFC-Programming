package funcionarios;

import arquivos.ManipuladorDeArquivos;
import funcionarios.coreFuncionarios.Funcionario;
import funcionarios.coreFuncionarios.ManipuladorDeFuncionarios;

public class teste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(1, "Jefferson", 12, "09797970012", 5005);

        ManipuladorDeArquivos manipuladorDeArquivos = new ManipuladorDeArquivos();
		manipuladorDeArquivos.criarArquivo("teste.bin");
        ManipuladorDeFuncionarios.escreverFuncionario("funcionarios.txt", funcionario);
        
        funcionario = ManipuladorDeFuncionarios.lerFuncionario("funcionarios.txt");

        System.out.println(funcionario.nome);
    }
}
