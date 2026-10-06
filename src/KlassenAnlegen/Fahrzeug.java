package KlassenAnlegen;

/**
 * Fahrzeug
 */
public class Fahrzeug {
	private double gewicht;
	private long laufleistung;
	
	public double getGewicht() {
		return gewicht;
	}
	
	public void setGewicht(double g) {
		gewicht =g;
        
    }	
	public long getLaufleistung() {
		return laufleistung;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return "Laufleistung="+getLaufleistung()+" Gewicht="+getGewicht();
    }
}