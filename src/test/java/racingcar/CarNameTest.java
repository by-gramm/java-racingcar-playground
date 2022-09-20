package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import cars.Car;
import cars.CarName;
import cars.Cars;

import static org.junit.jupiter.api.Assertions.*;

public class CarNameTest {

    @Test
    @DisplayName("자동차 이름은 최대 5자")
    void carName_length_5_or_less() {
        assertDoesNotThrow(() -> {
            CarName carName = CarName.of("abcde");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            CarName carName = CarName.of("abcdef");
        });
    }

    @Test
    @DisplayName("자동차 이름은 중복 불가")
    void carName_not_duplicate() {
        Cars carList = new Cars();

        assertThrows(IllegalArgumentException.class, () -> {
            CarName carName1 = CarName.of("abcd");
            Car car1 = Car.of(carName1);
            carList.addCar(car1);

            CarName carName2 = CarName.of("abcd");
            Car car2 = Car.of(carName2);
            carList.addCar(car2);
        });
    }
}
