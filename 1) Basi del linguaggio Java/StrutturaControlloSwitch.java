
public class StrutturaControlloSwitch {

	public static void main(String[] args) {
		/**
		 * SWITCH - Struttura di controllo
		 * 
		 * La usiamo per una gestione più pulita di diverse condizioni al posto di if/elseif/else
		 */
		String nome = "Marta";
		
		switch(nome) {
			case "Michele":
				System.out.println("Sono Michele");
				break;
				
			case "Francesco":
				System.out.println("Sono Francesco");
				break;
				
			case "Marco":
				System.out.println("Sono Marco");
				break;
				
			case "Filippo":
			case "Marta":
				System.out.println("Sono Marta oppure posso essere Filippo");
				break;
				
			default:
				System.out.println("Sono Michele");
				
		}
	}
}
