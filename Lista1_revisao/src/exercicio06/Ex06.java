package exercicio06;

import java.util.Scanner;

public class Ex06 {
	
	public void executa() {
		
		Scanner scan = new Scanner(System.in);
		Palindromo pal = new Palindromo();
		
		System.out.printf("Digite a palavra a ser verificada: ");
		pal.setPalavra(scan.next());
		if (pal.verificaPalindromo()) {
			System.out.print("É um palindromo");
		} else {
			System.out.print("Não é um palindromo");
		}
		scan.close();
	}
}
