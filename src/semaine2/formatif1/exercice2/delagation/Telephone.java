package semaine2.formatif1.exercice2.delagation;


public class Telephone {

    private Batterie batterie = new Batterie();

    public Telephone(double energie) {

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
     * Appelle le numero reçu pendant la duree demandée
     *
     * @param numero numéro à appeler
     * @param duree  durée de l'appel
     */
    private void appelle(String numero, double duree) {
        batterie.setEnergie(Math.max(0, batterie.getEnergie() - duree * Batterie.TAUX_DECHARGE));
        System.out.println("appelle le numero " + numero + " pendant " + duree + " sec");
    }

    public static void main(String[] args) {
        Telephone tel = new Telephone(0);
        tel.charge(80);
        tel.appelle("4432424", 15);
        System.out.println("il reste " + tel.batterie.getEnergie() + " dans le téléphone");
    }
}
