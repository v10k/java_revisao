package exercicio11;

import java.util.ArrayList;

public class Funcionario {

	private double Salario;
	private double Media;
	
	public Funcionario() {
		
	}
	
	public Funcionario(double salario) {
		this.setSalario(salario);
	}

	public double getSalario() {
		return Salario;
	}

	public void setSalario(double salario) {
		Salario = salario;
	}
	
	public double getMedia() {
		return Media;
	}

	public int numFuncionarioAcimaMedia(ArrayList<Funcionario> funcionario) {
		int count = 0;
		for (Funcionario linha: funcionario) {
			if (linha.getSalario() > this.Media) {
				count++;
			}
		}
		return count;
	}
	
	public void mediaSalario(ArrayList<Funcionario> funcionario) {
		double soma = 0;
		for (Funcionario linha: funcionario) {
			soma += linha.getSalario();
		}
		this.setMedia(soma / funcionario.size());
	}
		
	private void setMedia(double media) {
		Media = media;
	}
	
	
}
