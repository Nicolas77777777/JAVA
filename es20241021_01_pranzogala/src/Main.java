import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Creazione del menu
        Cibo[] menu = new Cibo[5];
        menu[0] = new Cibo("Pasta Amatriciana", 400);
        menu[1] = new Cibo("Tagliata di manzo", 500);
        menu[2] = new Cibo("Trota salmonata", 300);
        menu[3] = new Cibo("Carbonara", 350);
        menu[4] = new Cibo("Tiramisu", 200);

        // Stampa del menu
        for (Cibo cibo : menu) {
            System.out.println(cibo);
        }

        // Calcolo delle calorie totali
        int totaleCalorie = 0;
        for (Cibo cibo : menu) {
            totaleCalorie += cibo.getCalorie();
        }
        System.out.println("Calorie totali del menu: " + totaleCalorie);

        // Creazione del pranzo per 50 persone
        Cibo[][] pranzo50 = new Cibo[50][3];
        Random random = new Random();

        for (int i = 0; i < pranzo50.length; i++) {
            for (int j = 0; j < 3; j++) {
                int randomIndex = random.nextInt(menu.length);
                pranzo50[i][j] = menu[randomIndex];
            }
        }

        // Stampa del pranzo per le 50 persone
        for (int i = 0; i < pranzo50.length; i++) {
            System.out.println("Persona " + (i + 1) + ":");
            for (int j = 0; j < pranzo50[i].length; j++) {
                System.out.println(pranzo50[i][j]);
            }
            System.out.println();
        }
    }
}
