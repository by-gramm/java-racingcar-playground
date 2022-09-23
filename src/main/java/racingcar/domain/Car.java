package racingcar.domain;

public class Car {

    private static final int START_POSITION = 0;

    private final CarName carName;
    private final CarPosition position;

    private Car(String carName) {
        this.carName = CarName.of(carName);
        this.position = CarPosition.of(START_POSITION);
    }

    public static Car of(String carName) {
        return new Car(carName);
    }
}
