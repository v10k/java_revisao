package exercicio4;

public class Prova {
	
	private int Acertos = 0;
	private double Nota = 0;
	private int Questao = 0;
	private char[] Resposta = new char[15];
	private Gabarito gab;
	
	public Prova(Gabarito gabarito) {
		gab = gabarito;
	}
	
	public void respostaAluno(char resposta) {
		if (Questao < 15) {
			Resposta[Questao] = resposta;
			Questao++;	
		}
	}
	
	public int acertos() {
		for (int i  = 0; i < 15; i++) {
			char resposta = this.gab.respostaQuestao(i);
			if (resposta == this.Resposta[i]) {
				Acertos++;
			}
		}
		return Acertos;
	}
	
	public double nota() {
		for (int i  = 0; i < 15; i++) {
			char resposta = this.gab.respostaQuestao(i);
			if (resposta == this.Resposta[i]) {
				Nota += (i > 9) ? 1 : 0.5;
			}
		}
		return Nota;
	}
	
	public double maior(Prova p) {
		if (p.Acertos == Acertos) {
			if (p.Nota == Nota) {
				return Nota;
			} else {
				return (p.Nota > Nota) ? p.Nota : Nota;
			}
		} else {
			return (p.Acertos > Acertos) ? p.Nota : Nota;
		}
	}
	
	
	
}
