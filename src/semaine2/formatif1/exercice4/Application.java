package semaine2.formatif1.exercice4;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {
        Citoyen citoyen1 = new Citoyen("Rafael", LocalDate.parse("2001-12-03"), 12976123);
        System.out.println(citoyen1);
    }
}
