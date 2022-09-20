package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import cars.Car;
import cars.CarName;
import cars.CarPosition;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @ParameterizedTest
    @CsvSource(value = {"0:false", "3:false", "4:true", "9:true"}, delimiter = ':')
    @DisplayName("랜덤 값이 4 이상이면 전진")
    void move_forward_when_4_or_greater(int number, boolean result) {
        RandomNumber randomNumber = RandomNumber.of(number);
        assertEquals(randomNumber.isMovingForward(), result);
    }

    @Test
    @DisplayName("자동차 전진시 위치 1 증가")
    void move_forward() {
        CarName helloName = CarName.of("hello");
        Car helloCar = Car.of(helloName);

        helloCar.moveForward();
        helloCar.moveForward();

        CarPosition expectedPosition = CarPosition.of(2);
        assertEquals(helloCar.getPosition(), expectedPosition);
    }
}
