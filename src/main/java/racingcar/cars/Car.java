package racingcar.cars;

import racingcar.Constants;
import racingcar.RandomNumber;

import java.util.Objects;

public class Car implements Comparable<Car> {

    private final CarName name;
    private final CarPosition position;

    private Car(CarName carName) {
        this.name = carName;
        this.position = CarPosition.of(Constants.START_POSITION);
    }

    public static Car of(CarName carName) {
        return new Car(carName);
    }

    public void playOneRound() {
        RandomNumber randomNumber = RandomNumber.of();

        if (randomNumber.isMovingForward()) {
            moveForward();
        }
    }

    public void moveForward() {
        this.position.moveForward();
    }

    public CarName getName() {
        return this.name;
    }

    public CarPosition getPosition() {
        return this.position;
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

    @Override
    public String toString() {
        return String.format("%5s", name.getCarName())
                + " : "
                + "-".repeat(position.getPosition());
    }

    @Override
    public int compareTo(Car car) {
        if (this.getPosition().getPosition() > car.getPosition().getPosition()) {
            return 1;
        }
        return -1;
    }
}
