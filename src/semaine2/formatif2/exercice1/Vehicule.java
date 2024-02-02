package semaine2.formatif2.exercice1;

public class Vehicule {

    private double position;

    public Vehicule(double position) {
        this.position = position;
    }

    public double avance() {
        return 1;
    }

    public double getPosition() {
        return position;
    }

    public void setPosition(double position) {
        this.position = position;
    }
}
