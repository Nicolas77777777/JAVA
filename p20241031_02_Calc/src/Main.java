import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
    	// Scanner per leggere l'input dell'utente
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un'espressione aritmetica (es: 4+5*2-1):");
        String input = scanner.nextLine();
        scanner.close();
        
        // Rimuovere gli spazi dall'input
        input = input.replaceAll(" ", "");
        
        // Variabile per il risultato
        int risultato = 0;
        // Variabile per il numero corrente
        int numeroCorrente = 0;
        /* Variabile per l'operatore corrente (inizialmente "+", così il primo numero viene aggiunto)
        scegliamo l'operatore + (che significa aggiungere)
        per facilitare il lavoro, perché così il primo numero sarà subito "aggiunto" al risultato
        */
        char operatoreCorrente = '+';
        
        /* 
         * Scori ogni carattere dell'input
	 		"charat" e fornisci l'indice di cui devi trovare il carattere.
	 		 char tipo di dato charAt 
         */
        
        for (int i = 0; i < input.length(); i++) {
            char carattere = input.charAt(i); // char tipo di dato charAt 
            
            // Se il carattere è un numero, aggiungilo al numero corrente
            if (Character.isDigit(carattere)) {
                numeroCorrente = numeroCorrente * 10 + (carattere - '0');
            }
            
            // Se il carattere è un operatore o siamo alla fine dell'input, esegui l'operazione
            if (!Character.isDigit(carattere) || i == input.length() - 1) {
                // Esegui l'operazione corrente in base all'operatore
                switch (operatoreCorrente) {
                    case '+':
                        risultato += numeroCorrente;
                        break;
                    case '-':
                        risultato -= numeroCorrente;
                        break;
                    case '*':
                        risultato *= numeroCorrente;
                        break;
                    case '/':
                        if (numeroCorrente != 0) {
                            risultato /= numeroCorrente;
                        } else {
                            System.out.println("Errore: divisione per zero.");
                            return;
                        }
                        break;
                }
                
                // Aggiorna l'operatore corrente e reimposta il numero corrente
                operatoreCorrente = carattere;
                numeroCorrente = 0;
            }
        }
        
        // Stampa il risultato finale
        System.out.println("Risultato: " + risultato);
    }
}