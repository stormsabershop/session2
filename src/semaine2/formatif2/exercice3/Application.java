package semaine2.formatif2.exercice3;



public class Application {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        a.parle();// il y a un problème (StackOverflowError) corrigez-le
        System.out.println("--------------------------------");
        b.parle();// pourquoi ? il part de b et remonte jusqu'au parent principal donc A
        System.out.println("--------------------------------");
        c.parle();// pourquoi ? il part de c et remonte jusqu'au parent A en passant par le parent B

        System.out.println("\npartie 2");
        a=b;// L'objet de a est remplacé par l'objet de B
        a.parle(); // pourquoi ? il part de b et remonte jusqu'au parent principal donc A
        a.dire();// pourquoi ? L'objet de a est remplacé par l'objet de B et execute dire de B


        a=c; //puisque c est un a L'objet de a est remplacé par l'objet de C
        a.parle();// pourquoi ? il part de C et remonte jusqu'au parent principal donc A
        a.dire();// pourquoi ? L'objet de a est remplacé par l'objet de B et execute dire de B

        //Que se passera-t-il si les instructions super.parle() et l'instruction System.out.prinln() sont inversés dans la méthode parle? Expliquez
        // au lieu de partir de l'enfant et de remonter jusqu'au parent A on part du parent et on desend jusqu'a l'enfant
    }
}
