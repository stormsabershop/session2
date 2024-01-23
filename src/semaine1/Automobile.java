package semaine1;

import java.util.Objects;

public class Automobile {
    public enum Etat {TRES_BRISE, BRISE, REPARE, NEUF}

    private String NIP;

    private Etat etatTransmission = Etat.NEUF;
    private Etat etatCarosserie = Etat.NEUF;
    private Etat etatMoteur = Etat.NEUF;

    public Automobile(String NIP) {
        this.NIP = NIP;
    }

    public Automobile() {
        this("0sdfdsffds");
    }

    public void repare() {
	//@TODO




    }

    public Etat getEtatTransmission() {
        return etatTransmission;
    }

    public void setEtatTransmission(Etat etatTransmission) {
        this.etatTransmission = etatTransmission;
    }

    public Etat getEtatCarosserie() {
        return etatCarosserie;
    }

    public void setEtatCarosserie(Etat etatCarosserie) {
        this.etatCarosserie = etatCarosserie;
    }

    public Etat getEtatMoteur() {
        return etatMoteur;
    }

    public void setEtatMoteur(Etat etatMoteur) {
        this.etatMoteur = etatMoteur;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "NIP='" + NIP + '\'' +
                ", etatTransmission=" + etatTransmission +
                ", etatCarosserie=" + etatCarosserie +
                ", etatMoteur=" + etatMoteur +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Automobile that = (Automobile) o;
//        return Objects.equals(NIP, that.NIP);
//    }

    public static void main(String[] args) {
        Automobile auto1 = new Automobile("a");
        Automobile auto2 = new Automobile("b");
        Automobile auto3 = new Automobile("a");

        auto1 = auto3;

        boolean val = auto1 == auto3;

        Automobile[] stationnements = new Automobile[4];
        Automobile[] stationnements2 = new Automobile[4];


        stationnements[1] = auto2;
        stationnements2[2]= stationnements[1];

        System.out.println(auto1);
    }
}
