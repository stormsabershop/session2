package semaine2.formatif2.exercice3;

public class B extends A{
    public void parle(){
        System.out.println("Je suis B");
        parle();
    }
    @Override
    public void dire(){
        System.out.println("B dit");
    }
}
