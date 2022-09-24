package racingcar.domain;

import java.util.*;
import java.util.stream.Collectors;

public class Cars {

    private static final String DEFAULT_SPLITERATOR = ",";

    private final List<Car> carList = new ArrayList<>();

    private Cars(List<String> names) {
        names.forEach(name -> carList.add(Car.of(name)));
    }

    public static Cars of(String nameString) {
        List<String> names = toList(nameString);

        if (!isUnique(names)) {
            throw new IllegalArgumentException("자동차명은 중복될 수 없습니다.");
        }

        return new Cars(names);
    }

    private static List<String> toList(String nameString) {
        return Arrays
                .stream(nameString.split(DEFAULT_SPLITERATOR))
                .collect(Collectors.toList());
    }

    private static boolean isUnique(List<String> names) {
        return names.stream().allMatch(new HashSet<>()::add);
    }
}
