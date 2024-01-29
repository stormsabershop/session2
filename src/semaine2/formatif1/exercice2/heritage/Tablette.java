package semaine2.formatif1.exercice2.heritage;

public class Tablette extends Appareil{

    public Tablette(double energie) {
        super(energie);
    }

    /**
     * Charge le téléphone pendant une durée déterminée par le paramètre temps
     *
     * @param temps en seconde
     */

    /**
     * Joue à un jeu avec une intensité fournie pendant une certaine durée
     *
     * @param intensite indique comment le jeu est gourmand en enege
     * @param duree     temps de jeu
     */
    private void joue(double intensite, double duree) {
        setEnergie(Math.max(0, getEnergie() - duree * intensite));
        System.out.println("joue à un jeux d'intensité " + intensite + " pendant " + duree + " sec");
    }

    public static void main(String[] args) {
        Tablette tablette = new Tablette(0);
        tablette.charge(60);
        tablette.joue(2,60);
        System.out.println("il reste "+tablette.getEnergie()+" dans la tablette");
    }
}
