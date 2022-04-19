package racingcar.domain;

public class CarName {
    public static final int MAX_NAME_LENGTH = 5;
    private final String name;

    public CarName(String name) {
        if (isFiveDigitsOrLess(name)) {
            throw new IllegalArgumentException("[ERROR] 이름은 5자리 이하만 가능합니다.");
        }
        this.name = name;
    }

    private boolean isFiveDigitsOrLess(String name) {
        return name.length() > MAX_NAME_LENGTH;
    }

    public String getName() {
        return name;
    }
}
