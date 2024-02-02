package semaine2.formatif2.exercice4.heritageDelegation;

public class Application {
    public static void main(String[] args) {
        Tablette tablette = new Tablette();
        TablettePlusLTE tablettePlusLTE = new TablettePlusLTE();
        TablettePlus5G tablettePlus5G = new TablettePlus5G();

        tablette.capturePhoto();
        tablettePlus5G.capturePhoto();
        tablettePlusLTE.capturePhoto();
    }
}
