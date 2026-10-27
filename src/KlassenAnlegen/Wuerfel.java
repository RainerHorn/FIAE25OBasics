package KlassenAnlegen;
public class Wuerfel {
    protected int augenzahl;

    public Wuerfel() {
        werfen();
    }
    public void werfen(){
        augenzahl = (int)(Math.random() * 6) + 1;
    }
    public String anzeigen(){
        return "Augenzahl: " + augenzahl;
    }
    public int getAugenzahl() {
        return augenzahl;
    }
}