import java.util.Scanner; 

public class JavaScanner {
	
    /**
     * In Java posso importare "java.util.Scanner" in alto e ottenere dati dalla console inserendoli come input.
     * 
     * Crea un nuovo file Java dentro Eclipse.
     * 
     * Poi copia e incolla questo codice e vedi che succede!
     * 
     * Buon coding!
     */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il tuo nome: ");
		
		String nome = input.nextLine();
		
		System.out.print("Inserisci il tuo cognome: ");
		
		String cognome = input.nextLine();
		
		System.out.print("Il tuo nome è: " + nome + ' ' + cognome);
	}

}