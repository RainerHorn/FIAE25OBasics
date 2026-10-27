package Vererbung;
import KlassenAnlegen.Wuerfel;

public class Farbwürfel extends Wuerfel {
    private String[] farbe = {"rot", "blau", "grün", "gelb", "orange", "violett"}; 
    public Farbwürfel() {
        super();
    }
    public String getFarbe() {
        return farbe[getAugenzahl() - 1];
    }      
}
