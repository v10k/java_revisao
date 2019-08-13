package exercicio1;

public class Utilitarios  {

	public void duplica(Repositorio A, Repositorio B) {
		B.guarda(A.primeiro());
		while (A.proximo() != null) {
			B.guarda(A.proximo());
		}
	}
	
	public void diferenca(Repositorio A, Repositorio B, Repositorio C) {
		while(A.proximo() != null) {
			while(B.proximo() != null) {
				if (A.proximo() != B.proximo()) {
					C.guarda(A.proximo());
				}
			}
		}
	}

	
}
