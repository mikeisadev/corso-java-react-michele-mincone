package eserciziSvolti;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PlaylistMusica {
	
	private static Map<String, List<String>> playlist = new HashMap<>();
	
	private static Map<String, List<String>> risultatiRicerca = new HashMap();
		
	public static void main(String[] args) {
		/**
		 * 1) (chiave) - (valore)
		 * 
		 * 2) artista, titolo, durata
		 * 
		 * 3) artista - {titolo, durata}
		 * 
		 * 4) (chiave String - artista) - ArrayList<String> [0] titolo [1] durata
		 */
				
		aggiungiCanzone("Adele", "Hello", "03:11");
		aggiungiCanzone("KISS", "Hello", "03:11");
		aggiungiCanzone("Freddy Mercury", "Don't stop me know", "04:23");
		aggiungiCanzone("Michael Jackson", "Closet", "05:13");
		aggiungiCanzone("Linkin Park", "In The End", "03:54");
		aggiungiCanzone("Black Sabbath", "Pig wars", "05:12");
		aggiungiCanzone("Eagles", "Hotel California", "06:45");
		aggiungiCanzone("Nirvana", "Something in the way", "03:11");
		
//		stampaPlayList();
//		
//		eliminaCanzone("Hotel California");
//		
//		stampaPlayList();
//		
//		eliminaArtista("Michael Jackson");
//		
//		stampaPlayList();
		
		shuffle();
		
		calcolaDurataPlaylist();
		
		cercaCanzone("He");
	}
	
	public static void aggiungiCanzone(String artista, String titolo, String durata) {
		// Map<artista, List<titolo, durata>>
		List<String> canzone = new ArrayList<>();
		
		canzone.add(titolo);
		canzone.add(durata);
		
		playlist.put(artista, canzone);
	}
	
	public static void eliminaCanzone(String titolo) {
		for (String artista : playlist.keySet()) {
			List<String> canzone = playlist.get(artista);
			
			String titoloCanzone = canzone.get(0);
			
			if (titoloCanzone.equals(titolo)) {
				playlist.replace(artista, new ArrayList<String>());
			}
		}
	}
	
	public static void eliminaArtista(String artista) {
		playlist.remove(artista);
	}
	
	public static void stampaPlayList() {
		System.out.print("\n\n");
		
		// Nome artista - Nome Canzone - Durata
		for (String artista : playlist.keySet()) {
			List<String> canzone = playlist.get(artista);
			
			if (canzone.size() == 0) {
				System.out.println(artista + " | N\\A");
			} else {
				System.out.println(artista + " | " + canzone.get(0) + " - " + canzone.get(1));
			}
		}
	}
	
	public static void stampaPlayListOggetto() {
		System.out.print("\n\n");
		System.out.println(playlist.toString());
	}
	
	public static void shuffle() {
		List<String> artisti = new ArrayList<>();
		
		for (String artista : playlist.keySet()) {
			artisti.add(artista);
		}
		
		Collections.shuffle(artisti);
		
		for (String artista : artisti) {
			List<String> canzone = playlist.get(artista);
			
			if (canzone.size() == 0) {
				System.out.println(artista + " | N\\A");
			} else {
				System.out.println(artista + " | " + canzone.get(0) + " - " + canzone.get(1));
			}
		}
	}
	
	public static void cercaCanzone(String intentoRicerca) {
		risultatiRicerca.clear();
		
		// Effettuo la ricerca nella mappa
		for (String artista : playlist.keySet()) {
			List<String> canzone = playlist.get(artista);
			
			String titoloCanzone = canzone.get(0);
						
			if (titoloCanzone.toLowerCase().contains(intentoRicerca.toLowerCase())) {
				risultatiRicerca.put(artista, canzone);
			}
		}
		
		System.out.println("\n\nRisultati di rierca per '" + intentoRicerca + "': \n");
		
		// Stampo nella console i risultati
		for (String artista : risultatiRicerca.keySet()) {
			List<String> canzone = playlist.get(artista);
			
			if (canzone.size() == 0) {
				System.out.println(artista + " | N\\A");
			} else {
				System.out.println(artista + " | " + canzone.get(0) + " - " + canzone.get(1));
			}
		}
	}
	
	public static void calcolaDurataPlaylist() {
		// Calcolo il totale della durata in secondi.
		int durataTot = 0;
		
		for (String artista : playlist.keySet()) {
			List<String> canzone = playlist.get(artista);
			
			String durataCanzone = canzone.get(1);
			
			String[] durataArr = durataCanzone.split(":");
			
			Integer minuti = Integer.parseInt(durataArr[0]) * 60;
			Integer secondi = Integer.parseInt(durataArr[1]);
			
			durataTot += (minuti + secondi);
		}
		
		System.out.println("\n\nDurata totale playlist in secondi: " + durataTot + " s(econdi)");
		
		/**
		 * Converto il totale da secondi a minuti
		 */
		
		/**
		 * Il calcolo commentato qui sotto è sbagliato in fatto di precisione
		 * dei numeri decimali, bisogna preferire il cacolo dopo i commenti.
		 * 
		 * Questo calcolo commentato si trascina dietro un errore di circa:
		 * +- 0,036666666 / 0,0266666 secondi di errore
		 */
		// String numberFormat = String.format("%.2f", durataTot / 60.00);
		//		
		// String[] numberFormatArr = numberFormat.split(",");
		//		
		// int durataIntero = Integer.parseInt(numberFormatArr[0]);
		// double durataSecondiDecimale = (double) Integer.parseInt(numberFormatArr[1]);
		//	
		// int durataSecondi = (int) (Math.floor((durataSecondiDecimale/100.00)) * 60.00);
		
		// Versione corretta del calcolo in minuti:secondi (mm:ss)
		int durataMinuti = durataTot / 60;
		int durataSecondi = durataTot % 60; // prendo il resto della divisione durata
		
		System.out.println(
				"Calcolo semplificato " + String.format("%d : %02d", durataMinuti, durataSecondi)
		);
		
	}
	
	/**
	 * Metodo avanzato facoltativo.
	 */
	public static void soluzioneComplessaSecondiAMinuti() {
		/**
		 * Calcolo la durata totale in secondi
		 */
		int durataTot = 0;
		
		for (String artista : playlist.keySet()) {
			List<String> canzone = playlist.get(artista);
			
			String durataCanzone = canzone.get(1);
			
			String[] durataArr = durataCanzone.split(":");
			
			Integer minuti = Integer.parseInt(durataArr[0]) * 60;
			Integer secondi = Integer.parseInt(durataArr[1]);
			
			durataTot += (minuti + secondi);
		}
		
		/**
		 * Converto tutto in minuti:secondi usando un metodo
		 * più avanzato.
		 */
		int c = durataTot;
		int minuti = 0;
		int resto = 0;
		
		for (int i = 0; i < durataTot; i++) {
			if (i % 60 == 0) {
				minuti++;
			}
			
			if (c <= 60) {
				resto = c;
				minuti--;
				
				if (c == 60) {
					minuti++;
					resto = 0;
				}
				
				break;
			}
			
			c--;
		}
		
		System.out.println(
				"Calcolo a mano della conversione: " + String.format("%d : %02d", minuti, resto)
		);
	}

}