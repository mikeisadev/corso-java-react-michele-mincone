import java.time.LocalDate;

import java.util.List;
import java.util.ArrayList;

public class EsempiArray {

	public static void main(String[] args) {
		
		/**
		 * In questa spiegazione vediamo gli array, ma vediamo solo quelli STATICI.
		 * 
		 * Ovvero ARRAY che definisco una volta e poi non posso più aggiungergli valori.
		 * 
		 * Posso aggiungere altri valori alle Liste, per esempio. Che sono una struttura di dati
		 * più flessibile e lavorabile con molti più metodi.
		 */
		
		/**
		 * Questo in JAVA è un array STATICO di stringhe
		 */
		String[] listaDiStringhe = {
				"Stringa 1", "Stringa 2", "Stringa 3", 
				"Stringa 4", "Stringa 5", "Stringa 6",
				"Stringa 7", "Stringa 8", "Stringa 9",
		};
		
		/**
		 * COME INDICO UN ARRAY? ATTENZIONE AL TIPO DI DATO PRIMA DEL NOME DELLA VARIABILE!
		 * <type>[] nomeVariabile = {<valore>, ... <valori> ...};
		 * 
		 * ESEMPI PRATICI:
		 * int[] arrayNumeri = {1234, 464, 49545};
		 * String[] arrayStringhe = {"str1", "str2", "str3", "str4", "str5"};
		 * 
		 * ATTENZIONE: anche se indico un tipo di dato primitivo con parentesi quadre, 
		 * il tipo di dato int[] è di riferimento e NON primitivo.
		 * 
		 * Quindi tutti gli array sono tipi di dato di riferimento o NON PRIMITIVE.
		 */
		int[] listaNumeri = {5353, 3453, 5453, 13434, 6939, 9395};
		
		long[] listaNumeriGrandi = {123, 4354445, 5454464, 365364654754L, 2942729472L};
		
		double[] listaNumeriDouble = {5485.3485400, 8304.56, 3.1485606840, Math.PI};
		
		float[] listaNumeriFloat = {12.678f, 34.90f, 0.18f};
		
		char[] listaCaratteri = {'a', 'b', 'c', 'd', 'e', 'f'};
		
		/**
		 * Questi tipi di dati sono tutti di riferimento o NON primitivi pure se utilizzo
		 * tipi di dati primitivi.
		 * 
		 * Infatti, usando il nome della variabile, posso accedere a diversi "metodi".
		 * 
		 * Ad esempio, riprendendo la variabile listaNumeri posso accedere alla sua lunghezza.
		 */
		System.out.println(listaNumeri.length + "\n");
		
		/**
		 * Riproviamo con un altro array:
		 */
		System.out.println(
				"La variabile 'listaDiStringhe' contiene " 
				+ listaDiStringhe.length +
				" elementi"
				+ "\n"
		);
		
		/**
		 * Accedere ai valori di un array.
		 * 
		 * Uso le parentesi quadre e un numero.
		 * 
		 * RICORDA: Gli array sono su base 0, quindi userò il numero 0 per ottenere
		 * il primo elemento.
		 */
		System.out.println(
				"Il primo elemento dell'array 'listaDiStringhe' è: " 
				+ listaDiStringhe[0]
				+ "\n"
		);
		
		/**
		 * Array con lista di date
		 */
		LocalDate[] arrayDiDate = {
				LocalDate.now(),
				LocalDate.now().minusDays(2)
		};
		
		System.out.println(
				"Le date in 'arrayDiDati' sono: " 
				+ arrayDiDate[0] + " " + arrayDiDate[1]
				+ "\n"
		);
		
		/**
		 * Array bidimensionali:
		 * 
		 * SPIEGAZIONE: lista di array dentro un array principale
		 */
		int[][] matrice = new int[2][2];
		
		int[][] matrix = {
				{2, 1},
				{3, 8}
		};
		
		/**
		 * Array multidimensionali
		 * 
		 * da 3 dimensioni in poi
		 */
		int[][][] vettori = new int[1][2][3];
		
		// Array a 6 dimensioni
		String[][][][][][] arrayNDimensionale = new String[2][2][2][2][2][2];
		
	}

}
