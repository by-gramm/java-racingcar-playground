package racingcar.domain;

import java.util.Objects;

public class CarPosition {

    private final int position;

    private CarPosition(int position) {
        this.position = position;
    }

    public static CarPosition of(int position) {
        if (position < 0) {
            throw new IllegalArgumentException("자동차 위치는 0 이상의 정수만 가능합니다.");
        }

        return new CarPosition(position);
    }

    public CarPosition moveForward() {
        return CarPosition.of(position + 1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarPosition that = (CarPosition) o;
        return position == that.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }
}
