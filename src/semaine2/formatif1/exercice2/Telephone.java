package formatif1.exercice2;


public class Telephone {
    private double energie = 0;
    public final static double TAUX_CHARGE = 30;
    public final static double TAUX_DECHARGE = 1;
    public final static double MAX_ENERGIE = 5000;

    public Telephone(double energie) {

        this.energie = energie;
    }

    public double getEnergie() {
        return energie;
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
     * Appelle le numero reçu pendant la duree demandée
     *
     * @param numero numéro à appeler
     * @param duree  durée de l'appel
     */
    private void appelle(String numero, double duree) {
        energie = Math.max(0, energie - duree * TAUX_DECHARGE);
        System.out.println("appelle le numero " + numero + " pendant " + duree + " sec");
    }

    public static void main(String[] args) {
        Telephone tel = new Telephone(0);
        tel.charge(80);
        tel.appelle("4432424", 15);
        System.out.println("il reste " + tel.getEnergie() + " dans le téléphone");
    }
}
