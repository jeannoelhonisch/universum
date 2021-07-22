package backend.model;

import java.util.Random;

//Unser Planet stellt Symbolisch einen Bahnhof da an dem das Raumschiff anhält
public class Planet {

    public String name = "";
    public int size = 20000;
    public Coordinates coordinates;

    public Planet(String name, int size) {
        this.name = name;
        this.size = size;

        //Wir generieren zufällige Koordinaten von 0 bis 1000
        int x = new Random().nextInt(1000);
        int y = new Random().nextInt(1000);
        int z = new Random().nextInt(1000);

        this.coordinates = new Coordinates(x, y, z);
    }

    // Berechnet die Distanz zwischen zwei Planeten
    public int getDistance(Planet otherPlanet) {

        int x1 = coordinates.x;
        int x2 = otherPlanet.coordinates.x;
        int y1 = coordinates.y;
        int y2 = otherPlanet.coordinates.y;
        int z1 = coordinates.z;
        int z2 = otherPlanet.coordinates.z;
        int distance = (int) Math.sqrt((z2 - z1) * (z2 - z1) + +(z2 - z1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
        return distance;
    }
}
