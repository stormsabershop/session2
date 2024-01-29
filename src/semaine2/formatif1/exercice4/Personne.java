package formatif1.exercice4;

import java.time.LocalDate;
import java.util.Objects;

public class Personne {
    private String nom;
    private LocalDate dateNaissance;

    public Personne(String nom, LocalDate dateNaissance) {
        this.nom = nom;
        this.dateNaissance = dateNaissance;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personne citoyen = (Personne) o;
        return Objects.equals(nom, citoyen.nom) && Objects.equals(dateNaissance, citoyen.dateNaissance);
    }

    @Override
    public String toString() {
        return "Citoyen{" +
                "nom='" + nom + '\'' +
                ", dateNaissance=" + dateNaissance +
                '}';
    }
}
