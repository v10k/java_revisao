package exercicio07;
import java.util.Scanner;

public class Ex07 {
	public void executa() {
		
		Equacao e = new Equacao();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		e.setA(scan.nextDouble());
		
		System.out.print("Digite o valor de B: ");
		e.setB(scan.nextDouble());
		
		System.out.print("Digite o valor de C: ");
		e.setC(scan.nextDouble());
		
		e.resolveBaskhara();
		System.out.printf("\nStatus: " +e.getStatus());
		System.out.printf("\nRaiz 1: " +e.getX1());
		System.out.printf("\nRaiz 2: " +e.getX2());
		scan.close();
	}
}
