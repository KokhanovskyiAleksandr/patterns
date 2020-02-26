package builder;

class Builder {
    private House house;

    public Builder buildHouse() {
        house = new House();
        return this;
    }

    public Builder withWindow(Object window) {
        house.setWindow(window);
        return this;
    }

    public Builder withRoof(Object roof) {
        house.setRoof(roof);
        return this;
    }

    public Builder withWall(Object wall) {
        house.setWall(wall);
        return this;
    }

    public Builder withDoor(Object door) {
        house.setDoor(door);
        return this;
    }

    public House getHouse() {
        return house;
    }
}

public class House {
    private Object window;
    private Object roof;
    private Object wall;
    private Object door;

    public void setWindow(Object window) {
        this.window = window;
    }

    public void setRoof(Object roof) {
        this.roof = roof;
    }

    public void setWall(Object wall) {
        this.wall = wall;
    }

    public void setDoor(Object door) {
        this.door = door;
    }
}