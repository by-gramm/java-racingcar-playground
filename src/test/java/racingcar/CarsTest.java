package racingcar;

import org.junit.jupiter.api.Test;
import racingcar.domain.Cars;

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
}
