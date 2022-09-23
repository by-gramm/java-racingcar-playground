package racingcar.domain;

public class RandomNumber {

    private final int number;

    private RandomNumber(int number) {
        this.number = number;
    }

    public static RandomNumber of(int number) {
        if (number < 0 || number > 9) {
            throw new IllegalArgumentException("랜덤 숫자는 0 ~ 9 사이여야 합니다.");
        }

        return new RandomNumber(number);
    }

    public boolean isMoving() {
        return this.number >= 4;
    }
}
