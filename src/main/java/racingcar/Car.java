package racingcar;

import java.util.Objects;

public class Car {

    private CarName name;
    private CarPosition position;

    private Car(CarName carName) {
        this.name = carName;
        this.position = CarPosition.of(Constants.START_POSITION);
    }

    public static Car of(CarName carName) {
        return new Car(carName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
