package semaine2.formatif2.exercice2;

public class App {

    public static void main(String[] args) {
        Animal[] animals = new Animal[7];

        animals[0] = new VerDeTerre(2);
        animals[1] = new Fourmi(1);
        animals[2] = new Ours(25);
        animals[3] = new Saumon(5);
        animals[4] = new Fourmi(2);
        animals[5] = new Ours(180);
        animals[6] = new Saumon(30);

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].decritAnimal());
        }
    }
}
