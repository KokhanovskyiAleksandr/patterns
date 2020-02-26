package abstractFactory.cars;

import abstractFactory.cars.marks.CarsMarks;

public class Audi implements Car {

    @Override
    public CarsMarks getMark() {
        return CarsMarks.AUDI;
    }
}
