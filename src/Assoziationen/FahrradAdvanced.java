package Assoziationen;

public class FahrradAdvanced {

    private String marke;
    private int rahmenhoehe;
    private ReifenAdvanced vorne;
    private ReifenAdvanced hinten;
    private int kilometerstand;

    public FahrradAdvanced(String marke,
                   int rahmenhoehe,
                   ReifenAdvanced vorne,
                   ReifenAdvanced hinten) {

        this.marke = marke;
        this.rahmenhoehe = rahmenhoehe;
        this.vorne = vorne;
        this.hinten = hinten;
        this.kilometerstand = 0;
    }

    public String getMarke() {
        return marke;
    }

    public int getRahmenhoehe() {
        return rahmenhoehe;
    }

    public ReifenAdvanced getVorderrad() {
        return vorne;
    }

    public ReifenAdvanced getHinterrad() {
        return hinten;
    }

    public int getKilometerstand() {
        return kilometerstand;
    }

    public boolean istFahrbereit() {
        return vorne.istFahrbereit()
                && hinten.istFahrbereit();
    }

    public boolean fahren(int kilometer) {

        if (kilometer <= 0) {
            return false;
        }

        if (!istFahrbereit()) {
            return false;
        }

        kilometerstand = kilometerstand + kilometer;

        vorne.fahren(kilometer);
        hinten.fahren(kilometer);

        return true;
    }

    public void wechsleVorderrad(ReifenAdvanced neuerReifen) {

        if (neuerReifen == null) {
            return;
        }

        if (neuerReifen.getDurchmesser()
                == vorne.getDurchmesser()) {

            vorne = neuerReifen;
        }
    }

    public void wechsleHinterrad(ReifenAdvanced neuerReifen) {

        if (neuerReifen == null) {
            return;
        }

        if (neuerReifen.getDurchmesser()
                == hinten.getDurchmesser()) {

            hinten = neuerReifen;
        }
    }

    public String sicherheitsPruefung() {

        boolean vorneProblem =
                vorne.istBeschaedigt()
                || vorne.getLuftdruck() < 1.8;

        boolean hintenProblem =
                hinten.istBeschaedigt()
                || hinten.getLuftdruck() < 1.8;

        if (vorneProblem && hintenProblem) {
            return "Beide Reifen müssen gewartet werden.";
        }

        if (vorne.istBeschaedigt()) {
            return "Vorderrad ist beschädigt.";
        }

        if (hinten.istBeschaedigt()) {
            return "Hinterrad ist beschädigt.";
        }

        if (vorne.getLuftdruck() < 1.8) {
            return "Vorderrad hat zu wenig Luft.";
        }

        if (hinten.getLuftdruck() < 1.8) {
            return "Hinterrad hat zu wenig Luft.";
        }

        return "Fahrrad ist fahrbereit.";
    }

    public boolean wartungNoetig() {

        if (vorne.istBeschaedigt()
                || hinten.istBeschaedigt()) {
            return true;
        }

        if (vorne.getLuftdruck() < 1.8
                || hinten.getLuftdruck() < 1.8) {
            return true;
        }

        if (kilometerstand > 0
                && kilometerstand % 1000 == 0) {
            return true;
        }

        return false;
    }

    public double berechneBremsweg(int geschwindigkeit) {

        if (geschwindigkeit <= 0) {
            return 0;
        }

        double tempo = geschwindigkeit / 10.0;

        double bremsweg = tempo * tempo;

        double faktor = 1.0;

        if (vorne.istBeschaedigt()
                || hinten.istBeschaedigt()) {

            faktor = 2.0;

        } else if (vorne.getLuftdruck() < 1.8
                || hinten.getLuftdruck() < 1.8) {

            faktor = 1.4;
        }

        return bremsweg * faktor;
    }
}
    

