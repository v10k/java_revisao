package exercicio1;


public class ClasseEx implements IProdutoFabricado{
	
	private String Nome;
	private float   Custo = 0;
	private int    Ningredientes;
	
	
	@Override
	public int getNumeroIngredientes() {
		return Ningredientes;
	}
	
	@Override
	public IProduto getIngrediente(int numero) {
		return null;
	}

	@Override
	public String getNome() {
		return Nome;
	}

	@Override
	public float getCusto() {
		String [] ingredientes = GerenteProdutos.ingredientes(getNome());
		for(String lista : ingredientes) {
			Custo = Custo + GerenteProdutos.valorCompra(lista);	
		}		
		return Custo;
	}

	
	public IProduto reduzCusto(IProduto p) {
		float soma = 0;
		String [] ingredientes = GerenteProdutos.ingredientes(p.getNome());
		for(String lista : ingredientes) {
			soma = soma + GerenteProdutos.valorCompra(lista);
		}
		if (soma > getCusto()) {
			IProdutoFabricado p2 = (IProdutoFabricado) p;
			return p2;
		} else {
			return p;
		}
	}
}
