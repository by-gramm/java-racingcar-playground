package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import cars.Car;
import cars.CarName;
import cars.Cars;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CarsTest {

    Cars carList = new Cars();

    @Test
    @DisplayName("가장 멀리 간 자동차 목록 구하기")
    void get_winners() {
        CarName name1 = CarName.of("kim");
        Car car1 = Car.of(name1);

        CarName name2 = CarName.of("lee");
        Car car2 = Car.of(name2);

        CarName name3 = CarName.of("choi");
        Car car3 = Car.of(name3);

        carList.addCar(car1);
        carList.addCar(car2);
        carList.addCar(car3);

        car1.moveForward();
        car3.moveForward();

        List<Car> winners = carList.getWinners();

        assertTrue(winners.contains(car1));
        assertFalse(winners.contains(car2));
        assertTrue(winners.contains(car3));
    }
}
