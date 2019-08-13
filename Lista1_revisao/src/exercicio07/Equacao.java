package exercicio07;
import java.lang.Math; 


public class Equacao {
	private double A, B, C, Delta, X1 = 0, X2 = 0;
	private int Status;

	public double getC() {
		return C;
	}

	public void setC(double c) {
		C = c;
	}

	public double getA() {
		return A;
	}

	public void setA(double a) {
		A = a;
	}

	public double getB() {
		return B;
	}

	public void setB(double b) {
		B = b;
	}
	
	public int getStatus() {
		return this.Status;
	}
	
	public double getDelta() {
		return Delta;
	}
	
	public double getX1() {
		return X1;
	}

	public double getX2() {
		return X2;
	}


	
	public void resolveBaskhara() {
		this.calculaDelta();
		this.verificaNumeroSolucoes();
		this.defineCalculos();
	}
	
	private void calculaDelta() {
		this.Delta = Math.pow(this.getB(), 2) - 4 * this.getA() * this.getC();
	}
	
	private void verificaNumeroSolucoes() {
		if (this.getDelta() == 0) {
			this.Status = 1;
		} else if (this.getDelta() > 0) {
			this.Status = 2;
		} else {
			this.Status = 0;
		}
	}
	
	private void defineCalculos() {
		if (this.getStatus() > 0) {
			this.calculaBhaskaraPositivo();
			if (this.getStatus() == 2) {
				this.calculaBhaskaraNegativo();
			}
		}
	}
	
	private void calculaBhaskaraPositivo() {
		this.X1 = ((- this.getB() + Math.sqrt(this.getDelta())) / 2 * this.getA());
	}
	
	private void calculaBhaskaraNegativo() {
		this.X2 = ((- this.getB() - Math.sqrt(this.getDelta())) / 2 * this.getA());
	}
}
