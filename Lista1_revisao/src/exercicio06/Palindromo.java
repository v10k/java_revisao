package exercicio06;

public class Palindromo {
	
	private String palavra;
		
	public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}

	public boolean verificaPalindromo() {
		String palavraInvertida = this.invertePalavra();
		return (this.getPalavra().equals(palavraInvertida)) ? true : false;
	}
	
	private String invertePalavra() {
		return new StringBuffer(this.getPalavra()).reverse().toString();
	}
}
