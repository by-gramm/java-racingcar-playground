package racingcar;

import racingcar.cars.Car;
import racingcar.cars.CarName;
import racingcar.cars.Cars;
import racingcar.view.InputView;

import java.io.IOException;

public class Application {

    private static final InputView inputView = new InputView();
    private static final Cars carList = new Cars();

    public static void main(String[] args) throws IOException {
        String carNames = inputView.getCarNames();
        addCarsWithNames(carNames);

        int playCount = inputView.getPlayCount();
        carList.play(playCount);
    }

    private static void addCarsWithNames(String carNames) {
        String[] names = carNames.split(",");

        for (String name : names) {
            carList.addCarWithName(name);
        }
    }

}
