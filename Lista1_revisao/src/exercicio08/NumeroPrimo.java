package exercicio08;

public class NumeroPrimo {
	
	private boolean resultado = true;
	
	public boolean verificaPrimo(int n) {
		for (int i = 2;i < n; i++ ) {
			if (n % i == 0) {
				this.resultado = false;
			}
		}
		return this.resultado;
	}
}
