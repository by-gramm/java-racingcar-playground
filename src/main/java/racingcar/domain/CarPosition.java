package racingcar.domain;

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
}
