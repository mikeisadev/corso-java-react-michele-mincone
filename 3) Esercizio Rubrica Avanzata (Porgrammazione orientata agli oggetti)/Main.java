import java.util.Map;
import java.util.HashMap;

final public class Main {
	
	private final static Map<String, String> promptStruct = new HashMap<>();

	/**
	 * Main - avvia tutto
	 */
	public static void main(String[] args) {
		Main.initPrompts();
		
		Console.setPrompts(promptStruct);
		
		Map<String, String> data = Console.loopScan();
		
		Rubrica rubrica = new Rubrica(data);		
		Rubrica.listaRubrica();
	}
	
	private static void initPrompts() {
		promptStruct.put("numero", "Inserisci il numero di telefono: ");
		promptStruct.put("nome", "Inserisci il nome: ");
	}
	
}
