package semaine2.formatif1.exercice2.delagation;

public class Tablette {

    private Batterie batterie = new Batterie();

    public Tablette(double energie) {
        batterie.setEnergie(energie);
    }

    /**
     * Charge le téléphone pendant une durée déterminée par le paramètre temps
     *
     * @param temps en seconde
     */
    public void charge(double temps) {
        double ajoutEnergie = temps * Batterie.TAUX_CHARGE;
        batterie.setEnergie(Math.min(Batterie.MAX_ENERGIE, batterie.getEnergie() + ajoutEnergie));
    }

    /**
     * Joue à un jeu avec une intensité fournie pendant une certaine durée
     *
     * @param intensite indique comment le jeu est gourmand en enege
     * @param duree     temps de jeu
     */
    private void joue(double intensite, double duree) {
        batterie.setEnergie(Math.max(0, batterie.getEnergie() - duree * intensite));
        System.out.println("joue à un jeux d'intensité " + intensite + " pendant " + duree + " sec");
    }

    public static void main(String[] args) {
        Tablette tablette = new Tablette(0);
        tablette.charge(60);
        tablette.joue(2,60);
        System.out.println("il reste "+ tablette.batterie.getEnergie()+" dans la tablette");
    }
}
