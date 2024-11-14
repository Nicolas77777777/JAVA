public class Biglietteria {
    private Compagnia compagnia1;
    private Compagnia compagnia2;

    public Biglietteria(Compagnia compagnia1, Compagnia compagnia2) {
        this.compagnia1 = compagnia1;
        this.compagnia2 = compagnia2;
    }

    public boolean prenotaPosto(int numeroCompagnia, int numeroAereo, int numeroPosto) {
        Compagnia compagnia = numeroCompagnia == 1 ? compagnia1 : compagnia2;
        Aereo aereo = compagnia.getAereo(numeroAereo);
        if (aereo != null) {
            return aereo.prenotaPosto(numeroPosto);
        }
        return false;
    }

    public void stampaPosti() {
        System.out.println("Compagnia 1:");
        compagnia1.stampaPostiAerei();
        System.out.println("Compagnia 2:");
        compagnia2.stampaPostiAerei();
    }
}
