package ripasso;

public class DaArrayANome {

	public static void main(String[] args) {
		char[] listaDiCaratteri = {'M', 'i', 'c', 'h', 'e', 'l', 'e'};
		
		String nome = "";
		
		for (int i = 0; i < listaDiCaratteri.length; i++) {
			nome += listaDiCaratteri[i];
		}
		
//		for (char carattere : listaDiCaratteri) {
//			// System.out.println("Singoli caratteri: " + carattere);
//			nome += carattere;
//		}
		
		System.out.println("Ecco il tuo nome ricostruito da un array: \n" + nome + "\n");
		
		System.out.println("Il tuo nome ha: " + nome.length() + " caratteri");
		
		System.out.println(); // Riga a capo
		
		// Altro esempio di array con cicli for
		daStringaACaratteriSingoli();
	}
	
	public static void daStringaACaratteriSingoli() {
		String nome = "Michele Mincone";
		
		char[] nomeCharArray = nome.toCharArray();
		
		System.out.println("Otteniamo i singoli caratteri della stringa: " + nome);
		
		for (char carattere : nomeCharArray) {
			System.out.println(carattere);
		}
	}
	
}
