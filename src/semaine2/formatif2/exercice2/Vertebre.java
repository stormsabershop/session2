package semaine2.formatif2.exercice2;

public class Vertebre extends Animal {
    private boolean estAquatique;

    public Vertebre(double taille, String nom, boolean estAquatique) {
        super(taille, nom, true);

        this.estAquatique = estAquatique;
    }

    public String decritAnimal() {
        return "marche pas";
    }
}
