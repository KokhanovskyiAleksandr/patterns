package abstractFactory.cars;

import abstractFactory.cars.marks.CarsMarks;

public class Toyota  implements Car {

    @Override
    public CarsMarks getMark() {
        return CarsMarks.TOYOTA;
    }
}
