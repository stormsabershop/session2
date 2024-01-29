package semaine2.formatif1.exercice2.delagation;

public class Tablette {
    private double energie;
    public final static double TAUX_CHARGE = 30;
    public final static double MAX_ENERGIE = 5000;

    public double getEnergie() {
        return energie;
    }

    public Tablette(double energie) {

        this.energie = energie;
    }

    /**
     * Charge le téléphone pendant une durée déterminée par le paramètre temps
     *
     * @param temps en seconde
     */
    public void charge(double temps) {
        double ajoutEnergie = temps * TAUX_CHARGE;
        energie = Math.min(MAX_ENERGIE, energie + ajoutEnergie);
    }

    /**
     * Joue à un jeu avec une intensité fournie pendant une certaine durée
     *
     * @param intensite indique comment le jeu est gourmand en enege
     * @param duree     temps de jeu
     */
    private void joue(double intensite, double duree) {
        energie = Math.max(0, energie - duree * intensite);
        System.out.println("joue à un jeux d'intensité " + intensite + " pendant " + duree + " sec");
    }

    public static void main(String[] args) {
        Tablette tablette = new Tablette(0);
        tablette.charge(60);
        tablette.joue(2,60);
        System.out.println("il reste "+tablette.getEnergie()+" dans la tablette");
    }
}
