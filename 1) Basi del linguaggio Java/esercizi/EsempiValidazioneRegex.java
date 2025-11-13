
public class EsempiValidazioneRegex {
	
	/**
	 * In questa classe vediamo come validare le stringhe
	 * attraverso espressioni regex.
	 * 
	 * Qui puoi trovare espressioni regex di esempio:
	 * https://gist.github.com/jacksonfdam/3000275
	 * 
	 * NOTA: Non imparare a memoria REGEX.
	 */
	
	// INPUT UTENTE DI ESEMPIO.
	private static String email = "info@michelemincone.com";
	
	private static String passwordNonSicura = "password";
	private static String passwordSicura = "r38fAh5sA49r4grN^";
	
	private static String telefono = "+39123121234";
	private static String codiceFiscale = "LIMHLK09P12C789Z";
	private static String età = "23";
	private static String data = "2025-11-13";
	private static String dataOra = "2025-11-13 17:30:00";
	private static String cap = "66100";
	private static String localhost = "127.0.0.1";
	private static String cartaCredito = "4242 4242 4242 4242";
	
	public static void main(String[] args) {
		
		// Validazione email.
		if (validazioneEmail(email)) {
			System.out.println("Email valida!");
		} else {
			System.err.println("Email NON valida!");
		}
		
		// Validazione password.
		if (validazionePassword(passwordSicura)) {
			System.out.println("Password sicura!");
		} else {
			System.err.println("Password NON sicura!");
		}
		
		// Validazione telefono.
		if (validazioneTelefono(telefono)) {
			System.out.println("Numero di telefono valido!");
		} else {
			System.err.println("Numero di telefono NON valido!");
		}
		
	}
	
	private static Boolean validazioneEmail(String email) {
		String regex = "^[\\w\\-]+(\\.[\\w\\-]+)*@([A-Za-z0-9-]+\\.)+[A-Za-z]{2,4}$";
		
		if (!email.matches(regex)) {
			return false;
		}
		
		return true;
	}
	
	private static Boolean validazionePassword(String pass) {
		String regex = "^(?=.*[A-Z].*[A-Z])(?=.*[^!?@#$&*])(?=.*[0-9].*[0-9])(?=.*[a-z].*[a-z].*[a-z]).{8,24}$";
	
		if (!pass.matches(regex)) {
			return false;
		}
		
		return true;
	}

	
	private static Boolean validazioneTelefono(String tel) {
		String regex = "(^\\+[0-9]{2}|^\\+[0-9]{2}\\(0\\)|^\\(\\+[0-9]{2}\\)\\(0\\)|^00[0-9]{2}|^0)([0-9]{9}$|[0-9\\-\\s]{10}$)";
		
		if (!tel.matches(regex)) {
			return false;
		}
		
		return true;
	}
}
