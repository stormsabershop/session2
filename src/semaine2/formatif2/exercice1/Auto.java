package semaine2.formatif2.exercice1;

public class Auto extends Vehicule {

    public final static double DEPLACEMENT = 3;

    public Auto(double position) {
        super(position);
    }

    public Auto(){
        super(0);
    }

    public double avance() {
        double pos = getPosition();
        return pos += DEPLACEMENT;
    }
}
