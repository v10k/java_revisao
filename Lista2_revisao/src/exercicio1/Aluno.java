package exercicio1;

public class Aluno {
	
	private String Matricula;
	private String Nome;
	private double Prova1;
	private double Prova2;
	private double Trabalho;
	
	
	public double media() {
		double media = ((Prova1 * 2.5) + (Prova2 * 2.5) + (Trabalho * 2))/7;
		return media;
	}
	
	public double resultadoFinal(double media) {
		return (media < 4) ? 0 : 6 - media;
	}
	
	public String getMatricula() {
		return Matricula;
	}
	
	public String getNome() {
		return Nome;
	}
	
}
