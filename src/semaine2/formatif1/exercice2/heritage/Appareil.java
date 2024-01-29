package semaine2.formatif1.exercice2.heritage;

public class Appareil {
    private double energie = 0;
    public final static double TAUX_CHARGE = 30;
    public final static double TAUX_DECHARGE = 1;
    public final static double MAX_ENERGIE = 5000;


    public double getEnergie() {
        return energie;
    }

    public void charge(double temps) {
        double ajoutEnergie = temps * TAUX_CHARGE;
        energie = Math.min(MAX_ENERGIE, energie + ajoutEnergie);
    }

    public Appareil(double energie) {

        this.energie = energie;
    }

    public void setEnergie(double energie) {
        this.energie = energie;
    }
}
