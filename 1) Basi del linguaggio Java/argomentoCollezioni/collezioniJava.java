package collezioni;

/**
 * Interfacce delle collezioni JAVA.
 * 
 * Le uso per indicare il tipo di dato quando dichiaro una variabile.
 */
import java.util.List;
import java.util.Set;
import java.util.Map;

/**
 * Collezioni principali che useremo in questo corso.
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

/**
 * Classe utile per lavorare con le List
 */
import java.util.Arrays;

public class CollezioniJava {
	
	public static void main(String[] args) {
				
		/**
		 * COLLEZIONI IN JAVA:
		 * - List: ordinate, permettono duplicati, estendibili
		 * - Set: non ordinati, no duplicati
		 * - Map: ordinamento chiave - valore
		 * 
		 * List, Set e Map sono interfacce di Java che rappresentano le collezioni:
		 * 
		 * import java.util.List;
		 * import java.util.Set;
		 * import java.util.Map;
		 * 
		 * COLLEZIONI IN JAVA PER INTERFACCIA E RELATIVA CLASSE:
		 * - List: ArrayList, LinkedList
		 * - Set: HashSet, TreeSet
		 * - Map: HashMap, TreeMap
		 */
		
		// 1. Approfondimento List -> ArrayList
		List<String> listaNomi = new ArrayList<>();
		
		listaNomi.add("Michele");
		listaNomi.add("Fabio");
		listaNomi.add("Eugenio");
		listaNomi.add("Natale");
		listaNomi.add("Silvia");
		listaNomi.add("Giuseppe");
		listaNomi.add("Nicolò");
		listaNomi.add("Daniele");
		listaNomi.add("Alessia");
		listaNomi.add("Alessio");
		listaNomi.add("Laura");
		
		listaNomi.sort(null);
				
		for (String nome : listaNomi) {
			System.out.println(nome);
		}
		
		System.out.println("\n");
		
		// 2. Approfondimento Set -> HashSet
		Set<String> listaGiorni = new HashSet<>();
		
		listaGiorni.add("Lunedì");
		listaGiorni.add("Martedì");
		listaGiorni.add("Mercoledì");
		listaGiorni.add("Giovedì");
		listaGiorni.add("Venerdì");
		listaGiorni.add("Sabato");
		listaGiorni.add("Domenica");
		
		for (String giorno : listaGiorni) {
			System.out.println(giorno);
		}
		
		System.out.println("\n");
		
		// 3. Approfondimento Map -> HashMap
		// Map<CHIAVE, VALORE>
		Map<String, String> rubrica = new HashMap<>();
		
		// La mappa va definita per chiave e valore
		// In questo caso la chiave è il nome e il valore è un
		// numero di telefono
		rubrica.put("michele", "+39 555 555 5555");
		rubrica.put("natale", "+39 111 111 1111");
		rubrica.put("fabio", "+39 333 555 1717");

		
		// Tramite la chiave inserita nel metodo get
		// ottengo il valore, quindi il numero di telefono
		// di fabio
		// System.out.println(rubrica.get("fabio"));

		// Provo a eseguire un for each loop su un Map
		// Ma come vedrai devo prima ottenere le chiavi
		for (String nomeRubrica : rubrica.keySet()) {
			String numeroTelefono = rubrica.get(nomeRubrica);
			
			System.out.println(
					"Numero di telefono di " + 
					nomeRubrica +
					": " +
			        numeroTelefono
			);
		}
	}

}
