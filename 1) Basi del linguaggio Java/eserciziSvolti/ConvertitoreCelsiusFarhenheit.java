import java.util.Scanner;

public class ConvertitoreCelsiusFarhenheit {
	
	private static int temperatura;
	
	private static int MIN_TEMPERATURE = -300;
	private static int MAX_TEMPERATURE = 6000;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				
		System.out.print("Dammi la temperatura in gradi Celsius (°C): ");
		
		temperatura = toInt( input.nextLine() );
		
		if (temperatura < MIN_TEMPERATURE) {
			System.err.println("Hai superato il limite minimo della temperatura che puoi fornire!");
			return;
		}
		
		if (temperatura > MAX_TEMPERATURE) {
			System.err.println("Hai superato il limite massimo della temperatura che puoi fornire!");
			return;
		}
		
		System.out.println("Gradi Fahrenheit: " + toFahrenheit(temperatura));
		
		input.close();
	}
	
	private static int toFahrenheit(int celsius) {
		return ((celsius * 9) / 5) + 32;
	}
	
	private static int toInt(String str) {
		try {
			return Integer.parseInt(str);
		} catch (NumberFormatException e) {
			System.err.println("La temperatura inserita è scorretta.");
			
			return MIN_TEMPERATURE - 1;
		}
	}

}
