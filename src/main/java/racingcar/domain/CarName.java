package racingcar.domain;

public class CarName {

    private final String name;

    private CarName(String name) {
        this.name = name;
    }

    public static CarName of(String name) {
        if (!isValid(name)) {
            throw new IllegalArgumentException("자동차명은 1자 이상 5자 이하여야 합니다.");
        }

        return new CarName(name);
    }

    private static boolean isValid(String name) {
        return !name.trim().isEmpty() && name.trim().length() <= 5;
    }

}
