package racingcar;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import racingcar.domain.RandomNumber;

import static org.assertj.core.api.Assertions.*;

public class RandomNumberTest {

    @ParameterizedTest
    @ValueSource(ints = {-1, 10})
    void 랜덤_수는_0에서_9_사이(int number) {
        assertThatThrownBy(() -> RandomNumber.of(number))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("랜덤 숫자는 0 ~ 9 사이여야 합니다.");
    }

    @ParameterizedTest
    @CsvSource(value = {"3:false", "4:true"}, delimiter = ':')
    void 랜덤_수가_4_이상이면_이동(int number, boolean result) {
        RandomNumber randomNumber = RandomNumber.of(number);
        assertThat(randomNumber.isMoving()).isEqualTo(result);
    }
}
