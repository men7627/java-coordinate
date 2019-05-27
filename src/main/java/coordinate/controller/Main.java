package coordinate.controller;

import coordinate.model.*;
import coordinate.model.framework.IShape;
import coordinate.model.framework.IShapeCreator;
import coordinate.model.framework.PointsCreator;
import coordinate.view.InputView;
import coordinate.view.OutputView;

public class Main {
        public static void main(String[] args) {
                IShape shape = makeIShape();
                OutputView.printCoordinate(shape);
                OutputView.printResult(shape);
        }

        private static IShape makeIShape() {
                try {
                        Points points = PointsCreator.create(InputView.inputPoints());
                        return IShapeCreator.create(points);
                } catch (IllegalArgumentException e) {
                        System.err.println(e.getMessage());
                        return makeIShape();
                }
        }
}
