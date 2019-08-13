package exercicio11;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex11 {
	
	public void executa() {
		
		int i  = 0;
		Scanner scan = new Scanner(System.in);
		System.out.printf("Digite o número de funcionários: ");
		int n  = scan.nextInt();
		
		ArrayList<Funcionario> funcionario = new ArrayList<Funcionario>(n);
		Funcionario fun = new Funcionario();
		
		while (i < n) {
			System.out.printf("Digite o salário do funcionario #" + (i+1) + ": ");
			funcionario.add(new Funcionario(scan.nextInt()));
			i++;
		}
		
		fun.mediaSalario(funcionario);
		int num = fun.numFuncionarioAcimaMedia(funcionario);
		
		System.out.println("O número de funcionários que tem salário acima da média é: " +num);
		scan.close();
	}
}
