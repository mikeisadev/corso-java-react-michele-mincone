package eserciziSvolti;

import java.util.HashMap;
import java.util.ArrayList;

import java.util.Map;
import java.util.List;

public class RubricaNormale {
	
	private static Map<String, String> rubrica = new HashMap<>();
	
	private static List<String> risultatiRicerca = new ArrayList<>();

	public static void main(String[] args) {
		// 1. Aggiungo i contatti
		aggiungiContatto("Michele", "+39 111 111 1111");
		aggiungiContatto("Alessio", "+39 222 222 2222");
		aggiungiContatto("Davide", "+39 333 333 3333");
		aggiungiContatto("Filippo", "+39 444 444 4444");
		aggiungiContatto("John", "+39 555 555 5555");
		aggiungiContatto("Luca", "+39 666 666 6666");
		
		// 2. Li stampo sulla console
		listaRubrica();
		
		// 3. Esploro e provo gli altri metodi
		// rimuoviContatto();
		// cercaPerNome();
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
