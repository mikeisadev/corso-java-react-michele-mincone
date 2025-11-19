import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Rubrica {
	private static Map<String, String> rubrica = new HashMap<>();
	private static List<String> risultatiRicerca = new ArrayList<>();
	
	public Rubrica(Map<String, String> data) {
		this.rubrica = data;
	}
	
	public static void impostaContattiRubrica(Map<String, String> data) {
		Rubrica.rubrica = data;
	}
	
	public static void aggiungiContatto(String nome, String numero) {
		rubrica.put(nome, numero);
	}
	
	public static void rimuoviContatto(String nome) {
		rubrica.remove(nome);
	}
	
	public static void aggiornaNumero(String nome, String numero) {
		rubrica.replace(nome, numero);
	}
	
	public static void cercaPerNome(String intento) {
		risultatiRicerca.clear();
		
		for (String n : rubrica.keySet()) {
			if (n.toLowerCase().contains(intento.toLowerCase())) {
				risultatiRicerca.add(n);
			}
		}
	}
	
	public static void listaRubrica() {
		System.out.println("=== === === LISTA RUBRICA JAVA === === ===\n");
		
		for (String nome : rubrica.keySet()) {
			String numero = rubrica.get(nome);
			
			System.out.println("Il numero di " + nome + " è " + numero);
		}
		
		System.out.println("\n=== === === FINE LISTA RUBRICA JAVA === === ===");
	}
}
