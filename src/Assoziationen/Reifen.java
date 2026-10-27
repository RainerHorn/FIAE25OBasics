package Assoziationen;

public class Reifen {

    private int durchmesser;
    private double luftdruck;

    public Reifen(int d) {
        durchmesser = d;
        luftdruck = 0.0;
    }

    public int getDurchmesser() {
        return durchmesser;
    }

    public double getLuftdruck() {
        return luftdruck;
    }

    public void aufpumpen() {
        luftdruck = luftdruck + 0.1;
    }
}