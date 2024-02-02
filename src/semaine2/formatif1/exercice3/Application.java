package semaine2.formatif1.exercice3;

public class Application {


    public static void main(String[] args) {
        Ours animal1 = new Ours(180.02);
        Fourmi animal2 = new Fourmi(2);
        Saumon animal3 = new Saumon(25);
        VerDeTerre animal4 = new VerDeTerre(2);
        System.out.println(animal1.decritOurs());
        System.out.println(animal2.decritFourmi());
        System.out.println(animal3.decritSaumon());
        System.out.println(animal4.decritVerDeTerre());
    }
}
