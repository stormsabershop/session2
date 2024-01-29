package semaine2.formatif1.exercice2.delagation;

public class Batterie {

    private double energie = 0;
    public final static double TAUX_CHARGE = 30;
    public final static double TAUX_DECHARGE = 1;
    public final static double MAX_ENERGIE = 5000;

    public Batterie() {}

    public double getEnergie() {
        return energie;
    }

    public void setEnergie(double energie) {
        this.energie = energie;
    }
}
