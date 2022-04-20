package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class CarsTest {
    @Test
    void 자동차_3대가_생성되면_위치값은_0이므로_최대값도_0이다() {
        Cars cars = new Cars(Arrays.asList("pobi", "woni", "junsu"));
        assertThat(cars.calculateMaxPosition()).isEqualTo(0);
    }
}
