package formatif1.exercice3;

public class Fourmi {
    private double taille;
    private String nom;
    private boolean estVertebre;
    private int nombrePairDePattes;

    public Fourmi(double taille) {
        nom = "fourmi";
        estVertebre = false;
        nombrePairDePattes = 3;
        this.taille = taille;
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
