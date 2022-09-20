package racingcar;

import cars.Car;
import cars.CarName;
import cars.Cars;
import racingcar.view.InputView;

import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {
        InputView inputView = new InputView();
        Cars carList = new Cars();

        String carNames = inputView.getCarNames();
        String[] names = carNames.split(",");

        for (String name : names) {
            CarName carName = CarName.of(name);
            Car car = Car.of(carName);
            carList.addCar(car);
        }

        int playCount = inputView.getPlayCount();
        carList.play(playCount);
    }
}
