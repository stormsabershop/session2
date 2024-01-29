package semaine2.formatif1.exercice1.delegation;

public class CalculateurDeTaxe {
    public final static double TAUX_TAXE = 0.15;

    public double calculeTaxe(double montant) {
        return montant * TAUX_TAXE;

    }

    public CalculateurDeTaxe() {
    }
}
