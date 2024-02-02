package semaine2.formatif2.exercice3;



public class Application {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        a.parle();// il y a un problème (StackOverflowError) corrigez-le
        b.parle();// pourquoi ?
        c.parle();// pourquoi ?

        System.out.println("\npartie 2");
        a=b;//
        a.parle(); // pourquoi ?
        a.dire();// pourquoi ?


        a=c; //puisque c est un a
        a.parle();// pourquoi ?
        a.dire();// pourquoi ?

        //Que se passera-t-il si les instructions super.parle() et l'instruction System.out.prinln() sont inversés dans la méthode parle? Expliquez
    }
}
