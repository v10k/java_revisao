package exercicio03;
import java.util.Scanner;

public class Ex03 {
	
	public void executa() {
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("Escreva o número a ser convertido para binário: ");
		int n = scan.nextInt();
		System.out.printf("Conversão: " + Binario.intParaBinario(n));
		scan.close();
	}
}
