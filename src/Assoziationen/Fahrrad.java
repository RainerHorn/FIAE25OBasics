package Assoziationen;

public class Fahrrad {

    private String marke;
    private int rahmenhoehe;
    private Reifen vorne;
    private Reifen hinten;

    public Fahrrad(String marke, int rhoehe, Reifen v, Reifen h) {
        this.marke = marke;
        rahmenhoehe = rhoehe;
        vorne = v;
        hinten = h;
    }

    public String getMarke() {
        return marke;
    }

    public int getRahmenhoehe() {
        return rahmenhoehe;
    }

    public Reifen getVorderrad() {
        return vorne;
    }

    public Reifen getHinterrad() {
        return hinten;
    }
}