package exercicio05;
import java.util.Scanner;

public class Ex05 {
	
	public void executa() {
		Scanner scan = new Scanner(System.in);
		Banco b = new Banco(); 
		
		System.out.print("Reais emprestados: ");
		b.setP(scan.nextDouble());
		System.out.print("Pagamento por mês: ");
		b.setA(scan.nextDouble());
		System.out.print("Porcentagem dos juros: ");
		b.setI(scan.nextDouble());
		
		
		scan.close();
	}
}
