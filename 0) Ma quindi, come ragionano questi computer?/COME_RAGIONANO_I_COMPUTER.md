# Come ragionano i computer, i bit, il byte e i moderni sistemi a 32 bit e 64 bit

*Autore*: Michele Mincone - 7 novembre 2025 ore 20:15
         
Ripassiamo al volo, in modo semplice e con esempi come ragionano i computer.
         
I computer ragionano in linguaggio binario (detto anche linguaggio macchina o codice macchina)
         
Il linguaggio binario è composto da 0 e da 1.
         
0 e 1 sono i bit e:
- vengono usati per rappresentare dati o dare istruzioni
- rappresentano l'unità più piccola dell'informazione e il linguaggio fondamentale dei computer
- rappresentano ciò che succede fisicamente sul computer. Immaginiamo il computer come un enorme
e intricatissimo insieme di piste collegate tra loro dove passa la corrente. In un codice binario,
quando incontriamo 0 (zero) la corrente NON passa e quando incontriamo 1 (uno) la corrente passa.
         
Quindi, fisicamente, sul computer i bit rappresentano il passaggio o meno della corrente.
         
Nella logica booleana, il codice binario è strettamente legato a valori di verità:
- 0 rappresenta "FALSO" ("false" in inglese)
- 1 rappresenta "VERO" ("true" in inglese)
         
Il linguaggio binario è su base 2, questo perché le unità fondamentali sono due: 0 e 1.
         
Quindi la rappresentazione matematica della logica binaria avrà come base il numero 2.
         
Noi siamo abituati al sistema matematico su base 10 e a contare, quindi, in modo progressivo da zero.
         
Ma non farti trarre in inganno! Anche in un sistema binario possiamo rappresentare numeri grandissimi!
         
Inoltre, dal sistema binario possiamo passare a quello su base 10.
         
Ad esempio, con 1 bit possiamo rappresentare 2 numeri a partire da zero:
- 0 (bit) = 0 (base 10)
- 1 (bit) = 1 (base 10)
         
Questo è 1 bit, con 2 bit possiamo rappresentare 4 numeri a partire da zero:
- 00 (2 bit) = 0
- 01 (2 bit) = 1
- 10 (2 bit) = 2
- 11 (2 bit) = 3
         
E se dovessimo aggiungere i segni positivi o negativi a questi numeri?
         
Allora il discorso cambia. Rappresentiamo sempre 4 numeri ma:
- parto da -2
- arrivo a +1
         
Quindi con 2 bit, in senso assoluto ho sempre 4 numeri ma:
- senza segno ho: 0, 1, 2, 3
- con il segno positivo o negativo: -2, -1, 0, 1 (quindi è come se avessi "diviso in due" la successione perché ho il segno)
         
Quindi in base al numero di bit, posso capire quanti numeri posso avere usando la seguente formula:
2^(n. bit) o 2 (quindi base 2) elevato al numero di bit
         
Quindi con 2 bit avrò:
2^2 (2 elevato alla seconda) che come risultato da: 4 (quindi posso rappresentare 4 numeri).
         
Ma essendo che per i computer il numero 0 ha posizione reale e viene considerato nel conteggio, la formula corretta 
per calcolare il numero massimo rappresentabile è:
(2^2) - 1   ->  4 - 1  ->  3
         
Quindi posso contare fino a 3 partendo da zero: 0, 1, 2, 3 (sono quattro numeri contati in senso assoluto).
         
Se volessi trovare il numero massimo e minimo su 2 bit con i segni positivo e negativo allora farò:
Numero massimo positivo: (2^2-1) - 1  ->  2 - 1  -> 1
Numero massimo negativo: -(2^2-1)   ->  -(2)   -> -2
                  
Ora saliamo di livello, con 32 bit possiamo rappresentare il numero 4 294 967 295 (risultato di 2 elevato
alla 32 meno 1, che da un risultato di oltre quattro miliardi).
         
Ma questo numero è rappresentabile con 32 bit se è senza segno (si dice unsigned number o numero senza segno).
Quindi senza segno positivo o negativo.
         
Invece, sempre con 32 bit, per rappresentare i numeri con i segni positivo (+) o negativo (-) abbiamo:
- massimo +2 147 483 647 (numeri positivi, compreso lo zero)
- minimo -2 147 483 648 (numeri negativi)
         
Questi vengono chiamati numeri con il segno o signed numbers.
         
Quindi con i segni il numero massimo o minimo è più piccolo, ma in senso assoluto, andando a contare tutti i numeri
da quello negativo più piccolo a quello positivo più grande, abbiamo sempre, come conteggio finale 4 294 967 295.
         
Ripetendo il concetto, con 64 bit possiamo rappresentare numeri molto più grandi.

Prova a scrivere sulla calcolatrice:
2<sup>64</sup> (2 elevato alla 64esima)

Il numero che vedrai sarà negli ordini dei *miliardi dei miliardi*:
1.84 x 10<sup>19</sup>

(oppure 1,84467440737E19)

Oppure ancora, scritto per esteso:
18.446.744.073.709.551.615

Quindi in un sistema a 64 bit posso rappresentare 2<sup>64</sup> combinazioni di 0 e 1.

Ma qual'è il numero massimo che posso rappresentare considerando lo zero? Quindi da quale numero parto?

La risposta è:
2<sup>64</sup> - 1

