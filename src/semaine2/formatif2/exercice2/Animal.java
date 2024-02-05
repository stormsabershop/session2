package semaine2.formatif2.exercice2;

public class Animal {
    protected double taille;
    protected String nom;
    protected boolean estVertebre;

    public Animal(double taille, String nom, boolean estVertebre) {
        this.taille = taille;
        this.nom = nom;
        this.estVertebre = estVertebre;
    }

    public String decritAnimal() {
        return "marche pas";
    }
}
