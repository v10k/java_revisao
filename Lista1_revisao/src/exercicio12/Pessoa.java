package exercicio12;
import java.util.ArrayList;
import java.util.Random;

public class Pessoa {
	
	private double Peso;

	public Pessoa() {
		
	}
	
	public Pessoa(double peso) {
		this.setPeso(peso);
	}
	
	public double getPeso() {
		return Peso;
	}

	public void setPeso(double peso) {
		Peso = peso;
	}
	
	public ArrayList<Pessoa> criaListaPreenchida() {
		ArrayList<Pessoa> pessoas = this.preencheLista();
		return pessoas;
	}
		
	public int indiceMenorPeso(ArrayList<Pessoa> pessoas) {
		double menor = pessoas.get(1).getPeso();
		int indice = 1;
		for (int i = 1; i < pessoas.size(); i++) {
			if (pessoas.get(i).getPeso() < menor) {
				menor = pessoas.get(i).getPeso();
				indice = i;
			}
		}
		return indice;
	}
	
	private double geraValor() {
		Random r = new Random();
		return 40 + (200 - 40) * r.nextDouble();
	}
	
	private ArrayList<Pessoa> preencheLista() {
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>(150);
		for (int i = 0; i < 150; i++) {
			pessoas.add(new Pessoa(this.geraValor()));
		}
		return pessoas;
	}
	
	
}
