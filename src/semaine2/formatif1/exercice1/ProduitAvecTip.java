package formatif1.exercice1;

public class ProduitAvecTip {
    public final static double TAUX_TAXE = 0.15;

    public double calculeTaxe(double montant) {
        return montant * TAUX_TAXE;
    }

    public double calculeTip(double montant, double tauxTip) {
        return montant * tauxTip;
    }

    public double calculCout(double montant, double tauxTip) {
        return montant + calculeTip(montant, tauxTip) + calculeTaxe(montant);
    }

    public static void main(String[] args) {
        ProduitAvecTip produit = new ProduitAvecTip();
        double cout = produit.calculCout(25, 0.15);
        System.out.println("Le cout est de " + cout + " $");
    }
}
