package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars(List<String> names) {
        cars = new ArrayList<>();
        mappingToCar(names);
    }

    private void mappingToCar(List<String> names) {
        for (String name : names) {
            cars.add(new Car(name));
        }
    }

    public List<Car> getCars() {
        return cars;
    }
}
