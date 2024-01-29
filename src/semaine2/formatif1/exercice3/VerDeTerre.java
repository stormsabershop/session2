package formatif1.exercice3;

public class VerDeTerre {

    private double taille;
    private String nom;
    private boolean estVertebre;
    private int nombrePairDePattes;

    public VerDeTerre(double taille) {
        nom = "ver de terre";
        estVertebre = false;
        nombrePairDePattes = 0;
        this.taille = taille;
    }

    public String decritVerDeTerre(){
        return "VerDeTerre{" +
                "taille=" + taille +
                ", nom='" + nom + '\'' +
                ", estVertebre=" + estVertebre +
                ", nombrePairDePattes=" + nombrePairDePattes +
                '}';
    }

}
