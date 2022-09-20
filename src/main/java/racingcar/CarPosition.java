package racingcar;

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
}
