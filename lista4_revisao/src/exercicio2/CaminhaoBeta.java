package exercicio2;

public class CaminhaoBeta extends Caminhao {
	
	public CaminhaoBeta(int equipamentos) {
		super(equipamentos);
	}
	
	@Override
	public boolean inserePluviometro(Pluviometro p) {
		return (p.getTipo().equals("1")) ? true : false;
	}
	
}
