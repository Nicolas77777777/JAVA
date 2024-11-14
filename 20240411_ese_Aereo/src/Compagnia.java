import java.util.ArrayList;

public class Compagnia {
    private ArrayList<Aereo> aerei = new ArrayList<>();

    public void aggiungiAereo(Aereo aereo) {
        aerei.add(aereo);
    }

    public void stampaPostiAerei() {
        for (int i = 0; i < aerei.size(); i++) {
            System.out.println("Aereo " + i + ":");
            aerei.get(i).stampaPosti();
            System.out.println("Posti disponibili: " + aerei.get(i).postiDisponibili());
        }
    }
    
    public Aereo getAereo(int index) {
        if (index >= 0 && index < aerei.size()) {
            return aerei.get(index);
        }
        return null;
    }
}
