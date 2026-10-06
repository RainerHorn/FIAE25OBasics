package KlassenAnlegen;
public class Wuerfel {
    private int augenzahl;

    public void werfen(){
        augenzahl = (int)(Math.random() * 6) + 1;
    }

    public String anzeigen(){
        return "Augenzahl: " + augenzahl;
    }
}