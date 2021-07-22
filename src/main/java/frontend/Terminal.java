package frontend;

import backend.model.Planet;
import backend.model.Raumschiff;
import backend.model.Raumschifflinie;

import java.util.LinkedList;
import java.util.List;

public class Terminal {

    public static void main(String[] args) {
        //Wir erstellen Planeten
        Planet uranus = new Planet("Uranus", 25000);
        Planet jupiter = new Planet("Jupiter", 69000);
        Planet mars = new Planet("Mars", 3400);
        Planet saturn = new Planet("Saturn", 58000);
        //Wir fügen die Planeten einer Liste zu die wir der Linie übergeben
        List<Planet> h1PlanetList = new LinkedList<>();
        h1PlanetList.add(uranus);
        h1PlanetList.add(jupiter);
        h1PlanetList.add(mars);
        h1PlanetList.add(saturn);
        //Wir haben ein neues Raumschiff erstellt mit dem Namen wing und lassen es die Linie entlang fliegen
        Raumschiff xwing = new Raumschiff("X-Wing", 50);
        Raumschifflinie h1 = new Raumschifflinie("h1", h1PlanetList);
        System.out.println(h1);
        h1.start(xwing);

    }

}
