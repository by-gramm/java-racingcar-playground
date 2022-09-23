package racingcar;

import org.junit.jupiter.api.Test;
import racingcar.domain.Car;

import static org.assertj.core.api.Assertions.*;

public class CarTest {

    @Test
    void 자동차_생성() {
        assertThat(Car.of("abc")).isInstanceOf(Car.class);
    }
}
