package formatif1.exercice3;

public class Ours {
    private double taille;
    private String nom;
    private boolean estVertebre;
    private boolean avecSangChaud;
    private boolean estNocturne;
    private boolean estAquatique;

    public Ours(double taille) {
        nom = "ours";
        estVertebre = true;
        avecSangChaud = true;
        this.taille = taille;
        estNocturne = false;
        estAquatique = false;
    }

    public String decritOurs() {
        return "Ours{" +
                "taille=" + taille +
                ", nom='" + nom + '\'' +
                ", estVertebre=" + estVertebre +
                ", avecSangChaud=" + avecSangChaud +
                ", estNocturne=" + estNocturne +
                ", estAquatique=" + estAquatique +
                '}';
    }

}
