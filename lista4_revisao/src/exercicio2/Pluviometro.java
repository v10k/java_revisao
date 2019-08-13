package exercicio2;

public class Pluviometro {
	
	protected String Tipo;
	
	public Pluviometro (String tipo) {
		Tipo = tipo;
	}
	
	public String getTipo() {
		return Tipo;
	}
	
	public int getPeso() { //KG
		return 20;
	}
	
	public int getCapacidade() {
		return 50;
	}
	
	
}
