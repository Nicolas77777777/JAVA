
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
    	// Array con numeri da "0" a "9" e operatori aritmetici
    	String[] operandiEoperatori = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "+", "-", "*", "/"};

        // Creazione dello scanner per leggere l'input da console
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un'operazione aritmetica (es: 10 + 20):");
        String input = scanner.nextLine();
        
        scanner.close();

        // Rimuove tutti gli spazi bianchi dalla stringa
        input = input.replaceAll(" ", "");
        System.out.println("Input senza spazi: " + input);

        // Separare gli operandi tramite una regex che identifica gli operatori
        String[] operandi = input.split("[\\+\\-\\*\\/]");
        
      

        
        int op1 = Integer.parseInt(operandi[0]);
        int op2 = Integer.parseInt(operandi[1]);

        // Estrarre l'operatore usando una regex per i numeri e trovarlo come secondo elemento
        String[] voperatore = input.split("[0-9]+");
        String operatore = voperatore[1];  // L'operatore è al secondo posto nel vettore

        // Eseguire l'operazione in base all'operatore
        int risultato = 0;
        switch (operatore) {
            case "+":
                risultato = op1 + op2;
                System.out.println("Risultato: " + risultato);
                break;
            case "-":
                risultato = op1 - op2;
                System.out.println("Risultato: " + risultato);
                break;
            case "*":
                risultato = op1 * op2;
                System.out.println("Risultato: " + risultato);
                break;
            case "/":
                if (op2 != 0) {
                    risultato = op1 / op2;
                    System.out.println("Risultato: " + risultato);
                } else {
                    System.out.println("divisione per zero non consentita.");
                }
                break;
            default:
                System.out.println("Operatore non riconosciuto.");
        }
    }
}