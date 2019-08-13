package exercicio12;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex12 {
	
	public void executa() {
		
		Scanner scan = new Scanner(System.in);
		Pessoa p = new Pessoa();
		ArrayList<Pessoa> pessoas = p.criaListaPreenchida(); 
		int indice = p.indiceMenorPeso(pessoas);
		
		System.out.printf("O menor peso se encontra no índice: " +indice);
		scan.close();
		
	}
}
