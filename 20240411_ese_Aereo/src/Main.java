import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1) Creiamo le compagnie
        Compagnia compagnia1 = new Compagnia();
        Compagnia compagnia2 = new Compagnia();

        // 2) Creiamo la biglietteria
        Biglietteria biglietteria = new Biglietteria(compagnia1, compagnia2);

        // 3) Aggiungiamo qualche aereo a ogni compagnia
        compagnia1.aggiungiAereo(new Aereo(10));
        compagnia1.aggiungiAereo(new Aereo(15));
        compagnia2.aggiungiAereo(new Aereo(20));

        // 4) Menu per prenotazioni
        int scelta;
        do {
            System.out.println("Menu:");
            System.out.println("1) Prenota posto su un aereo");
            System.out.println("2) Visualizza posti per ogni compagnia e aereo");
            System.out.println("3) Esci");
            System.out.print("Scegli un'opzione: ");
            scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    System.out.print("Scegli la compagnia (1 o 2): ");
                    int numCompagnia = scanner.nextInt();
                    System.out.print("Scegli il numero dell'aereo: ");
                    int numAereo = scanner.nextInt();
                    System.out.print("Scegli il numero del posto: ");
                    int numPosto = scanner.nextInt();
                    boolean successo = biglietteria.prenotaPosto(numCompagnia, numAereo, numPosto);
                    if (successo) {
                        System.out.println("Prenotazione avvenuta con successo!");
                    } else {
                        System.out.println("Prenotazione non riuscita. Controlla che il posto sia libero.");
                    }
                    break;

                case 2:
                    biglietteria.stampaPosti();
                    break;

                case 3:
                    System.out.println("Uscita dal programma.");
                    break;

                default:
                    System.out.println("Opzione non valida.");
            }
        } while (scelta != 3);

        scanner.close();
    }
}
