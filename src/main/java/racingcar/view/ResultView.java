package racingcar.view;

import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.domain.Winner;

import java.util.List;

public class ResultView {

    public void showResult(Cars carList) {
        System.out.println("");
        List<Car> cars = carList.getCars();

        cars.forEach(System.out::println);
    }

    public void showWinners(Winner winners) {
        System.out.println("");
        System.out.println(winners + "가 최종 우승했습니다.");
    }
}
