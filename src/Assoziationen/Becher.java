package Assoziationen;

import KlassenAnlegen.Wuerfel;

public class Becher {
    private Wuerfel wuerfel[];

    public Becher(int anzahl) {
        wuerfel = new Wuerfel[anzahl];
        for (int i = 0; i < anzahl; i++) {
            wuerfel[i]=new Wuerfel();
        }
    }
    
    public Wuerfel[] getWuerfel() {
        return wuerfel;
    }

    public void umkippen() {
        for (Wuerfel w : wuerfel) {
            w.werfen();
        }
    }
}