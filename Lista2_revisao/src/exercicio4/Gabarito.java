package exercicio4;

public class Gabarito {
	
	public char respostaQuestao(int numeroQuestao) {
		char resposta = 'f';
		switch(numeroQuestao) {
			case 0:
				resposta = 'a';
				break;
			case 1:
				resposta = 'c';
				break;
			case 2:
				resposta = 'e';
				break;
			case 3:
				resposta = 'b';
				break;
			case 4:
				resposta = 'd';
				break;
			//......
			default:
				break;
		}
		return resposta;
	}
}
