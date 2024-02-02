package semaine2.formatif2.exercice2;

public class Fourmi extends Invertebre{

    private int nombrePairDePattes;

    public Fourmi(double taille) {
        super(taille,"fourmi",3);
    }

    public String decritAnimal() {
        return "Fourmi{" +
                "taille=" + taille +
                ", nom='" + nom + '\'' +
                ", estVertebre=" + estVertebre +
                ", nombrePairDePattes=" + nombrePairDePattes +
                '}';
    }
}
