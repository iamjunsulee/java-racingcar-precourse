package racingcar.domain;

public class Car {
    private final CarName name;
    private int position;

    public Car(String name) {
        this.name = new CarName(name);
        this.position = 0;
    }

    public void move(MovingStrategy strategy) {
        if (strategy.isMove()) {
            position += 1;
        }
    }

    public boolean isSamePosition(Car car) {
        return this.position == car.position;
    }

    public boolean isBiggerThan(Car car) {
        return this.position > car.position;
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name.getName();
    }
}
