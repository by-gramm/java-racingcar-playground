package racingcar;

import racingcar.domain.Cars;
import racingcar.view.InputView;
import racingcar.view.ResultView;

import java.io.IOException;

public class RacingMain {

    public static void main(String[] args) throws IOException {
        InputView inputView = new InputView();
        ResultView resultView = new ResultView();

        String names = inputView.setupNames();
        Cars carList = Cars.of(names);

        Integer playCount = inputView.setupRound();

        for (int count = 0; count < playCount; count++) {
            carList.playRound();
            resultView.showResult(carList);
        }
    }

}
