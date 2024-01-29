package formatif1.exercice1;

public class ProduitEnVente {
    public final static double TAUX_TAXE = 0.15;

    public double calculeTaxe(double montant) {
        return montant * TAUX_TAXE;

    }

    public double calculeRabais(double montant, double rabais) {
        return montant - rabais;
    }

    public double calculCout(double montant, double rabais) {
        double montantReduit = calculeRabais(montant, rabais);
        return montantReduit + calculeTaxe(montantReduit);
    }

    public static void main(String[] args) {
        ProduitEnVente produit = new ProduitEnVente();
        double cout = produit.calculCout(25, 5);
        System.out.println("Le cout est de " + cout + " $");
    }
}
