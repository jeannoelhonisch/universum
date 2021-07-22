package backend.model;

import java.util.LinkedList;
import java.util.List;

//Die Raumschifflinie Symbolisiert die Distanz zwischen den Planeten (sie kann man toString eine absdtrakte Veranschaulichung der Enfernungen zwischen den Planeten geben
public class Raumschifflinie {

    public String name = "";
    public List<Planet> planetList = new LinkedList<>();

    public Raumschifflinie(String name, List<Planet> planetList) {
        this.name = name;
        this.planetList = planetList;
    }

    //Wir lassen das Raumschiff von Planet zu Planet fliegen und lassen uns ausgeben wo wir sind
    public void start(Raumschiff raumschiff) {

        for (Planet planet : planetList) {
            raumschiff.fly(planet.coordinates);
            System.out.println("Raumschiff erreicht " + planet.name + " : " + raumschiff.coordinates);
        }
    }

    @Override
    public String toString() {

        String planet = "o";
        String distance = "-";
        String line = "";

        for (int i = 0; i < planetList.size() - 1; i++) {
            line += planet + distance;
            int distanceToNextPlanet = planetList.get(i).getDistance(planetList.get(i + 1));
            for (int a = 0; a < distanceToNextPlanet / 100; a++) {
                line += distance;
            }
        }

        line += planet;

        return line;
    }
}
