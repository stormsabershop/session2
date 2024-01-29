package semaine2.formatif1.exercice1.heritage;

public class ProduitEnVente extends ProduitTaxe {

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
