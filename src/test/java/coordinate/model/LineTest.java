package coordinate.model;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LineTest {
        @Test
        void 라인_생성_중복_검사() {
                assertThrows(IllegalArgumentException.class, () -> {
                        Point p1 = new Point(0, 0);
                        Point p2 = new Point(0, 0);
                        new Line(Arrays.asList(p1, p2));
                });
        }

        @Test
        void 라인_길이_추출() {
                Point p1 = new Point(1, 1);
                Point p2 = new Point(3, 1);
                assertThat(new Line(Arrays.asList(p1, p2)).getScore()).isEqualTo(2.0, offset(0.00099));
        }
}
