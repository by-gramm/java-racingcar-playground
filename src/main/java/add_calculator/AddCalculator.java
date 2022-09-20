package add_calculator;


import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static add_calculator.Constants.*;

public class AddCalculator {

    public AddCalculator() {
    }

    public int splitAndSum(String stringNumbers) {
        if (isNullOrEmpty(stringNumbers)) {
            return 0;
        }

        String[] numbers = splitNumbers(stringNumbers);

        return getSum(numbers);
    }

    private String[] splitNumbers(String inputString) {
        Matcher matcher = Pattern.compile(CUSTOM_DELIMITER_PATTERN).matcher(inputString);

        if (matcher.find()) {
            String customDelimiter = matcher.group(1);
            return matcher.group(2).split(customDelimiter);
        }

        return inputString.split(DEFAULT_DELIMITER);
    }

    private int getSum(String[] numbers) {
        return Arrays.stream(numbers)
                .peek(AddCalculator::isAllDigit)   // forEach is terminal <==> peek is non-terminal
                .mapToInt(Integer::parseInt)
                .sum();
    }

    private boolean isNullOrEmpty(String inputString) {
        return (inputString == null || inputString.length() == 0);
    }

    private static void isAllDigit(String str) {
        if (!str.matches(IS_ALL_DIGIT_REGEX)) {
            throw new RuntimeException("0 이상의 숫자만 입력할 수 있습니다.");
        }
    }

}
