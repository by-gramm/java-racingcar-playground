package racingcar.domain;

public class RacingGame {
    private final Cars carList;

    private RacingGame(Cars cars) {
        this.carList = cars;
    }

    public static RacingGame of(Cars cars) {
        return new RacingGame(cars);
    }
}
