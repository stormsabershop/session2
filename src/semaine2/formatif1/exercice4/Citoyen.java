package semaine2.formatif1.exercice4;

import java.time.LocalDate;

public class Citoyen extends Personne {

    private int nas;

    public Citoyen(String nom, LocalDate dateNaissance, int nas) {
        super(nom, dateNaissance);
        this.nas = nas;
    }

    public int getNas() {
        return nas;
    }

    public void setNas(int nas) {
        this.nas = nas;
    }

    @Override
    public String toString() {
        return "Citoyen{" +
                "nas=" + nas +
                " nom= " + getNom() +
                " date de naissance=" + getDateNaissance() +
                '}';
    }
}
