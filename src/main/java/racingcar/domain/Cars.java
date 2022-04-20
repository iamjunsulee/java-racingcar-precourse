package racingcar.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

    public void move(MovingStrategy strategy) {
        for (Car car : cars) {
            car.move(strategy);
        }
    }

    public int calculateMaxPosition() {
        return Collections.max(cars, Comparator.comparingInt(Car::getPosition)).getPosition();
    }

    public List<Car> getWinners() {
        List<Car> winners = new ArrayList<>();
        for (Car car : cars) {
            findWinners(winners, car);
        }
        return winners;
    }

    private void findWinners(List<Car> winners, Car car) {
        if (isWinner(car)) {
            winners.add(car);
        }
    }

    private boolean isWinner(Car car) {
        return car.getPosition() == calculateMaxPosition();
    }
}
