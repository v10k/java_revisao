package exercicio2;

import java.util.Vector;

public class EquipamentoCorrigido extends Equipamento{
	
	private int MesCorrente;
	private Vector<Integer> MesCompra = new Vector<Integer>(this.getNumeroEquipamentos());
	
	public EquipamentoCorrigido(int numeroEquipamentos, int mesCorrente) {
		super(numeroEquipamentos);
		MesCorrente = mesCorrente;
	}
	
	public int getMesCompra(int numeroEquipamento) {
		return MesCompra.get(numeroEquipamento);
	}
	
	public void setMesCompra(int numeroEquipamento, int mesCompra) {
		MesCompra.add(numeroEquipamento, mesCompra);
	}
	
	public void corrige(double percentual) {
		for(int i = 0; i < this.getNumeroEquipamentos(); i++) {
			if (this.getMesCompra(i) == MesCorrente) {
				int correcao = (int) (this.getValor(i) +(this.getValor(i) * (percentual/100)));
				this.setValor(i, correcao); 
			}
		}
	}
	
	public void substitui(EquipamentoCorrigido equip) {
		if (equip.getNumeroEquipamentos() == this.getNumeroEquipamentos()) {
			for (int i = 0; i < this.getNumeroEquipamentos(); i++) {
				this.setValor(i, equip.getValor(i));
				this.setMesCompra(i, equip.getMesCompra(i));
			}
		}
	}
	
	
}
