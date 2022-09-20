package racingcar;

import java.util.*;

public class Cars {

    // 삽입 순서를 유지하기 위해 HashSet 대신 LinkedHashSet 사용
    private LinkedHashSet<Car> cars = new LinkedHashSet<>();

    public void addCar(Car car) {
        if (cars.contains(car)) {
            throw new IllegalArgumentException("자동차명은 중복될 수 없습니다.");
        }
        cars.add(car);
    }
}
