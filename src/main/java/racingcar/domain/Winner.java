package racingcar.domain;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Winner {

    private final String winner;

    private Winner(String winner) {
        this.winner = winner;
    }

    public static Winner of(String winner) {
        return new Winner(winner);
    }

    public static Winner getResult(List<Car> carList) {

        int maxDistance = carList.stream()
                .mapToInt(car -> car.getPosition().getPosition())
                .max()
                .getAsInt();

        final CarPosition maxPosition = CarPosition.of(maxDistance);

        List<String> winnerNames = carList
                .stream()
                .filter(car -> car.isMax(maxPosition))
                .map(car -> car.getCarName().getName())
                .collect(Collectors.toList());

        String winners = String.join(", ", winnerNames);

        return new Winner(winners);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Winner winner1 = (Winner) o;
        return Objects.equals(winner, winner1.winner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(winner);
    }
}
