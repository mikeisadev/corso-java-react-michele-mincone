public class RipassoTipiDati {
    
    public static void main(String[] args) {
        /**
         * RIPASSO RAPIDO!
         * 
         * Ti ricordo che questo è un commento multilinea!
         * 
         */
        
        // Mentre questo è un commento su singola linea!
    	
    	/**
    	 * Con questa funzione stampo una stringa sulla stessa riga della console.
    	 */
    	System.out.print("Hello, World! Rimango sulla stessa riga in console :(");
  
    	/**
    	 * Con questa funzione stampo sulla console il testo indicato tra
    	 * parentesi tonde portando a capo la prossima riga della prossima funzione print o println
    	 */
        System.out.println("===== TIPI PRIMITIVI (8 totali) =====\n");
        
        /**
         * Ora vediamo assieme i tipi di dati in Java.
         * 
         * Nel linguaggio Java i tipi di dati si dividono in:
         * - tipi di dati primitivi
         * - tipi di dati NON primitivi o di riferimento
         * 
         * Nel corso delle lezioni vedremo cosa significa "tipo di dato primitivo e non primitivo" o
         * perché i tipi di dati non primitivi si dicono anche di riferimento.
         * 
         * Ora ti basta sapere che:
         * 
         * - i tipi di dati PRIMITIVI NON hanno una classe di riferimento
         * - i tipi di dati NON PRIMITIVI o DI RIFERIMENTO hanno una classe di riferimento
         * 
         * Più avanti vedremo le implicazioni in memoria affrontando i concetti di stack e heap.
         * 
      	 * Iniziamo a vedere come possiamo rappresentare i numeri interi in Java.
      	 * 
      	 * NOTA: ti ricordo che i tipi di dato li uso per dichiarare una variabile. Per dichiarare una 
      	 * variabile uso la seguente espressione:
      	 * 
      	 * <tipo_di_dato> nomeVariabile = valore della variabile
         */
        
        // 1. INTERI
        byte numeroPiccolo = 127;                    // 8 bit: -128 a 127 (lo zero viene considerato)
        short numeroMedio = 32000;                   // 16 bit: -32,768 a 32,767 (lo zero viene considerato)
        int numeroNormale = 2_000_000;               // 32 bit: -2 miliardi a 2 miliardi
        long numeroGrande = 9_000_000_000L;          // 64 bit (nota la L finale)
        
        /**
         * Hai notato che uso il trattino basso "_" nei numeri grandi?
         * 
         * Serve per aumentare la leggibilità, non è obbligatorio.
         */
        short numeroLeggibilePiccolo = 32_000;
        int numeroLeggibileGrande = 1_234_234_234;
        long numeroLeggibileMoltoGrande = 2_158_294_294_231_395_294L;
        
        int numeroNONLeggibileGrande = 1234234234;
        long numeroNONLeggibileMoltoGrande = 2158294294231395294L;
        
        /**
         * Nota:
         * 
         * con il tipo "int", in realtà posso rappresentare precisamente:
         * - massimo +2 147 483 647 (numeri positivi, compreso lo zero)
         * - minimo -2 147 483 648 (numeri negativi)
         */
        int numeroMassimoConInt = 2_147_483_647;
        int numeroMinimoConInt = -2_147_483_648;
        
        // int numeroFuoriScala = 2_147_483_847; // Togli il commento, vedrai un errore.
        
        System.out.println("byte: " + numeroPiccolo);
        System.out.println("short: " + numeroMedio);
        System.out.println("int: " + numeroNormale);
        System.out.println("long: " + numeroGrande);
        
        /**
         * Ricorda che:
         * 
         * 8 bit = 1 byte
         * 16 bit = 2 byte
         * 32 bit = 4 byte
         * 64 bit = 8 byte
         * 
         * Quindi:
         * 
         * 1 byte = 8 bit
         */
        
        // 2. DECIMALI
        float numeroDecimaleFloat = 3.14f;            // precisione fino a 32 bit (nota la f finale)
        double numeroDeciamleDouble = 3.14159265359;   // precisione fino a 64 bit (default per decimali)
        
        System.out.println("\n\nfloat: " + numeroDecimaleFloat);
        System.out.println("double: " + numeroDeciamleDouble);
        
        // 3. CARATTERE
        char lettera = 'M';                    // 16 bit: singolo carattere Unicode
        char unicode = '\u0041';               // 'A' in Unicode
        
        System.out.println("char: " + lettera);
        System.out.println("char (unicode): " + unicode);
        
        // 4. BOOLEANO
        boolean vero = true;                   // true o false
        boolean falso = false;
        
        System.out.println("\n\nboolean vero: " + vero);
        System.out.println("boolean falso: " + falso);
        
        
        System.out.println("\n\n=== TIPI DI RIFERIMENTO ===\n");
        
        // 1. STRING (tipo di dato più usato)
        String nome = "Michele";
        String cognome = new String("Rossi");  // Questo è meno comune ma valido
        
        System.out.println("String: " + nome);
        System.out.println("String con metodi: " + nome.toUpperCase() + " (rendo la stringa tutta maiuscola)");
        System.out.println("Lunghezza: " + nome.length());
        
        // 2. WRAPPER CLASSES (tipi di dati con classi di riferimento a tipi di dato primitivi)
        Integer numeroOggetto = 42;     // Integer è una classe, ma che in realtà fa riferinento a int
        Double decimaleOggetto = 3.14;
        Boolean booleanoOggetto = true;
        Character carattereOggetto = 'A';
        
        /**
         * Nota come le variabili che contengono tipi di dato di riferimento mi fanno accedere a dei metodi.
         * 
         * Questo perché i tipi di dato di riferimento fanno riferimento a una classe.
         * 
         * Le classi hanno metodi, ricordi?
         */
        System.out.println("Integer wrapper: " + numeroOggetto);
        System.out.println("Con metodo: " + numeroOggetto.toString());
        System.out.println("Metodo di confronto: " + numeroOggetto.compareTo(50));
        
        // 3. ARRAY (tipo di riferimento)
        int[] numeri = {1, 2, 3, 4, 5};
        String[] linguaggi = {"Python", "PHP", "Java", "Rust", "C", "Javascript"};
     
        /**
         * Nota:
         * 
         * gli array sono delle liste di valori.
         * 
         * I valori dentro l'array devono rispettare il tipo di dato indicato prima di []
         */
        
        /**
         * Per prendere un elemento dentro un array uso [numero]
         * 
         * Gli array supportano metodi o proprietà.
         * 
         * Ad esempio "linguaggi.length" restituisce la lunghezza dell'array, ovvero quanti elementi
         * ha al suo interno
         */
        System.out.println("Array int: " + numeri[0]);
        System.out.println("Array String: " + linguaggi[1]);
        System.out.println("Lunghezza array: " + linguaggi.length);
        
        // 4. OGGETTI PERSONALIZZATI O CUSTOM
        // In Java tutto è praticamente un oggetto.
        // Posso creare un nuovo tipo di dato di riferimento creando una classe!
        // Quando creo una classe, posso usare il nome di quella classe prima del nome della variabile
        Persona persona = new Persona("Michele", 23);
        
        System.out.println("Oggetto custom: " + persona.getNome());
        System.out.println("Età: " + persona.getEta());
        
        // 5. NULL (solo per tipi di dato di riferimento!). NULL significa senza valore o valore nullo
        String vuoto = null;                   // OK per tipi di dato di riferimento
        // int numero = null;                  // Errore! I tipi primitivi non possono essere null
        Integer numeroNullabile = null;        // OK con wrapper (classi che fanno riferimento a tipi primitivi)
        
        System.out.println("\nString null: " + vuoto);
        System.out.println("Integer null: " + numeroNullabile);
        
        /**
         * Ora vediamo qualcosa di più avanzato.
         * 
         * Se ti va di esplorare, altrimenti va bene quanto detto prima e il resto
         * lo vediamo assieme durante le lezioni!
         */
        System.out.println("\n\n=== DIFFERENZE CHIAVE ===\n");
        
        // Primitivi: valore diretto
        int a = 5;
        int b = a;  // Copia il VALORE esatto in "b" dalla variabile "a"
        b = 10;
        
        System.out.println("Primitivo a: " + a + " (rimane 5)");
        System.out.println("Primitivo b: " + b + " (diventa 10)");
        
        // Riferimenti: copia dell'indirizzo di memoria
        Persona p1 = new Persona("Mario", 30);
        Persona p2 = p1;  // Copia il RIFERIMENTO (stesso oggetto! Non crea un nuovo oggetto istanziando una nuova classe)
        
        p2.setNome("Luigi");
        
        System.out.println("\nRiferimento p1: " + p1.getNome() + " (cambiato! Non ho Mario come nome)");
        System.out.println("Riferimento p2: " + p2.getNome() + " (stesso oggetto)");
        
        /**
         * Buono studio dal tuo docente Michele!
         */
    }
}

/**
 * Qui ho creato una nuova classe!
 * 
 * Si, posso usare le classi che creo come tipi di dato di riferimento per le variabili che dichiaro!
 */
class Persona {
    private String nome;
    private int eta;
    
    public Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getEta() {
        return eta;
    }
}