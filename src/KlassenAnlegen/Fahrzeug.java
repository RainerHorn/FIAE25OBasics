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
		if (g>0)
			gewicht =g;
        

    }	
	public long getLaufleistung() {
		return laufleistung;
	}
	public String toString() {
		return "Laufleistung="+getLaufleistung()+" Gewicht="+getGewicht();
    }
	public void drive(int km) {
		if (km>0)
		  laufleistung += km;
	}
	public void drive(int dauer,int geschwindigkeit) {
		drive(dauer*geschwindigkeit);
	}
}