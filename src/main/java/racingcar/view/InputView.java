package racingcar.view;

import racingcar.utils.PatternChecker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class InputView {

    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String setupNames() throws IOException {
        System.out.println("경주할 자동차 이름을 입력하세요 (이름은 쉼표(,)를 기준으로 구분되며, 최대 5자리입니다.)");
        return reader.readLine();
    }

    public Integer setupRound() throws IOException {
        System.out.println("시도할 횟수는 몇 회인가요?");

        String count = reader.readLine();

        if (!PatternChecker.isNumeric(count)) {
            throw new InputMismatchException("횟수는 숫자만 입력 가능합니다.");
        }

        return Integer.parseInt(reader.readLine());
    }

}
