package semaine2.formatif1.exercice3;

public class Saumon extends Animal {
    private boolean avecSangChaud;
    private Milieu milieu;
    private boolean estAquatique;

    public enum Milieu {EAU_SALEE, EAU_DOUCE, MIXTE}

    public Saumon(double taille) {
        super(taille, "saumon", true);
        avecSangChaud = false;
        milieu = Milieu.MIXTE;
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
