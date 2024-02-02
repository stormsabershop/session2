package semaine2.formatif1.exercice3;

public class VerDeTerre extends Animal {
    private int nombrePairDePattes;

    public VerDeTerre(double taille) {
        super(taille, "ver de terre", false);
        nombrePairDePattes = 0;
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
