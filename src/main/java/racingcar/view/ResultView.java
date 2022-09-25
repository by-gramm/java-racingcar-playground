package racingcar.view;

import racingcar.domain.Car;
import racingcar.domain.Cars;

import java.util.List;

public class ResultView {

    public void showResult(Cars carList) {
        System.out.println("");
        List<Car> cars = carList.getCars();

        cars.forEach(System.out::println);
    }
}
