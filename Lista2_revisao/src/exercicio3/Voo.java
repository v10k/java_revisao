package exercicio3;

import java.sql.Time;
import java.util.Date;

public class Voo {
	
	private String NumeroVoo;
	private Date Data;
	private Time Horario;
	private int[] Cadeiras = new int[100];
	
	public Voo(String numero_voo, Date data) {
		NumeroVoo = numero_voo;
		Data = data;
	}
	
	public Time getHorario() {
		return Horario;
	}

	public void setHorario(Time horario) {
		Horario = horario;
	}

	public int[] getCadeiras() {
		return Cadeiras;
	}

	public void setCadeiras(int[] cadeiras) {
		Cadeiras = cadeiras;
	}
	
	public String getNumeroVoo() {
		return NumeroVoo;
	}

	public Date getData() {
		return Data;
	}	

	
	public boolean verifica(int n) {
		return (Cadeiras[n] == 1) ? true : false;
	}
	
	public boolean ocupa(int n) {
		if (Cadeiras[n] == 1) {
			return false;
		} else {
			Cadeiras[n] = 1;
			return true;
		}
	}
	
	public int vagas() {
		int count = 0;
		for (int i = 0; i < 100; i++) {
			if (Cadeiras[i] != 1) {
				count++;
			}
		}
		return count;
	}
	
	
	public Voo clone(Voo v) {
		String n_voo = v.getNumeroVoo();
		Date n_data = v.getData();
		Time n_horario = v.getHorario();
		int[] n_cadeiras = v.getCadeiras();
		Voo novo_voo = new Voo(n_voo, n_data);
		novo_voo.setCadeiras(n_cadeiras);
		novo_voo.setHorario(n_horario);
		return novo_voo;
	}
	
	
	
	
	
	
}
