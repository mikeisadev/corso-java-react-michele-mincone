package eserciziSvolti;

import java.util.Scanner;

import java.util.Arrays;
import java.util.List;

/**
 * Secondo esercizio sul ValidatoreEmail
 * 
 * NOTA: Esteso con scanner per prendere input da console
 */
public class ValidatoreEmailConScanner {
	
	private static final List<String> VALID_DOMAINS = Arrays.asList(
		"gmail.com",
		"yahoo.it",
		"hotmail.com",
		"michelemincone.com",
		"natalecentineo.it"
	);
	
	private static final List<String> FAKE_DOMAINS = Arrays.asList(		
		"protonmail.com",
		"fake.com",
		"tmp.org"
	);
	
	public static void main(String[] args) {	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Per favore, inserisci una email da validare: ");
		String email = input.nextLine();
		
		if (email.isEmpty()) {
			System.err.println("L'email è vuota");
			
			return;
		}
		
		if (email.contains("@") && email.length() == 1) {
			System.err.println("Hai inserito solo la chiocciola");
			
			return;
		}
		
		String[] emailArr = email.split("@");
		
		if (emailArr.length != 2) {
			System.err.println("L'email non è valida");
			
			return;
		}
		
		if (FAKE_DOMAINS.contains(emailArr[1])) {
			System.err.println("Mi dispiace, la tua mail è spam! Non possiamo usarla sui"
					+ " nostri server.");	
			
			return;
		}
				
//		if (!VALID_DOMAINS.contains(emailArr[1])) {
//			System.out.println("Dominio della mail non valido! Per favore ricontrolla");
//			
//			return;
//		}
		
		String emailDominio = emailArr[1];
		
		if (!emailDominio.contains(".")) {
			System.err.println("Il dominio della mail non è valido, prova a inserire il punto!");
			
			return;
		}
		
		System.out.println(
				"L'email è valida\n"
				+
				"Prefisso email: " + emailArr[0] + "\n"
				+
				"Dominio email: " + emailArr[1] + "\n"
				+ 
				"La @ è presente nella mail\n"
				+ 
				"L'email che hai inserito è: \n"
				+
				email
		);
		
		
	}
	
}
