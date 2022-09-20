package racingcar.view;

import cars.Cars;

import java.util.List;
import java.util.stream.Collectors;

public class ResultView {

    public void showRoundResult(Cars cars) {
        cars.getCars().forEach(System.out::println);
        System.out.println();
    }

    public void showBeforeStart() {
        System.out.println("\n실행 결과");
    }

    public void showWinners(Cars cars) {
        List<String> carNames = cars.getWinners()
                .stream()
                .map(car -> car.getName().getCarName())
                .collect(Collectors.toList());

        System.out.print(String.join(",", carNames));
        System.out.print("가 최종 우승했습니다.");
    }
}
