package semaine2.formatif2.exercice2;

public class Invertebre extends Animal {
    protected int nombrePairDePattes;

    public Invertebre(double taille, String nom, int nombrePairDePattes) {
        super(taille, nom, false);
        this.nombrePairDePattes = nombrePairDePattes;
    }
}
