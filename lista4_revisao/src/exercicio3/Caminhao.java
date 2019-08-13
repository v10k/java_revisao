package exercicio3;

public class Caminhao extends Controle {
	
	public static void CaminhaoApto() {
		
		String tipo_caminhao = "";
		String aux = "";
		
		int numero_pluviometro = 0;
		int aux_n;
		
		String[] tipos = new String[0];
		
		
		while(!aux.equalsIgnoreCase("FIM")) {
			
			System.out.print("Tipo de caminhão: ");
			aux = leString();
			
			if (aux.equalsIgnoreCase("FIM")) {
				break;
			}
			
			System.out.print("Número de pluviômetros a ser transportado: ");
			aux_n = leInteiro();
			
			if (TemMaisPluviometros(aux_n, numero_pluviometro)) {
				tipo_caminhao = aux;
				numero_pluviometro = aux_n;
				tipos = DefineTiposPluviometros(numero_pluviometro);
			}
		}
		ImprimeCaminhaoApto(tipo_caminhao, numero_pluviometro, tipos);
	}
	
	private static boolean TemMaisPluviometros(int n1, int n2) {
		return (n1 > n2) ? true : false;
	}
	
	private static String[] DefineTiposPluviometros(int numero_pluviometro) {
		String[] tipos = new String[numero_pluviometro];
		System.out.print("Digite os tipos de pluviometros: \n");
		for (int i = 0; i < numero_pluviometro; i++) {
			System.out.printf("Pluviometro #" + (i+1) + ": ");
			tipos[i] = leString();
		}
		return tipos;
	}
	
	private static void ImprimeCaminhaoApto(String tipo_caminhao, int numero_pluviometro, String[] tipos) {
		System.out.println("\n\n\nCaminhã mais apto");
		System.out.println("Tipo de caminhão: " +tipo_caminhao);
		System.out.println("Lista dos pluviometros transportados: " );
		for(int i = 0; i < numero_pluviometro; i++) {
			System.out.println(tipos[i]);
		}
	}
}
