package semaine2.formatif2.exercice2;

public class Saumon extends Vertebre{

    private Milieu milieu;

    public enum Milieu {EAU_SALEE, EAU_DOUCE, MIXTE}

    public Saumon(double taille) {
        super(taille,"saumon", true);

        milieu = Milieu.MIXTE;

    }
    public String decritAnimal(){
        return "Saumon{" +
                "taille=" + taille +
                ", nom='" + nom + '\'' +
                ", estVertebre=" + estVertebre +
                ", milieu=" + milieu +
                '}';
    }
}
