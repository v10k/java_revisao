package exercicio03;

public class Binario {
	
	public static String intParaBinario(int n) {
		String x = "";
		while(n > 0) {
            int a = n % 2;
            x = a + x;
            n = n / 2;
        }
		return preencheCasas(x);
	}
	
	private static String preencheCasas(String x) {
		for (int i = x.length(); i < 8; i++) {
			x = "0"+ x;
		}
		return x;
	}
}
