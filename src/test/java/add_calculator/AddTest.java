package add_calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class AddTest {

    private final AddCalculator addCalculator = new AddCalculator();

    @Test
    @DisplayName("빈 문자열이나 null 값을 입력하는 경우 0 리턴")
    void emptyStringOrNull_return_0() {
        int actual = addCalculator.splitAndSum("");
        assertEquals(actual, 0);

        actual = addCalculator.splitAndSum(null);
        assertEquals(actual, 0);
    }

    @ParameterizedTest
    @CsvSource(value = {"1,2,3>6", "3:4>7", "10:20,30>60"}, delimiter = '>')
    @DisplayName("기본 구분자(쉼표 및 콤마)로 구분된 각 수의 합 리턴")
    void addNumbers_쉼표구분자(String stringNumbers, int result) {
        int actual = addCalculator.splitAndSum(stringNumbers);
        assertEquals(actual, result);
    }

    @Test
    @DisplayName("커스텀 구분자로 구분된 각 수의 합 리턴")
    void customDelimeter() {
        int actual = addCalculator.splitAndSum("//;\n1;2;3");
        assertEquals(actual, 6);

        actual = addCalculator.splitAndSum("//@\n20@30");
        assertEquals(actual, 50);
    }

    @ParameterizedTest
    @ValueSource(strings = {"3,5,A", "1:2:ㄱ", "6,7:!"})
    @DisplayName("숫자 이외의 값을 입력한 경우 예외 처리")
    void nonNumericInput(String inputString) {
        Assertions.assertThrows(RuntimeException.class, () -> {
            addCalculator.splitAndSum(inputString);
        });
    }

    @Test
    @DisplayName("음수를 입력한 경우 예외 처리")
    void negativeNumberInput() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            addCalculator.splitAndSum("10:-20:30");
        });
    }

}
