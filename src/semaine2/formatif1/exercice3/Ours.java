package semaine2.formatif1.exercice3;

public class Ours extends Animal {
    private boolean avecSangChaud;
    private boolean estNocturne;
    private boolean estAquatique;

    public Ours(double taille) {
        super(taille, "ours", true);
        avecSangChaud = true;
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
