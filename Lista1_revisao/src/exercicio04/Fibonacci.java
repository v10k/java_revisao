package exercicio04;

public class Fibonacci {
	
	public static boolean verificaNumero(int x) {
		int a = 1,b = 1;
		while(a < x && b < x) {
			a += b;
			b += a;
		}
		return (a == x || b == x) ? true : false;
	}
}
