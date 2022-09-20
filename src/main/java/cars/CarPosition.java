package cars;

import java.util.Objects;

import static racingcar.Constants.*;

public class CarPosition {

    private int position;

    public CarPosition(int position) {
        this.position = position;
    }

    public static CarPosition of(int position) {
        if (position < START_POSITION) {
            throw new IllegalArgumentException("자동차 위치는 0보다 크거나 같아야 합니다.");
        }
        return new CarPosition(position);
    }

    public void moveForward() {
        this.position++;
    }

    public int getPosition() {
        return position;
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
