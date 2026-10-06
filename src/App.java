import java.util.ArrayList;
import java.util.List;

import KlassenAnlegen.Fahrzeug;
import KlassenAnlegen.Wuerfel;

public class App {
    public static void main(String[] args) throws Exception {
        Wuerfel w1 = new Wuerfel();
        w1.werfen();
        System.out.println("Würfel 1: " + w1.anzeigen());
        Wuerfel w2 = new Wuerfel();
        w2.werfen();
        System.out.println("Würfel 2: " + w2.anzeigen());
        Wuerfel w3 = new Wuerfel();
        w3.werfen();
        System.out.println("Würfel 3: " + w3.anzeigen());
        Fahrzeug f1=new Fahrzeug();
        f1.setGewicht(1100);
        
        int n = 10;

        List<Wuerfel> wuerfelListe = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Wuerfel w = new Wuerfel();
            w.werfen();
            wuerfelListe.add(w);

            System.out.println("Würfel " + (i + 1) + ": " + w.anzeigen());         
        }
        Fahrzeug fa1 = new Fahrzeug();
	    Fahrzeug fa2 = new Fahrzeug();
	    fa1.setGewicht(15.0);
	    fa2.setGewicht(20.0);
	    System.out.println ("Fa1="+fa1.toString());
	    System.out.println ("Fa2="+fa2.toString());
	    System.out.println ("Das Durchgeschnittsgewicht beträgt:"+averageWeight(fa1, fa2));
    }
    private static double averageWeight(Fahrzeug f1, Fahrzeug f2) {
        return (f1.getGewicht() + f2.getGewicht()) / 2;
    }
}
