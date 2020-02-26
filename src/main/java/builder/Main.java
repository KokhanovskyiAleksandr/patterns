package builder;

public class Main {
    public static void main(String[] args) {
        House house = new Builder().buildHouse()
                .withWall(new Object())
                .withDoor(new Object())
                .withRoof(new Object())
                .withWindow(new Object())
                .getHouse();
    }
}
