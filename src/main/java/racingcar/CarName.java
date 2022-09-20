package racingcar;

import java.util.Objects;

public class CarName {

    private String carName;

    private CarName(String carName) {
        this.carName = carName;
    }

    public static CarName of(String carName) {
        if (carName.length() > 5) {
            throw new IllegalArgumentException("자동차명은 5자리 이상이어야 합니다.");
        }

        return new CarName(carName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarName carName1 = (CarName) o;
        return Objects.equals(carName, carName1.carName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName);
    }
}
