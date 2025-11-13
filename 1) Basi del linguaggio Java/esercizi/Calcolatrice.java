import java.util.Arrays;
import java.util.List;

public class ValidatoreEmail {
	
	private static final List<String> VALID_DOMAINS = Arrays.asList(
		"gmail.com",
		"yahoo.it",
		"hotmail.com"
	);
	
	private static final List<String> FAKE_DOMAINS = Arrays.asList(		
		"protonmail.com",
		"fake.com",
		"tmp.org"
	);
	
	public static void main(String[] args) {
		String email = "michelework02@gmail.com";
		
		if (email.isEmpty()) {
			System.out.println("L'email è vuota");
			
			return;
		}
		
		if (email.contains("@") && email.length() == 1) {
			System.out.println("Hai inserito solo la chiocciola");
			
			return;
		}
		
		String[] emailArr = email.split("@");
		
		if (emailArr.length != 2) {
			System.out.println("L'email non è valida");
			
			return;
		}
		
		if (FAKE_DOMAINS.contains(emailArr[1])) {
			System.out.println("Mi dispiace, la tua mail è spam! Non possiamo usarla sui"
					+ " nostri server.");	
			
			return;
		}
				
		if (!VALID_DOMAINS.contains(emailArr[1])) {
			System.out.println("Dominio della mail non valido! Per favore ricontrolla");
			
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
