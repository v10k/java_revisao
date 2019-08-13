package exercicio2;

public class CaminhaoAlfa extends Caminhao{

	public CaminhaoAlfa(int equipamentos) {
		super(equipamentos);
	}
	
	@Override
	public boolean inserePluviometro(Pluviometro p) {
		return (p.getPeso() <= 5000) ? true : false;
	}
	
}
