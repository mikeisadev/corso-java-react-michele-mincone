import java.util.Scanner;

public class StruttureDiControllo {
	
	private static Scanner scanner = new Scanner(System.in);
	private static String inputUtente; 
	
	// java StruttureDiControllo
	public static void main(String[] args) {		
		/*
		 * STRUTTURE DI CONTROLLO:
		 * - di decisione/condizionali (if, else if, else, switch)
		 * - di ciclo (for, for each, do while, while)
		 * - di gestione dell'errore (try-catch, finally)
		 */
		
		/**
		 * STRUTTURE DI CONTROLLO DI DECISIONE (BLOCCHI CONDIZIONALI O STRUTTURE DI CONTROLLO CONDIZIOMALI)
		 * 
		 * Blocco if, else if, else
		 * 
		 * Dentro i blocchi if, else if e else posso usare gli operatori di comparazione o logici
		 * 
		 * Operatori di comparazione: >, <, ==, >=, <=, !=
		 * Operatori logici: && (AND), || (OR), ! (NOT)
		 * Operatori matematici: *, /, +, -, %
		 * 
		 * APPUNTO: l'operatore logico NOT (!) significa: "il contrario di". Di cosa? Del valore che sta dopo.
		 * 
		 * !false = true (il contrario di false è uguale a true)
		 * !true = false 
		 */
		double a = Math.PI;			
		double b = Math.PI + 3.14;
	
		if (a == b) {
			System.out.println("Numero 1 e numero 2 sono uguali");
		}
		
		if (a != b) {
			System.out.println("Numero 1 e numero 2 sono diversi");
		}
		
		if (!false) {
			System.out.println("Se l'espressione è false io non vengo stampato nella console");
		}
		
		if (!((a + 3) > b)) {
			System.out.println("Se questa stringa viene stampata nella console, il numero 1 è maggiore del numero 2\n");
		}
		
		/* 
		 	RISOLUZIONE ESPRESSIONE DI CONDIZIONE: !((a + 3) > b)
			!((a + 3) > b)
			!((1 + 3) > b)
			!(4 > 2)
			!true
			false 
			NOTA BENE (!false = NOT è il contrario di true, ovvero false)
		*/
		
		/**
		 * Vediamo la struttura completa di IF
		 */
		if (a > b) {
			System.out.println("A è maggiore o uguale a B\n");	
		} else if (a < b) {
			System.out.println("A è minore di B\n");	
		} else if (a == Math.PI) {
			System.out.println("A è uguale al pigreco1\n");
		} else if (b == Math.PI) {
			System.out.println("B è uguale al pigreco\n");
		} else {
			System.out.println("A è sicuramente uguale a B\n");	
		}
		
		/**
		 * ESEMPIO SEMPLICE DI "GUARD CLAUSE"
		 * 
		 * NOTA: Per capirlo meglio faremo dei programmi in cui noteremo che ripetere o nidificare troppi
		 * if, else if ed else è distruttivo per la leggibilità del programma o del codice. Inoltre, espone
		 * il programma a potenziali bug.
		 */
		 String email = "michelework02@gmail.com";
		 
		// email.isEmpty() lo posso leggere come = se l'email è vuota
		// !email.isEmpty() lo posso leggere come = se l'email NON (!) è vuota
		
		if (email.isEmpty()) {
			System.out.println("Devi inserire una mail");
			
			return;  // Ferma l'esecuzione del metodo (o del programma)
		}
		
		if (!email.contains("@")) {
			System.out.println("L'email non è valida\\n\\n\"");
			
			return;
		}
		
		Email.sendEmail(email);
		
		/**
		 * Scriviamo gli if in GUARD CLAUDE in modo più pulito.
		 */
		
		if (email.isEmpty() || !email.contains("@")) {
			System.out.println("L'email non è valida");

			return;
		}
		
		// michelework02@gmail.com

		Email.sendEmail(email );
				
		// (FACOLTATIVO)
		// PARLIAMO AL VOLO DEL METODO String.matches() per le espressioni REGEX
		// Le espressioni regex mi consentono di trovare pattern dentro una stringa
		// Utilizzo il metodo String.matches() e inserisco l'espressione tra parentesi tonde
		//	regex = regular expression  "[a-z]^*|{@}|[a-z]^*{.com,.it,.org}"
		//	nameEmail = michelework
		//	atSymbol = @
		//	hostName = gmail.com
		
		// Esempio di massima di espressione regex (lo vedremo meglio più avanti)
		// String[] emailComponents = email.matches("[a-z]^*{@}[a-z]^*{.com,.it,.org}");
		
		/*
		 * 2. SWITCH
		 * 
		 * Spiegazione separata e completa "struttura di controllo" SWITCH:
		 * 
		 * FILE: EspressioneSwitch.java (dentro la cartella del corso)
		 * 
		 * Nota: SWITCH sostituisce una lunga catena di if, else il e else
		 */
		
		/**
		 * 3. OPERATORE TERNARIO.
		 * 
		 * - è una espressione (quindi ha bisogno della chiusura del ;)
		 * - sostituisce if / else
		 * - viene indicato con la seguente espressione:
		 * 
		 * (condizione) ? (avvio questo) : (avvio quest'altro)
		 */
		int x = 5;
		int y = 4;
		int z = 10;
		
		/*
		 * Questo qua sotto è un operatore ternario.
		 * 
		 * Riassume if / else
		 */
		String comparazioneNumeri = (x > y) ? "X è maggiore di Y" : "Y è maggiore di X";
		
		
		String ruolo = "dipendente";
		
		String tipoRuolo = ruolo.equals("dipendente") ? "dipendente" : "capo";
		
		System.out.println(comparazioneNumeri);
	}
	
	/**
	 * CLASSI INTERNE ALLA CLASSE PRINCIPALE
	 * 
	 * Dentro una classe posso innestare un'altra classe.
	 * 
	 * Nota bene: solo la classe interna può essere:
	 * - private
	 * - public
	 * - protected
	 * 
	 * La classe principale no.
	 */
	private class Email {
		
		private static String[] validHosts = {"gmail.com", "yahoo.it", "libero.it", "hotmail.com"};
		private static String[] fakeEmails = {"protonmail.org", "fakemail.com"};
		
		private static void sendEmail(String email) {
			System.out.println("Email inviata a: " + email);
		}
		
	}
}