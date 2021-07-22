package backend.model;

// Wir haben eine Koordinatenklasse erstellt damit wir Planeten und Raumschiffen Koordinaten zuweisen können
public class Coordinates {

    int x;
    int y;
    int z;

    public Coordinates(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Wenn das Objekt in Text umgewandelt werden soll (z.B. mit System.out.println)
    @Override
    public String toString() {
        return "Coordinates{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
