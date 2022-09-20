package cars;

import racingcar.view.ResultView;

import java.util.*;
import static java.util.stream.Collectors.*;

public class Cars {

    private final ResultView resultView = new ResultView();

    // 삽입 순서를 유지하기 위해 HashSet 대신 LinkedHashSet 사용
    private final LinkedHashSet<Car> cars = new LinkedHashSet<>();

    public void addCar(Car car) {
        if (cars.contains(car)) {
            throw new IllegalArgumentException("자동차명은 중복될 수 없습니다.");
        }
        cars.add(car);
    }

    public void play(int playCount) {
        resultView.showBeforeStart();

        for (int i = 0; i < playCount; i++) {
            playOneRound();
            resultView.showRoundResult(this);
        }

        resultView.showWinners(this);
    }

    private void playOneRound() {
        cars.forEach(Car::playOneRound);
    }

    public List<Car> getWinners() {
        CarPosition maxPosition = getMaxPosition();

        return cars.stream()
                .filter(car -> car.getPosition().equals(maxPosition))
                .collect(toList());
    }

    private CarPosition getMaxPosition() {
        Car maxPositionCar = Collections.max(cars);
        return maxPositionCar.getPosition();
    }

    public LinkedHashSet<Car> getCars() {
        return cars;
    }
}
