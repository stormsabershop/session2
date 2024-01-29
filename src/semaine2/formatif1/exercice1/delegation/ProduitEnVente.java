package semaine2.formatif1.exercice1.delegation;

public class ProduitEnVente {

    private CalculateurDeTaxe calculateurDeTaxe = new CalculateurDeTaxe();

    public double calculeRabais(double montant, double rabais) {
        return montant - rabais;
    }

    public double calculCout(double montant, double rabais) {
        double montantReduit = calculeRabais(montant, rabais);
        return montantReduit + calculateurDeTaxe.calculeTaxe(montantReduit);
    }

    public static void main(String[] args) {
        ProduitEnVente produit = new ProduitEnVente();
        double cout = produit.calculCout(25, 5);
        System.out.println("Le cout est de " + cout + " $");
    }
}
