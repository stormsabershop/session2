package semaine2.formatif1.exercice3;

public class Animal {

    protected double taille;
    protected String nom;
    protected boolean estVertebre;

    public Animal(double taille, String nom, boolean estVertebre) {
        this.taille = taille;
        this.nom = nom;
        this.estVertebre = estVertebre;
    }

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean isEstVertebre() {
        return estVertebre;
    }

    public void setEstVertebre(boolean estVertebre) {
        this.estVertebre = estVertebre;
    }
}
