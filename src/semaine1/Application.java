package semaine1;

public class Application {
    public static void main(String[] args) {

        //Scénario pour tester le code de Garage et Auto.
        Garage garage = new Garage(4);
        Automobile autoA = new Automobile("A");
        Automobile autoB = new Automobile("B");
        Automobile autoC = new Automobile("C");
        Automobile autoD = new Automobile("D");

        garage.stationne(autoA);
        garage.stationne(autoB);
        garage.stationne(autoC);
        garage.stationne(autoD);

        autoA.setEtatTransmission(Automobile.Etat.TRES_BRISE);
        autoA.setEtatMoteur(Automobile.Etat.BRISE);
        autoB.setEtatTransmission(Automobile.Etat.BRISE);

        autoC.setEtatCarosserie(Automobile.Etat.TRES_BRISE);

        autoD.setEtatMoteur(Automobile.Etat.BRISE);

        System.out.println("Les autos sont endommagés");
        System.out.println(autoA);
        System.out.println(autoB);
        System.out.println(autoC);
        System.out.println(autoD);

        System.out.println("\n les autos sont réparées");
        // Réparation des autos A et B
        garage.entreVehiculeGarage(autoA, 1);
        garage.entreVehiculeGarage(autoB,2);

        garage.repare();
        garage.sortVehicule(1,garage.trouvePlace());
        garage.sortVehicule(2,garage.trouvePlace());

        garage.faitDepartVehicule(autoA);
        garage.faitDepartVehicule(autoB);

        System.out.println(autoA);
        System.out.println(autoB);

        // Réparation des autos C et D
        garage.entreVehiculeGarage(autoC, 1);
        garage.entreVehiculeGarage(autoD,2);

        garage.repare();
        garage.sortVehicule(1,garage.trouvePlace());
        garage.sortVehicule(2,garage.trouvePlace());

        garage.faitDepartVehicule(autoC);
        garage.faitDepartVehicule(autoD);

        System.out.println(autoC);
        System.out.println(autoD);

        // Pouvez vous faire fonctionner votre programme avec 3 places de stationnement en ne modifiant quela taille du tableau ?
        //Essayez-le en ajoutant une troisièeme place dans le scénario



    }
}
