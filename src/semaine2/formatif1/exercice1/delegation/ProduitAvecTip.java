package semaine2.formatif1.exercice1.delegation;

public class ProduitAvecTip {

    private CalculateurDeTaxe calculateurDeTaxe = new CalculateurDeTaxe();

    public double calculeTip(double montant, double tauxTip) {
        return montant * tauxTip;
    }

    public double calculCout(double montant, double tauxTip) {
        return montant + calculeTip(montant, tauxTip) + calculateurDeTaxe.calculeTaxe(montant);
    }

    public static void main(String[] args) {
        ProduitAvecTip produit = new ProduitAvecTip();
        double cout = produit.calculCout(25, 0.15);
        System.out.println("Le cout est de " + cout + " $");
    }


    

}
