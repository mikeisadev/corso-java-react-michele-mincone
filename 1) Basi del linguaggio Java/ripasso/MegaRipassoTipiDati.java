import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class MegaRipassoTipiDati {
	
	/**
	 * Questo è un metodo
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * Scatola di dati = variabile
		 * 
		 * In Java dichiaro una variabile con
		 * 
		 * tipo_dato nomeVariabile = Valore
		 * 
		 * In Java abbiamo due tipi di dati:
		 * - primitivi
		 * - non primitivi (o di riferimento)
		 * 
		 * 
		 * I tipi di dato primitivi non hanno metodi, sono direttamente implementati
		 * nel linguaggio Java
		 * 
		 * I tipi di dato NON PRIMITIVI (o di riferimento) hanno metodi, perché
		 * fanno riferimento a metodi della rispettiva classe
		 */
		
		
		// TIPI DI DATI PRIMITIVI (CURIOSITà: avviati nella memoria stack)
		// 1. Numeri interi
		byte numeroPiccolo = 40;          					// 8 bit (-128 + 127)
		short numeroMedio = 32_000;         				// 16 bit (calcolo su base 2)
		int numeroNormale = 2_000_000_000; 					// 32 bit (calcolo su base 2)
		long numeroGrande = 2_000_000_000_000_000_000L;		// 64 bit (ricorda la L maiuscola per convenzione, calcolo su base 2)
		
		// 2. Numeri decimali
		float numeroDecimalePiccolo = 12.789f;				// 32 bit (ricorda la f, minuscola per convenzione)
		double numeroDecimaleGrande = 12.123456789012345;	// 64 bit (molto preciso in matematica o per calcoli ad alta precisione)
		
		/**
		 * Per unità di misura di calcolo, prezzi del carrello di un ecommerce
		 * e calcoli dove non è richiesta massima precisione uso il float.
		 */
		float peso1 = 12.45189f;
		float peso2 = 7.89f;
		
		/**
		 * Uso il double per numeri che in memoria e sui calcoli devono essere precisi.
		 */
		double PI = 3.14683969306939699305082058038058028308603850863086038630;
		 
		// 3. Booleano (o valore di verità)
		boolean veroOFalso = true;
		boolean falso = false;
		
		/*
		 * 4. Singolo carattere
		 * 
		 * Contiene un singolo carattere per un massimo di 2 byte (16 bit).
		 * 
		 * Deve per forza avere un valore, non può essere vuoto.
		 * 
		 * Deve essere tra singoli apici.
		 */
		char singoloCarattere = 'c'; 
		
		/**
		 * Tipi di dati NON PRIMITIVI o DI RIFERIMENTO.
		 * 
		 * - Hanno una classe di riferimento (quindi hanno dei metodi)
		 * - CURIOSITà: Vengono avviati nella memoria heap
		 * - posso creare tipi di dati creando classi (quindi non esiste typedef come in C)
		 */
		String nome = "Michele";
		
		System.out.println(nome.toUpperCase());
		System.out.println(nome.toLowerCase());
		
		System.out.println("Mi chiamo " + nome.concat(" Mincone, sono uno sviluppatore web full stack."));
		
		System.out.println("Sono la parte iniziale ".concat(", sono la parte dopo"));
		
		System.out.println("michele".toUpperCase());
		System.out.println("MICHELE".toLowerCase());
		System.out.println("Michele".charAt(1));
		
		/**
		 * Tra i tipi di dati NON PRIMITIVI abbiamo le classi wrapper che ricoprono i tipi primitivi.
		 * 
		 * RICORDA: LE CLASSI HANNO DEI METODI!
		 * 
		 * Queste clasi qui sotto ricoprono i ruoli dei tipi primitiv, ma hanno dei metodi accessibili
		 */
		
		Byte numeroPiccoloWrap = 100;
		Short numeroMedioWrap = 32000;
		Integer numeroNormaleWrap = 2_000_000;
		Long numeroGrandeWrap = 18_000_000_000_000L;
		
		Float numeroDecimalePiccoloWrap = 12.2f;
		Double numeroDecimaleGrandeWrap = 3780.1445405380350;
		
		Character singoloCarattereWrap = 'c';
		
		Boolean booleanWrap = false;
		
		System.out.println(numeroPiccoloWrap.toString());
		System.out.println(numeroDecimaleGrandeWrap.floatValue());
		
		/**
		 * Tipo di dato a capo dei numeri: classe "Number".
		 * 
		 * Dentro posso mettere tutti i tipi di numeri interi e decimali
		 */
		Number numberContieneLong = 1239438395389L;
		Number numberContieneFloat = 12.3243480f;
		Number numberContieneDouble = 1828.9348394384394834934839438394;
		
		/**
		 * TIPO DI DATO:
		 * 
		 * Date
		 * 
		 * Formato standard delle date è:
		 * 
		 * YYYY-MM-DD
		 * 
		 * Formato standard della data e dell'ora è:
		 * 
		 * YYYY-MM-DDTHH:ii:ss.ms
		 * 
		 * Questi metodi (now) prendono la data, l'orario o la data completa dalla macchina correne.
		 */
		LocalDate dataLocale = LocalDate.now();
		LocalTime tempoLocale = LocalTime.now();
		LocalDateTime dataOrario = LocalDateTime.now();
		
		System.out.println("Che data è oggi? " + dataLocale);
		System.out.println("Orario? " + tempoLocale);
		
		System.out.println("Voglio tutta la data con l'orario: " + dataOrario);
		
		/**
		 * Questi tipi di dati hanno dei metodi?
		 * 
		 * Assolutamente si, perché fanno riferimento a classi.
		 */
		System.out.println("Che anno è? " + dataLocale.getYear());
		
		/**
		 * Voglio solo ora e minuti correnti
		 */
		System.out.println("Sono le: " + tempoLocale.getHour() + ":" + tempoLocale.getMinute());
	}
		
}