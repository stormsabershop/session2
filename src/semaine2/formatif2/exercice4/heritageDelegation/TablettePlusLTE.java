package semaine2.formatif2.exercice4.heritageDelegation;

public class TablettePlusLTE {

    private String camera = "camera";
    private String cameraZoom = "cameraZoom";

    public void capturePhoto() {
        System.out.println("Je prend une belle photo avec ma " + cameraZoom);
        envoie("Voici ma belle photo");
    }

    public void connect() {
        System.out.println("Je me connect en LTE");
    }

    public void envoie(String message) {
        connect();
        System.out.println("Message envoyé: " + message);
    }

}
