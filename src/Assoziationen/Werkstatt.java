package Assoziationen;

public class Werkstatt {

    public void warten(FahrradAdvanced fahrrad) {

        ReifenAdvanced vorne = fahrrad.getVorderrad();
        ReifenAdvanced hinten = fahrrad.getHinterrad();

        warteReifen(vorne, "Vorderrad");
        warteReifen(hinten, "Hinterrad");
    }

    private void warteReifen(ReifenAdvanced reifen, String name) {

        if (reifen.istBeschaedigt()) {

            System.out.println(
                    name
                    + " ist beschädigt und muss ersetzt werden."
            );

            return;
        }

        double ziel = reifen.getOptimalerLuftdruck();

        if (reifen.getLuftdruck() < ziel) {

            double fehlend =
                    ziel - reifen.getLuftdruck();

            reifen.aufpumpen(fehlend);

            System.out.println(
                    name
                    + " wurde auf "
                    + ziel
                    + " bar aufgepumpt."
            );

        } else {

            System.out.println(
                    name + " benötigt keine Wartung."
            );
        }
    }
}