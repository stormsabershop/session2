package semaine2.formatif2.exercice1;

public class Bolide {
    private double vitesse;
    private double position = 0;

    public Bolide(double vitesse) {
        assert vitesse < 5 : "vitesse trop grande";
        assert vitesse > 0 : "vitesse nulle ou négative";

        this.vitesse = vitesse;
        this.position = 0;
    }

    public double getVitesse() {

        return vitesse;
    }

    public void setVitesse(double vitesse) {
        assert vitesse < 5 : "vitesse trop grande";
        assert vitesse > 0 : "vitesse nulle ou négative";

        this.vitesse = vitesse;
    }

    public double getPosition() {
        return position;
    }

    public void setPosition(double position) {
        this.position = position;
    }

    public double avance() {
        return position += vitesse;
    }
}
