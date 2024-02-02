package semaine2.formatif2.exercice2;

public class Ours extends Vertebre{

    protected boolean estNocturne;

    public Ours(double taille) {
        super(taille,"ours", false);

        estNocturne = false;
    }

    public String decritAnimal(){
        return "Ours{" +
                "taille=" + taille +
                ", nom='" + nom + '\'' +
                ", estVertebre=" + estVertebre +
                ", estNocturne=" + estNocturne +
                '}';
    }
}
