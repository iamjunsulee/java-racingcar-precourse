package racingcar.domain;

public class RacingRounds {
    private int rounds;

    public RacingRounds(String input) {
        if (isNotNumberFormat(input)) {
            throw new IllegalArgumentException("[ERROR] 시도 횟수는 숫자여야 한다.");
        }
        if (isEqualZero(input)) {
            throw new IllegalArgumentException("[ERROR] 시도 횟수는 0보다 커야 한다.");
        }
        rounds = Integer.parseInt(input);
    }

    private boolean isEqualZero(String input) {
        return Integer.parseInt(input) == 0;
    }

    private boolean isNotNumberFormat(String input) {
        return !input.matches("^[0-9]*$");
    }

    public void endCurrentRound() {
        rounds -= 1;
    }

    public boolean isEndGame() {
        return rounds == 0;
    }
}
