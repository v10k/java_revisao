package exercicio3;
import java.util.Scanner;

public class Controle {
		
	public static String leString() {
		Scanner scan = new Scanner(System.in);
		String digitado = scan.nextLine();
		return digitado;
	}
	
	public static int leInteiro() {
		Scanner scan = new Scanner(System.in);
		int digitado = scan.nextInt();
		return digitado;
	}
	
}
