
public class HelloWorld {

	/*
	 * QUESTO è UN COMMENTO MULTILINEA IN JAVA
	 * 
	 * Premendo "Invio" sulla tastiera vado su un'altra riga
	 * 
	 * Quindi posso aggiungere testo su più linee
	 * 
	 * I commenti li uso per descrivere e documentare il mio programma Java.
	 * 
	 * Con i commenti posso descrivere o documentare l'intero codice 
	 * per renderlo più leggibile e comprensibile per quando tornerò
	 * sul codice a distanza di tempo. 
	 * 
	 * CONSIGLIO: Quando si lavora in team con altri sviluppatori, i commenti
	 * sono cruciali. Aiutano moltissimo altri membri del team di sviluppo
	 * a comprendere meglio il vostro codice
	 * 
	 * IMPORTANTE: I commenti vengono ignorati dall'interprete/compilatore Java
	 */
	public static void main(String[] args) {
		// Questo è un commento su singola linea
		
		// Con l'espressione qui sotto stampo una stringa nella console
		// ATTENZIONE: il metodo "print" stampa sulla stessa riga
		System.out.print("Hello world");
		
		System.out.println();
	
		// Grazie ai commenti, che vengono ignorati durantre l'esecuzione del programma, posso
		// Nascondere o far ignorare all'interprete Java alcune espressioni
		// System.out.print("Questo print sarà ignorato");
		
		// Il metodo "println" stampa e va a capo
		System.out.println("Sono una riga di testo");
		System.out.println("...spezzata, grazie al metodo println");
	}

}