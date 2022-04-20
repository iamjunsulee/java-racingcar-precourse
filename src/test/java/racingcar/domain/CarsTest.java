package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class CarsTest {
    @Test
    void 자동차_3대가_생성된다() {
        Cars cars = new Cars(Arrays.asList("pobi", "woni", "junsu"));
        assertThat(cars.getCars().size()).isEqualTo(3);
    }
}
