package exercicio01;
import java.util.Scanner;

public class Ex01 {
    public void executa() {
        Scanner scan = new Scanner(System.in);
        int [] n = new int[2];

        for(int i = 0; i < 2; i++) {
            System.out.printf("Digite o " + (i + 1) + "º número: ");
            n[i] = scan.nextInt();
        }

        Numeros.exibeImpar(n);
        scan.close();
    }
}