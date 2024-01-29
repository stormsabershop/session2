package semaine2.formatif1.exercice2.heritage;


public class Telephone extends Appareil {

    public Telephone(double energie) {
        super(energie);
    }

    /**
     * Charge le téléphone pendant une durée déterminée par le paramètre temps
     *
     * @param temps en seconde
     */


    /**
     * Appelle le numero reçu pendant la duree demandée
     *
     * @param numero numéro à appeler
     * @param duree  durée de l'appel
     */
    private void appelle(String numero, double duree) {
        setEnergie(Math.max(0, getEnergie() - duree * TAUX_DECHARGE));
        System.out.println("appelle le numero " + numero + " pendant " + duree + " sec");
    }

    public static void main(String[] args) {
        Telephone tel = new Telephone(0);
        tel.charge(80);
        tel.appelle("4432424", 15);
        System.out.println("il reste " + tel.getEnergie() + " dans le téléphone");
    }
}
