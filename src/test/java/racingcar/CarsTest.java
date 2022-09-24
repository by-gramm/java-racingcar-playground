package racingcar;

import org.junit.jupiter.api.Test;
import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.domain.Winner;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class CarsTest {

    @Test
    void 자동차_목록_생성() {
        Cars cars = Cars.of("aaa,bbb,ccc");
        assertThat(cars).isInstanceOf(Cars.class);
    }

    @Test
    void 자동차명_중복_금지() {
        assertThatThrownBy(() -> Cars.of("aaa,bbb,aaa"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("자동차명은 중복될 수 없습니다.");
    }

    @Test
    void 우승자_목록_구하기() {
        Car car1 = Car.of("g-out", 3);
        Car car2 = Car.of("us", 1);
        Car car3 = Car.of("nope", 3);

        List<Car> carList = Arrays.asList(car1, car2, car3);
        Winner winners = Winner.getResult(carList);

        assertThat(winners).isEqualTo(Winner.of("g-out, nope"));
    }
}
