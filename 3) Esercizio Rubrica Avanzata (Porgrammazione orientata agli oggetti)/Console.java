import java.util.Scanner;
import java.util.Set;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

public class Console {
	
	/**
	 * Scanner
	 */
	private static final Scanner SCANNER = new Scanner(System.in);
	
	/**
	 * Manage prompt data
	 */
	private static Map<String, String> PROMPTS = null;

	private static List<String> PROMPT_KEYS = new ArrayList<>();
	
	/**
	 * Return struct type
	 */
	private static Map<String, String> data = new HashMap<>();
	
	/**
	 * Utility commands.
	 */
	private static final String LISTA_RUBRICA = "l";
	private static final String CERCA_COMANDO = "s";
	
	/**
	 * Wrong commands:
	 */
	private static final String WRONG_EXIT_CODE = "N";
	
	/**
	 * Exit commands.
	 */
	private static final String EXIT_CODE = "n";
	
	/**
	 * Imposta i prompt di default.
	 */
	public static void setPrompts(Map<String, String> prompts) {
		Console.PROMPTS = prompts;
	}
	
	/**
	 * Ottieni gli input utente in un loop infinito.
	 */
	public static Map<String, String> loopScan() {
		List<String> keys = ListUtils.setToList(PROMPTS.keySet());
		
		int c = 0;
		
		String temporaryName = null;
		String temporaryNumber = null;
		
		while(true) {
			System.out.println(PROMPTS.get(keys.get(c)));
			String input = SCANNER.nextLine();
			
			if (c == 0) temporaryNumber = input;
			if (c == 1) temporaryName = input;
			
			c++;
			
			if (input.equals(EXIT_CODE)) {
				System.out.println("Bye! Arrivederci!\n\n");
				
				break;
			}
			
			if (c == 2) {
				data.put(temporaryName, temporaryNumber);
				temporaryName = null;
				temporaryNumber = null;
				
				c -= 2;
			}
		}
		
		return data;
	}
	
}
