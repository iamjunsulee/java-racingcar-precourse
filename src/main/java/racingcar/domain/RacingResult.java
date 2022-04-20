package racingcar.domain;

import java.util.List;

public class RacingResult {
    private final Cars cars;

    public RacingResult(Cars cars) {
        this.cars = cars;
    }

    public String getWinnersName() {
        StringBuilder message = new StringBuilder("최종 우승자: ");
        List<Car> winners = cars.getWinners();
        for (Car winner : winners) {
            message.append(winner.getName()).append(", ");
        }
        return message.substring(0, message.length() - 2);
    }
}
