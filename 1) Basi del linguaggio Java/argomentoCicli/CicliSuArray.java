
public class CicliSuArray {
	
	public static void main(String[] args) {
		/**
		 * In questa lezione uso i cicli for per lavorare
		 * sugli array che definisco in questa classe.
		 * 
		 * Useremo i seguenti array:
		 * - for
		 * - for-each
		 */
		String[] listaNomi = {
				"Michele", "Eugenio", "Fabio", "Alessio", "Alessia", 
				"Matteo", "Natale", "Armando"
		};
		
		System.out.println("Primo nome: " + listaNomi[0]);
		System.out.println("Secondo nome: " + listaNomi[1]);
		System.out.println("Terzo nome: " + listaNomi[2]);
		
		System.out.println(); // riga a capo
		
		/**
		 * Uso un ciclo for per evitare di stampare a mano tutti i nomi di una lista.
		 */
		System.out.println("Con questo ciclo vado a stampare sulla console tutti i nomi");
		for (int i = 0; i < listaNomi.length; i++) {
			System.out.println(listaNomi[i]);
		}
		
		System.out.println(); // riga a capo
		
		/**
		 * Ora complichiamoci un pò la vita e aggiungiamo una classificazione dei nomi
		 * usando il ciclo for.
		 */
		System.out.println("Stampa lista nomi con classifica: ");
		for (int i = 0; i < listaNomi.length; i++) {
			System.out.println("Nome " + (i + 1) + ": " + listaNomi[i]);
		}
		
		System.out.println(); // riga a capo
		
		/**
		 * In Java esiste anche il ciclo for-each.
		 * 
		 * Lo posso usare per evitare di dichiarare la variabile "i" e incrementarla
		 * a ogni ciclo
		 */
		System.out.println("Loop foreach per ottenere tutti i nomi");
		for (String nome : listaNomi) {
			System.out.println("[FOREACH LOOP] Nome dalla lista nomi: " + nome);
		}
		
	}

}
