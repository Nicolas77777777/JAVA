
public class Aereo {
    private boolean[] posti;

    public Aereo(int numeroPosti) {
        posti = new boolean[numeroPosti];
    }

    public boolean prenotaPosto(int numeroPosto) {
        if (numeroPosto >= 0 && numeroPosto < posti.length && !posti[numeroPosto]) {
            posti[numeroPosto] = true;
            return true;
        }
        return false;
    }

    public int postiDisponibili() {
        int count = 0;
        for (boolean posto : posti) {
            if (!posto) count++;
        }
        return count;
    }
    
    public void stampaPosti() {
        for (int i = 0; i < posti.length; i++) {
            System.out.println("Posto " + i + ": " + (posti[i] ? "Prenotato" : "Libero"));
        }
    }
}
