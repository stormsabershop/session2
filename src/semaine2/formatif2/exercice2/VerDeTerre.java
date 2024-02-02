package semaine2.formatif2.exercice2;

public class VerDeTerre extends Invertebre {


    public VerDeTerre(double taille) {
        super(taille, "ver de terre", 0);
    }

    public String decritAnimal() {
        return "VerDeTerre{" +
                "taille=" + taille +
                ", nom='" + nom + '\'' +
                ", estVertebre=" + estVertebre +
                ", nombrePairDePattes=" + nombrePairDePattes +
                '}';
    }
}
