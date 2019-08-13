package exercicio2;

import java.util.Vector;

public class Equipamento {
	
	private Vector<Integer> Valor;
	
	public Equipamento (int numeroEquipamentos) {
		Valor =  new Vector<Integer>(numeroEquipamentos);
	}
	
	public int getNumeroEquipamentos() {
		return Valor.size();
	}
	
	public int getValor(int numero) {
		return Valor.get(numero);
	}
	
	public void setValor(int numero, int valor) {
		Valor.add(numero, valor);
	}
	
	
}
