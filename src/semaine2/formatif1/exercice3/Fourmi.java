package semaine2.formatif1.exercice3;

public class Fourmi extends Animal {
    private int nombrePairDePattes;
    public Fourmi(double taille) {
        super(taille, "fourmi", false);
        nombrePairDePattes = 3;

    }

    public String decritFourmi() {
        return "Fourmi{" +
                "taille=" + taille +
                ", nom='" + nom + '\'' +
                ", estVertebre=" + estVertebre +
                ", nombrePairDePattes=" + nombrePairDePattes +
                '}';
    }

}
