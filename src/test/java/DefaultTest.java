import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DefaultTest {

    @DisplayName("기본 테스트")
    @Test
    void test() {
        // given
        int a = 10;
        // when

        // then
        assertThat(a).isEqualTo(10);
    }
}
