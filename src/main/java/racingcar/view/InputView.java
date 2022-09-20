package racingcar.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {

    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String getCarNames() throws IOException {
        System.out.println("경주할 자동차 이름을 입력하세요 (이름은 쉼표(,)를 기준으로 구분되며, 최대 5자리입니다.)");
        return reader.readLine();
    }

    public int getPlayCount() throws IOException {
        System.out.println("시도할 회수는 몇 회인가요?");
        String stringCount = reader.readLine();
        return Integer.parseInt(stringCount);
    }
}
