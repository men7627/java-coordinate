package coordinate.model;

import coordinate.model.framework.Shape;

import java.util.List;

public class Square extends Shape {
        public Square(List<Point> points) {
                super(points);
                checkTwistSquare(points);
        }

        private void checkTwistSquare(List<Point> points) {
                if (!points.get(FIRST_POINT).isEqualX(points.get(SECOND_POINT)) ||
                    !points.get(FIRST_POINT).isEqualY(points.get(THIRD_POINT)) ||
                    !points.get(FOURTH_POINT).isEqualX(points.get(THIRD_POINT)) ||
                    !points.get(FOURTH_POINT).isEqualY(points.get(SECOND_POINT))) {
                        throw new IllegalArgumentException("올바른 사각형이 아닙니다");
                }
        }

        @Override
        public double getScore() {
                return (points.getDistance(FIRST_POINT, SECOND_POINT))
                    * points.getDistance(FIRST_POINT, THIRD_POINT);
        }
}
