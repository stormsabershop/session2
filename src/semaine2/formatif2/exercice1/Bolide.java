package semaine2.formatif2.exercice1;

public class Bolide extends Vehicule {
    private double vitesse;


    public Bolide(double vitesse) {
        super(0);
        assert vitesse < 5 : "vitesse trop grande";
        assert vitesse > 0 : "vitesse nulle ou négative";
        this.vitesse = vitesse;

    }

    public double getVitesse() {

        return vitesse;
    }

    public void setVitesse(double vitesse) {
        assert vitesse < 5 : "vitesse trop grande";
        assert vitesse > 0 : "vitesse nulle ou négative";

        this.vitesse = vitesse;
    }


    public double avance() {
        double pos = getPosition();
        return pos += vitesse;
    }
}
