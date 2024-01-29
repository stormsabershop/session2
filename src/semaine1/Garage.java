package semaine1;


public class Garage {
    private Automobile[] stationnements;
    private Automobile[] garages;

    private int prixDeLaFacture = 0;

    /**
     * crée un Garage avec le nombre de places de stationnement demandé et toujours 2 places de garage pour les réparations.
     *
     * @param nombrePlacesStationnement le nombre de places requises.
     */
    public Garage(int nombrePlacesStationnement) {
        assert nombrePlacesStationnement > 0 : "valeur négative";


        //TODO1 création des tableaux
        garages = new Automobile[2];
        stationnements = new Automobile[nombrePlacesStationnement];
    }

    /**
     * Stationne l'auto dans le premier emplacement vide
     *
     * @param auto l'auto à placer dans le stationnement
     * @return faux s'il n'y a plus de palce
     */
    public boolean stationne(Automobile auto) {
        assert auto != null : "paramètre Null";
        for (int i = 0; i < stationnements.length; i++) {
            if (stationnements[i] != null){
                stationnements[i] = auto;
                return true;
            }
        }

        //TODO 4
        return false;
    }

    /**
     * indique si le stationnement est plein
     *
     * @return vrai s'il est plein
     */
    private boolean stationnementEstPlein() {
        //TODO 2
        for (int i = 0; i < stationnements.length; i++) {
            if (stationnements[i] != null){
                return false;
            }
        }


        return true;
    }

    /**
     * trouve la première place libre. On doit vérifier qu'il y a une place libre avant d'appeler cette méthode
     *
     * @return l'indice de la place libre ou ArrayIndexOutOfBoundsException si le stationnement est plein
     */
    private int trouveIndexPlaceLibre() {
        //TODO 3
        int result = -1;
        for (int i = 0; i < stationnements.length; i++) {
            if (stationnements[i] != null) {
                result = i;

            }
        }
        return result;
    }

    /**
     * trouve la première place libre. On doit vérifier qu'il y a une place libre avant d'appeler cette méthode
     *
     * @return l'indice de la place libre ou ArrayIndexOutOfBoundsException si le stationnement est plein
     */
    public int trouvePlace() {
    //TODO  5
        int result = -1;
        for (int i = 0; i < garages.length; i++) {
            if (garages[i] != null) {
                result = i;
            }
        }
        return result;
    }


    /**
     * entre le vehicule demandé dans le garage à la place demandé
     *
     * @param vehiculeRepare le vehicule à entrer (il doit être dans le stationnement)
     * @param placeGarage    la place du garage (elle ne doit pas contenir de vehicule)
     * @return vrai si le vehicule a pu être entré
     */
    public boolean entreVehiculeGarage(Automobile vehiculeRepare, int placeGarage) {
        int indexGarage = placeGarage - 1;
        assert vehiculeRepare != null : "null Vehicule";
        assert indexGarage >= 0 : "place négative";
        assert indexGarage < garages.length : "place inexistante";

        boolean validation = false;

        for (int i = 0; i < stationnements.length; i++) {
            if (vehiculeRepare == stationnements[i]){
                stationnements[i] = null;
            }

        }

        for (int i = 0; i < garages.length; i++) {
            if (i == indexGarage){
                garages[i] = vehiculeRepare;
                validation = true;
            }

        }




        //TODO 7
        return validation;
    }

    private int chercheVehiculeStationnement(Automobile vehiculeRepare) {
        assert vehiculeRepare != null : "Null param";
        int stationnement = 0;
        for (int i = 0; i < stationnements.length; i++) {
            if (stationnements[i] == vehiculeRepare){
                stationnement = i;
            }

        }


        //TODO 6
        return stationnement;
    }

    /**
     * sort le vehicule du garage et le remet dans le stationnement.
     *
     * @param placeGarage       la place du garabe où prendre le vehicule à sortir ( il doit y avoir un vehicule à cette place)
     * @param placeStationement la place de stationnement où mettre le vehicule (le stationnement doit être libre)
     * @return retourne vrai si le vehicule est sorti.
     */
    public boolean sortVehicule(int placeGarage, int placeStationement) {
        int indexGarage = placeGarage - 1;
        int indexStationnement = placeStationement - 1;
        Automobile voiture = null;
        boolean verification = false;

        assert indexGarage >= 0 : "place garage négative";
        assert indexGarage < garages.length : "place garage inexistante";
        assert indexStationnement >= 0 : "place stationnement négative";
        assert indexStationnement < stationnements.length : "place stationnement inexistante";
        for (int i = 0; i < garages.length; i++) {
            if (i == placeGarage && garages[i] != null){
                voiture = garages[i];
                garages[i] = null;
            }

        }
        for (int i = 0; i < stationnements.length; i++) {
            if (i == placeStationement && stationnements[i] == null && voiture != null){
                stationnements[i] = voiture;
                verification = true;
            }

        }



        //TODO 8
        return verification;
    }

    /**
     * gère le départ d'un véhicule en l'effacant du stationnement et en retournant sa valeur
     *
     * @param auto le vehicule qui doit être retiré
     * @return le vehicule qui doit être retiré sii il est trouvé null autrement.
     */
    public Automobile faitDepartVehicule(Automobile auto) {
        assert auto != null: "parametre null";
        Automobile vehiculeTrouve = null;
        for (int i = 0; i < stationnements.length; i++) {
            if (stationnements[i] == auto){
                stationnements[i] = null;
                vehiculeTrouve = auto;
            }

        }
        //TODO 9
        return vehiculeTrouve;
    }

    public Automobile.Etat reparer(Automobile.Etat etatDeRaparation) {
        switch (etatDeRaparation){
            case BRISE -> {
                etatDeRaparation = Automobile.Etat.REPARE;
                prixDeLaFacture += 1000;

            }
            case TRES_BRISE -> {
                etatDeRaparation = Automobile.Etat.REPARE;
                prixDeLaFacture += 2000;
            }
        }
        return etatDeRaparation;
    }

    /**
     * répare tous les dommages du vehicule en indiquant l'état réparé.
     * Défi: essayez de gérer le cout des réparations.
     */
    public void repare() {
        //TODO 10
        for (int i = 0; i < garages.length; i++) {
            if (garages[i] != null){
                prixDeLaFacture = 0;
                Automobile.Etat Carosserie =  garages[i].getEtatCarosserie();
                Automobile.Etat Moteur =  garages[i].getEtatMoteur();
                Automobile.Etat Transmission = garages[i].getEtatTransmission();

                garages[i].setEtatTransmission(reparer(Transmission));
                garages[i].setEtatMoteur(reparer(Moteur));
                garages[i].setEtatCarosserie(reparer(Carosserie));
                System.out.println("La facture s'élève à " + prixDeLaFacture + " $ Cad");


                /*

                if (carosserie != Automobile.Etat.NEUF && carosserie != Automobile.Etat.REPARE){

                    garages[i].setEtatCarosserie(Automobile.Etat.REPARE);
                }
                if (Moteur != Automobile.Etat.NEUF && Moteur != Automobile.Etat.REPARE){
                    garages[i].setEtatMoteur(Automobile.Etat.REPARE);
                }
                if (Transmission != Automobile.Etat.NEUF && Transmission != Automobile.Etat.REPARE){
                    garages[i].setEtatTransmission(Automobile.Etat.REPARE);
                }

                 */


            }

        }


    }


}
