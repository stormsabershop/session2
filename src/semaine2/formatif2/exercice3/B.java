package semaine2.formatif2.exercice3;

public class B extends A{
    public void parle(){
        super.parle();
        System.out.println("Je suis B");
    }
    @Override
    public void dire(){
        System.out.println("B dit");
    }
}
