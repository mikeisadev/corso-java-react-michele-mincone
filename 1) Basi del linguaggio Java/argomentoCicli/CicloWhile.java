
public class CicloWhile {
	
	public static void main(String[] args) {
		
		/**
		 * In JAVA oltre alle strutture di controllo per determinare le condizioni
		 * ho le strutture di controllo per eseguire blocchi di codice o istruzioni
		 * più volte seguendo, anche qui, determinate condizioni.
		 * 
		 * I loop o le strutture di controllo cicliche vengono usate per eseguire un 
		 * set di istruzioni "n" volte in base alle condizioni definite.
		 * 
		 * Cicli in JAVA:
		 * - while
		 * - do-while (è un ciclo dove la prima iterazione viene sempre eseguita)
		 * - for
		 * - for-each (un ciclo for che tiene conto del valore indicato tra parentesi tonde)
		 */
		
		// 1. CICLO WHILE
		int c = 0; // Questo è il nostro contatore per controllare il ciclo while
		
		/**
		 * ATTENZIONE: se la condizione tra parentesi tonde risulterà sempre "true" (vera)
		 * avremo un loop infinito.
		 * 
		 * I loop infiniti possono essere molto utili, ma devo sapere come controllarli e lo
		 * impareremo durante questo corso.
		 */
		while (c < 10) {
			System.out.println("Questo è un ciclo while: " + c);
			
			c++; // Attenzione, aumento il contatore per ogni iterazione
		}
		
		// 2. CICLO DO-WHILE		
		do {
			System.out.println("Il ciclo DO-WHILE viene sempre eseguito per la prima iterazione.");
		} while (false);
		
		// 2.1 ALTRO ESEMPIO CICLO DO-WHILE
		int a = 0;
	
		do {
			System.out.println("Ciclo DO-WHILE: iterazione " + a);
			a++;
		} while (a < 10);
		
		/**
		 * Scorciatoie:
		 * 
		 * prova a digitare:
		 * 
		 * while (CTRL + SPAZIO) 
		 * 
		 * RISULTATO: Avrai l'autocompletamento da eclipse per il loop
		 */
		
		// CICLO INFINITO CON INTERRUZIONE
		// Nota: inserisco una condizione dentro il ciclo while e uso la parola "break" per
		// interrompere il ciclo while
		int x = 0;
		
		while (true) {
			System.out.println("CICLO INFINITO: " + x);
			
			if (x >= 20) {
				break;
			}
			
			x++;
		}
	}

}