I sistemi a 64 bit, potendo rappresentare ordini di grandezza molto elevati:
- possono gestire quantità di memoria RAM molto maggiori rispetto ai sistemi a 32 bit
- possono gestire quantità di dati molto maggiori per ciclo di clock della CPU e in modo più efficiente
- il multitasking è più esteso (più task) e più efficiene
- maggiore sicurezza a livello software (driver signature) e a livello hardware (hardware data execution o DEP: Data Execution Prevention)
- maggiori performance durante l'esecuzione di software complessi, AI, videogiochi o elaborazione di grandi quantità di dati

# Ordini di grandezza: 8 bit sono equivalenti a? E poi?
Per rendere più leggibile la lettura in bit di grandi quantità di dati è possibile usare vari ordini di grandezza.

Ma partiamo dall'ordine di grandezza basilare che raggruppa il numero minimo di bit, ovvero: il *BYTE*.

Se è vero che 0 e 1 sono l'unità minima di rappresentazione dei dati e che rappresentano 1 bit, è vero anche che su un computer ho tantissimi dati e quindi tantissimi, ma veramente tanti, bit.

L'ordine di grandezza che ho citato poco fa, ovvero il Byte, è uguale a 8 bit.

Quindi:
1 byte = 8 bit.

Fin ora ho parlato di sistemi a 32 bit e 64 bit, in Byte sono traducibili in:
- 32 bit = 4 byte 
- 64 bit = 8 byte

Al contrario:
- 4 byte = 4 byte * 8 = 32 bit
- 8 byte = 8 byte * 8 = 64 bit

Quindi risulta più comodo usare l'unità di grandezza del byte per rappresentare tanti bit.

Ma poco fa ho detto che il computer ha veramente moltissimi dati: GB (GigaByte) di dati, se non TB (TeraByte) di dati.

Scarico programmi e si aggiungono diversi MB (MegaByte) di dati sul mio computer, e perché no, anche potenzialmente GB (GygaBytes) di dati, ritrovandomi a occupare TB (TeraByte) di dati.

Oppure posso occupare spazio con KB (KyloByte) di dati o documenti molto piccoli di B (Bytes).

Quindi, ecco a te tutti gli ordini di grandezza in relazione col Byte:

- 1 bit (b)             (unità fondamentale)
- 1 byte (B) = 8 bit      
- 1 kilobyte (KiB) = 1024 byte (8192 bit)
- 1 megabyte (MiB) = 1024 kilobyte (8.388.608 bit)
- 1 gigabyte (GiB) = 1024 megabyte = 1.048.576 kilobyte (8.589.934.592 bit)
- 1 terabyte (TiB) = 1024 gigabyte
- 1 petabyte (PiB) = 1024 terabyte
- 1 exabyte (EiB) = 1024 petabyte
- 1 zettabyte (ZiB) = 1024 exabyte
- 1 yottabyte (YiB) = 1024 zettabyte

*Nota*: Questo schema usa la base binaria (1024), tradizionale in informatica. 
Esiste anche la base decimale (1000) del Sistema Internazionale:
- 1 KB (decimale) = 1000 byte (o unità del Sistema Internazionale (SI))
- 1 KiB (binario) = 1024 byte (nel sistema binario)

I produttori di hard disk spesso usano la base decimale (ecco perché un disco 
da "1 TB" mostra ~931 GB nel sistema operativo: 1000 vs 1024).

# Il linguaggio binario e Java (linguaggio leggibile da noi)
Noi nel corso Java scriveremo in linguaggio simile a quello umano.

Quindi con Java, ma come in tanti altri linguaggi, scriviamo in un linguaggio familiare a quello umano e
useremo terminologie tecniche o abbreviazioni che ci semplificano il lavoro da programmatore.
         
Per cui, NON scriviamo in binario, sarebbe una follia.
         
Ma scriviamo in Java, quindi in un linguaggio comprensibile a noi umani, per poi compilare ed eseguire quel codice
in linguaggio binario o codice macchina.
         
Quindi scriviamo codice Java, per poi dare al computer una sequenza lunghissima di 0 e 1 da eseguire come istruzioni.
         
Ad esempio, i tipi di dati che vedremo (o che abbiamo visto) in Java, quando dichiariamo delle variabili, non saranno 
nient'altro che sequenze di 0 e di 1 (che per noi erano assegna questo valore a questa variabile con questo tipo di dato).
         
Le variabili possiamo immaginarle come contenitori all'interno dei quali ho informazioni.
         
Il tipo di informazione è fondamentale, quindi devo dichiarare il tipo di dato.
         
Questo perché Java è un linguaggio fortemente tipizzato.
         
Java mi fornisce vari tipi di dati per indicare il tipo di valore nella variabile (ricorda: la variabile è una
sorta di contenitore dove metto il valore che voglio, ma devo rispettare il tipo di dato)
         
I tipi di dati in Java si dividono in due famiglie:
- tipi di dati primitivi
- tipi di dato non-primitivi o di riferimento (quindi che fanno riferimento a classi)
         
Poi vedremo cosa comporta questo a livello di memoria e di e della sua gestione (introducendo
la spiegazione su "stack e heap" e che i tipi di dato di riferimento o NON primitivi creano delle istanze di classe).

Nonostante nel linguaggio Java abbiamo tutte queste regole che noi umani comprendiamo, alla fine il computer potrà eseguire solo
una sequenza di 0 e 1 che conterranno le istruzioni o i dati fondamentali.
         
Buono studio dal vostro docente Michele!
