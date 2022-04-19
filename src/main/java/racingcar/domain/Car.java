package racingcar.domain;

public class Car {
    public static final int MOVE_STANDARD_NUMBER = 4;
    private final CarName name;
    private final CarNumber number;
    private int position;

    public Car(String name, int number) {
        this.name = new CarName(name);
        this.number = new CarNumber(number);
        this.position = 0;
    }

    public void move() {
        if (isGo()) {
            position += 1;
        }
    }

    private boolean isGo() {
        return number.getNumber() >= MOVE_STANDARD_NUMBER;
    }

    public int getPosition() {
        return position;
    }
}
