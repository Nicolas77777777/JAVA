import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un'espressione aritmetica: ");
        String input = scanner.nextLine();
        scanner.close();
        
        input = input.replaceAll(" ", "");
        
        int risultato = 0;
        int numeroCorrente = 0;
        char operatoreCorrente = '+';
        
        String[] numeri = input.split("[\\+\\-\\*\\/]");
        String[] operatori = input.replaceAll("[0-9]", "").split("");
        
        risultato = Integer.parseInt(numeri[0]);
        
        for (int i = 1; i < numeri.length; i++) {
            numeroCorrente = Integer.parseInt(numeri[i]);
            operatoreCorrente = operatori[i - 1].charAt(0);
            
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
        }
        
        System.out.println("Risultato: " + risultato);
    }
}
