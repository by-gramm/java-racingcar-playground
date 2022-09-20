package racingcar;

public class RandomNumber {

    private int number;

    private RandomNumber(int number) {
        this.number = number;
    }

    public static RandomNumber of() {
        int number = getRandomNumber();
        return new RandomNumber(number);
    }

    public static RandomNumber of(int number) {
        if (number < 0 || number > 9) {
            throw new IllegalArgumentException("0 ~ 9 사이의 수만 가능합니다.");
        }

        return new RandomNumber(number);
    }

    private static int getRandomNumber() {
        return (int) (Math.random() * 10);
    }

    public boolean isMovingForward() {
        return number >= 4;
    }
}
