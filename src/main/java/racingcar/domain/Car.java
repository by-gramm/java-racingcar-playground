package racingcar.domain;

import java.util.Objects;

public class Car implements Comparable {

    private static final int DEFAULT_POSITION = 0;

    private final CarName carName;
    private CarPosition position;

    private Car(String carName, int position) {
        this.carName = CarName.of(carName);
        this.position = CarPosition.of(position);
    }

    public static Car of(String carName) {
        return new Car(carName, DEFAULT_POSITION);
    }

    public static Car of(String carName, int position) {
        return new Car(carName, position);
    }

    public void move() {
        position = position.moveForward();
    }

    public boolean isMax(CarPosition maxPosition) {
        return this.position.equals(maxPosition);
    }

    public CarName getCarName() {
        return this.carName;
    }

    public CarPosition getPosition() {
        return this.position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(carName, car.carName) && Objects.equals(position, car.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName, position);
    }

    @Override
    public int compareTo(Object o) {
        Car car = (Car) o;

        return this.position.compareTo(car.getPosition());
    }
}
