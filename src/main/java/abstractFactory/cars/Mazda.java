package abstractFactory.cars;

import abstractFactory.cars.marks.CarsMarks;

public class Mazda implements Car {

    @Override
    public CarsMarks getMark() {
        return CarsMarks.MAZDA;
    }
}
