package exercicio02;
import java.util.Scanner;

public class Ex02 {

	public void executa() {
		Scanner scan = new Scanner(System.in);
		Funcionario fun = new Funcionario();

		while(!fun.getNome().equalsIgnoreCase("FIM")) {
			System.out.print("Digite o nome do funcionário: ");
			fun.setNome(scan.next());

			if (fun.getNome().equalsIgnoreCase("FIM")) {
				break;
			}

			System.out.print("Digite o salário atual: ");
			fun.setSalario(scan.nextDouble());
			fun.setSomaInicial(fun.getSalario());
			fun.incrementaSalario();
		}
		scan.close();
	}    
}

