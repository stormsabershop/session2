package semaine2.formatif2.exercice3;

public class C extends B{
    public void parle(){
        System.out.println("Je suis C");
        parle();
    }
    public void dire(){
        System.out.println("B dit");
    }
}
