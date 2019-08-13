package exercicio04;
import java.util.Scanner;

public class Ex04 {
	
	public void executa() {
		Scanner scan = new Scanner(System.in);
		System.out.printf("Digite um número que faça parte da sequência de Fibonacci: ");
		boolean resultado = Fibonacci.verificaNumero(scan.nextInt());
		String mensagem = (resultado) ? "É um número pertencente a sequência de fibonacci" : "Não é um número pertencente a sequência de fibonacci";
		
		System.out.println(mensagem);
		
		scan.close();
	}
}
