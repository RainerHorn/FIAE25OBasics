import java.util.ArrayList;
import java.util.List;

import KlassenAnlegen.Fahrzeug;
import KlassenAnlegen.Wuerfel;
import Vererbung.Farbwürfel;
import Assoziationen.Reifen;
import Assoziationen.Becher;
import Assoziationen.Fahrrad;



public class ObjTrainer {
    
public static void main(String[] args) {
ObjTrainer o = new ObjTrainer ();
}

public ObjTrainer(){
    int Summe=0;
    /* 
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
	   
        System.out.println ("Fa1="+fa1);
        System.out.println ("Fa2="+fa2.toString());

        fa1.drive(200);
	    System.out.println ("Fa1 nach Fahrt: "+fa1);

        fa2.drive(2,30);
        System.out.println ("Fa2 nach Fahrt: "+fa2);

	    System.out.println ("Das Durchgeschnittsgewicht beträgt:"+averageWeight(fa1, fa2));


        Reifen vorne = new Reifen(28);
        Reifen hinten = new Reifen(28);

        Fahrrad fahrrad =
                new Fahrrad("Cube", 56, vorne, hinten);

        for (int i = 0; i < 20; i++) {
            fahrrad.getVorderrad().aufpumpen();
            fahrrad.getHinterrad().aufpumpen();
        }

        System.out.println(
                fahrrad.getVorderrad().getLuftdruck()
        );

        System.out.println(
                fahrrad.getHinterrad().getLuftdruck()
        );

        Becher b1 = new Becher(10000000);
        b1.umkippen();
        System.out.println("Becher 1: ");
        for (Wuerfel w : b1.getWuerfel()) {
            //System.out.println(w.anzeigen() + " ");
            Summe += w.getAugenzahl();
        }
        System.out.println("\nSumme der Augenzahlen: " + Summe);
*/
  Farbwürfel fw1 = new Farbwürfel();
  fw1.werfen();
  System.out.println("Farbwürfel 1: " + fw1.getFarbe() + " entspricht Augenzahl: " + fw1.getAugenzahl());
  
}
/*
private  double averageWeight(Fahrzeug f1, Fahrzeug f2) 
{
        return (f1.getGewicht() + f2.getGewicht()) / 2;
}*/
}