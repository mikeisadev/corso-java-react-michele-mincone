package eserciziSvolti;

import java.util.Scanner;

public class CalcolatriceBase {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("==== BENVENUTO NELLA CALCOLATRICE JAVA ====");
		
		/**
		 * Prendo tutti gli input.
		 */
		System.out.print("Dammi il primo numero: ");
		Integer a = Integer.parseInt( scanner.nextLine() );
		
		System.out.print("Dammi il secondo numero: ");
		Integer b = Integer.parseInt( scanner.nextLine() );
		
		System.out.print("Dammi l'operazione da fare: ");
		String operazione = scanner.nextLine().toLowerCase();
		
		if (b == 0 && operazione.equals("/")) {
			System.err.println("Non posso dividere il primo numero che hai inserito per 0");
			
			return;
		}
		
		/*
		 * Chiudo lo scanner
		 */
		scanner.close();
		
		/**
		 * Eseguo l'operazione
		 */
		switch(operazione) {
			case "+":
				System.out.println(a + b);
				break;
			
			case "-":
				System.out.println(a - b);
				break;
				
			case "*":
			case "x":
				System.out.println(a * b);
				break;
				
			case "/":
				System.out.println(a / b);
				break;
				
			default: 
				System.out.println("Operazione non supportata");
		}
		
		
	}

}
