package racingcar;

import org.junit.jupiter.api.Test;
import racingcar.domain.CarPosition;

import static org.assertj.core.api.Assertions.*;

public class CarPositionTest {

    @Test
    void 자동차_위치_0이상의_정수() {
        assertThatCode(() -> CarPosition.of(0))
                .doesNotThrowAnyException();

        assertThatThrownBy(() -> CarPosition.of(-1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("자동차 위치는 0 이상의 정수만 가능합니다.");
    }

    @Test
    void 자동차_위치_생성() {
        assertThat(CarPosition.of(3))
                .isInstanceOf(CarPosition.class);
    }
}
