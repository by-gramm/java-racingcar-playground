package racingcar;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racingcar.domain.CarName;

import static org.assertj.core.api.Assertions.*;

public class CarNameTest {

    @Test
    void 자동차명_5자_이하() {
        assertThatCode(() -> CarName.of("abcde"))
                .doesNotThrowAnyException();

        assertThatThrownBy(() -> CarName.of("abcdef"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("자동차명은 1자 이상 5자 이하여야 합니다.");
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "   "})
    void 자동차명_빈_문자열_불가(String name) {
        assertThatThrownBy(() -> CarName.of(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("자동차명은 1자 이상 5자 이하여야 합니다.");
    }

    @ParameterizedTest
    @ValueSource(strings = {"A", " BBB ", " 12345 "})
    void 자동차명_생성(String name) {
        assertThat(CarName.of(name))
                .isInstanceOf(CarName.class);
    }
}
