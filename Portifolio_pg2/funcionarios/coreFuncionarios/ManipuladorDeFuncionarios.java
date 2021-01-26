package funcionarios.coreFuncionarios;
import java.util.ArrayList;

import arquivos.ManipuladorDeArquivos;

public class ManipuladorDeFuncionarios {
    
    public static boolean escreverFuncionario(String caminho, Funcionario funcionario) {
		return ManipuladorDeArquivos.escreverArquivo(caminho, funcionario.toString());
	}
	
	public static Funcionario lerFuncionario(String caminho) {
		Funcionario funcionario;
		ArrayList<String> texto = ManipuladorDeArquivos.lerArquivo(caminho);
		String linha = texto.get(0);
		String[] dados = linha.split(";");
		
		funcionario = new Funcionario(Integer.parseInt(dados[0]),
									  dados[1],
									  Integer.parseInt(dados[2]),
									  dados[3],
									  Float.parseFloat(dados[4]));
		return funcionario;
	}
}