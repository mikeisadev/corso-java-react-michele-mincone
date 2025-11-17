package eserciziSvolti;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ValidatoreEmailScannerConRegex {
		
	private static final List<String> FAKE_DOMAINS = Arrays.asList(		
		"protonmail.com",
		"fake.com",
		"tmp.org",
		"emailvietata.org"
	);
		
	public static void main(String[] args) {	
		String regex = "^[\\w\\-]+(\\.[\\w\\-]+)*@([A-Za-z0-9-]+\\.)+[A-Za-z]{2,4}$";
		
		Scanner input = new Scanner(System.in);
			
		System.out.println("Per favore, inserisci una email da validare: ");
		String email = input.nextLine().toLowerCase();
		
		input.close();
				
		if (!email.matches(regex)) {
			System.err.println("Email NON valida da REGEX!");
			
			return;
		}
		
		String[] emailArr = email.split("@");
		String emailDomain = emailArr[1];
		
		if (FAKE_DOMAINS.contains(emailDomain)) {
			System.err.println("Mi dispiace, la tua mail risulta essere spam"
								+" o temporanea! Non possiamo usarla sui"
								+" nostri server.");	
				
			return;
		}
			
		System.out.println(
					"L'email è valida\n"
					+ 
					"L'email che hai inserito è: \n"
					+
					email
		);
		
	}
	
}
