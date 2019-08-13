package exercicio08;
import java.util.Scanner;

public class Ex08 {
	
	public void executa() {
		
		Scanner scan = new Scanner(System.in);
		NumeroPrimo p = new NumeroPrimo();
		
		System.out.print("Digite um número inteiro: ");
		boolean x = p.verificaPrimo(scan.nextInt());
		
		if (x) {
			System.out.print("O número é primo");
		} else {
			System.out.print("O número não é primo");
		}
		
		scan.close();
	}
}
