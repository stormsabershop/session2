package formatif1.exercice3;

public class Saumon {
    private double taille;
    private String nom;
    private boolean estVertebre;
    private boolean avecSangChaud;
    private Milieu milieu;
    private boolean estAquatique;

    public enum Milieu {EAU_SALEE, EAU_DOUCE, MIXTE}

    public Saumon(double taille) {
        nom = "saumon";
        estVertebre = true;
        avecSangChaud = false;
        milieu = Milieu.MIXTE;
        this.taille = taille;
        estAquatique = true;
    }

    public String decritSaumon(){
        return "Saumon{" +
                "taille=" + taille +
                ", nom='" + nom + '\'' +
                ", estVertebre=" + estVertebre +
                ", avecSangChaud=" + avecSangChaud +
                ", milieu=" + milieu +
                ", estAquatique=" + estAquatique +
                '}';
    }


}
