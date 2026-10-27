package Assoziationen;

public class ReifenAdvanced {

    private int durchmesser;
    private double luftdruck;
    private double maxLuftdruck;
    private int laufleistung;
    private boolean beschaedigt;
    private String typ;

    public ReifenAdvanced(int durchmesser, double maxLuftdruck) {
        this.durchmesser = durchmesser;
        this.maxLuftdruck = maxLuftdruck;
        this.luftdruck = 0.0;
        this.laufleistung = 0;
        this.beschaedigt = false;
        this.typ = "City";
    }

    public ReifenAdvanced(int durchmesser, double maxLuftdruck, String typ) {
        this.durchmesser = durchmesser;
        this.maxLuftdruck = maxLuftdruck;
        this.luftdruck = 0.0;
        this.laufleistung = 0;
        this.beschaedigt = false;
        this.typ = typ;
    }

    public int getDurchmesser() {
        return durchmesser;
    }

    public double getLuftdruck() {
        return luftdruck;
    }

    public double getMaxLuftdruck() {
        return maxLuftdruck;
    }

    public int getLaufleistung() {
        return laufleistung;
    }

    public boolean istBeschaedigt() {
        return beschaedigt;
    }

    public String getTyp() {
        return typ;
    }

    public void aufpumpen() {
        aufpumpen(0.1);
    }

    public void aufpumpen(double bar) {

        if (bar <= 0) {
            return;
        }

        luftdruck = luftdruck + bar;

        if (luftdruck > maxLuftdruck) {
            luftdruck = maxLuftdruck;
        }
    }

    public void fahren(int kilometer) {

        if (kilometer <= 0) {
            return;
        }

        laufleistung = laufleistung + kilometer;

        int hunderter = kilometer / 100;

        double luftverlust = hunderter * 0.1;

        if (beschaedigt) {
            luftverlust = luftverlust * 2;
        }

        luftdruck = luftdruck - luftverlust;

        if (luftdruck < 0) {
            luftdruck = 0;
        }

        if (laufleistung > 5000) {
            beschaedigt = true;
        }
    }

    public void beschaedigen() {
        beschaedigt = true;
    }

    public boolean istFahrbereit() {

        if (beschaedigt) {
            return false;
        }

        if (luftdruck < 1.8) {
            return false;
        }

        if (luftdruck > maxLuftdruck) {
            return false;
        }

        return true;
    }

    public double getOptimalerLuftdruck() {

        if (typ.equals("Mountainbike")) {
            return 1.9;
        }

        if (typ.equals("Rennrad")) {
            return 3.5;
        }

        return 2.2;
    }
}