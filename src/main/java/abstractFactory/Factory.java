package abstractFactory;

import abstractFactory.cars.Audi;
import abstractFactory.cars.Car;
import abstractFactory.cars.Mazda;
import abstractFactory.cars.Toyota;
import abstractFactory.cars.marks.CarsMarks;

public class Factory {
    public Car createCar(CarsMarks carsMarks) {
        switch (carsMarks) {
            case AUDI:
                return new Audi();
            case TOYOTA:
                return new Toyota();
            case MAZDA:
                return new Mazda();
            default:
                throw new IllegalArgumentException("Don't implement mark " + carsMarks);
        }
    }
}
