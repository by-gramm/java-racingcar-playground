package racingcar.utils;

public class PatternChecker {

    private static final String ONLY_DIGIT_REGEX = "[0-9]+";

    public static boolean isNumeric(String inputString) {
        return inputString.matches(ONLY_DIGIT_REGEX);
    }
}
