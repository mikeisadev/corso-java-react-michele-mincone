import java.util.ArrayList;
import java.util.List;

public class Persona {
	
	// Proprietà
	String nome;
	String cognome;
	int eta;
	List<String> passioni = new ArrayList<>();
	
	// Costruttore
	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public static void main(String[] args) {
		Persona michele = new Persona("Michele", "Mincone");
		System.out.println(michele.nome + " " + michele.cognome);
	}
	
	public void presentati() {
		System.out.println("Piacere! Sono " + this.nome + " " + this.cognome );
	}
	
	public String prendiNome() {
		return this.nome;
	}

}
