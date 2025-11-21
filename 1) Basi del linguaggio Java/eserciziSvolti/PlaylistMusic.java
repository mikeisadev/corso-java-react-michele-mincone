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
		aggiungiCanzone("Nirvana", "Something in the way", "03:13");
		
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
	
	public static void calcolaDurataPlaylist() {
		/**
		 * Calcolo il totale della durata in secondi.
		 */
		double durataTot = 0;
		// double durataTotD = 0;
		
		for (String artista : playlist.keySet()) {
			List<String> canzone = playlist.get(artista);
			
			String durataCanzone = canzone.get(1);
			
			String[] durataArr = durataCanzone.split(":");
			
			Integer minuti = Integer.parseInt(durataArr[0]) * 60;
			Integer secondi = Integer.parseInt(durataArr[1]);
			
			durataTot += (minuti + secondi);
			//durataTotD += (minuti + secondi);
		}
		
		System.out.println("\n\nDurata totale playlist in secondi: " + durataTot + " s(econdi)");
		
		/**
		 * Converto il totale da secondi a minuti
		 */
		String numberFormat = String.format("%.2f", durataTot / 60.00);
		
//		2099.00
//		2099.00 / 60
//		
//		minuti (34)
//		0,98
		
		String[] numberFormatArr = numberFormat.split(",");
		
		int durataIntero = Integer.parseInt(numberFormatArr[0]);
		double durataSecondiDecimale = (double) Integer.parseInt(numberFormatArr[1]);
		
		
		int durataSecondi = (int) (Math.floor((durataSecondiDecimale/100.00)) * 60.00);
		
		System.out.println(durataIntero + ":" + durataSecondi);
	}

}