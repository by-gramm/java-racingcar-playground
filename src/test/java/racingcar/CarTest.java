package racingcar;

import org.junit.jupiter.api.Test;
import racingcar.domain.Car;
import racingcar.domain.CarPosition;

import static org.assertj.core.api.Assertions.*;

public class CarTest {

    @Test
    void 자동차_생성() {
        assertThat(Car.of("abc")).isInstanceOf(Car.class);
    }

    @Test
    void 자동차_이동() {
        Car car = Car.of("abcd");

        car.move();
        car.move();

        assertThat(car.getPosition())
                .isEqualTo(CarPosition.of(2));
    }

}
