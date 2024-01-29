package semaine2.formatif1.exercice1.heritage;

public class ProduitTaxe {
    public final static double TAUX_TAXE = 0.15;

    public double calculeTaxe(double montant) {
        return montant * TAUX_TAXE;

    }


}
