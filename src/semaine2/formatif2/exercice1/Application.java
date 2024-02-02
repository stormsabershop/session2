package semaine2.formatif2.exercice1;

public class Application {
    public static void main(String[] args) {
        Auto auto = new Auto();
        Bolide bolide = new Bolide(5);

        // On fait avancer une auto
        for (int i = 0; i < 3; i++) {
            auto.avance();
            System.out.println(" auto position " + auto.getPosition());
        }

        // On fait avancer un bolide
        for (int i = 0; i < 3; i++) {
            bolide.avance();
            System.out.println(" bolide position " + bolide.getPosition());
        }

        // On peut les mettre dans un tableau
        System.out.println("\n\nAvec instanceof");
        Object[] vehicules = new Object[5];
        Vehicule[] vehiculesPolymorphiques = new Vehicule[6];

        vehiculesPolymorphiques[0] = new Auto();
        vehiculesPolymorphiques[1] = new Bolide(2);
        vehiculesPolymorphiques[2] = new Bolide(3);
        vehiculesPolymorphiques[3] = new Bolide(4);
        vehiculesPolymorphiques[4] = new Auto();
        vehiculesPolymorphiques[5] = new Bolide(6);



        vehicules[0] = new Auto();
        vehicules[1] = new Bolide(2);
        vehicules[2] = new Auto();
        vehicules[3] = new Bolide(3);

        for (int i = 0; i < vehiculesPolymorphiques.length; i++) {
            vehiculesPolymorphiques[i].setPosition(vehiculesPolymorphiques[i].avance());
            System.out.println("le vehicule par polymorphisme est rendu a " + vehiculesPolymorphiques[i].getPosition());
        }

        //******************************************************************************
        //Notez que c'est une TRÈS MAUVAISE solution, il faut l'éviter à tout prix!!!!!
        for (
                int i = 0;
                i < vehicules.length; i++) {
            Object vehicule = vehicules[i];
            if (vehicule instanceof Auto) {
                Auto autoCourante = (Auto) vehicule;
                autoCourante.setPosition(autoCourante.avance());
                System.out.println("le vehicule/auto avec instanceof est rendu à " + autoCourante.getPosition());
            }
            if (vehicule instanceof Bolide) {
                Bolide bolideCourant = (Bolide) vehicule;
                bolideCourant.setPosition(bolideCourant.avance());
                System.out.println("le vehicule/bolide avec instanceof est rendu à " + bolideCourant.getPosition());
            }
        }

        System.out.println("\n\nAvec polymorphisme");


        //ajoutez un camion et voyez laquelle des 2 solutions tient mieux la route.


    }
}
