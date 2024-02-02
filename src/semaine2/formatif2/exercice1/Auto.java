package semaine2.formatif2.exercice1;

public class Auto {
    private double position = 0;
    public final static double DEPLACEMENT = 3;

    public double avance() {
        return position += DEPLACEMENT;
    }

    public double getPosition() {
        return position;
    }

    public void setPosition(double position) {
        this.position = position;
    }
}
