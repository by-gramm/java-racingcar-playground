package racingcar;

import racingcar.domain.Cars;
import racingcar.domain.RacingGame;
import racingcar.view.InputView;

import java.io.IOException;

public class RacingMain {

    public static void main(String[] args) throws IOException {
        InputView inputView = new InputView();

        String names = inputView.setupNames();
        RacingGame game = RacingGame.of(Cars.of(names));

        Integer round = inputView.setupRound();
    }
    
}
