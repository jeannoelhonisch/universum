package backend.model;

//Das Raumschiff symbolisiert einen Zug der von Bahnhof zu Bahnhof fährt
public class Raumschiff {

    //Wir haben dem Raumschiff Eingenschaften gegeben
    public String name = "";
    public int speed = 10;
    public Coordinates coordinates = new Coordinates(0, 0, 0);

    public Raumschiff(String name,int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void fly(Coordinates coordinates) {
        this.coordinates = new Coordinates(coordinates.x, coordinates.y, coordinates.z);
    }
}
