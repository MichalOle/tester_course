package collections.arrays;

import collections.interfaces.Circle;
import collections.interfaces.Shape;
import collections.interfaces.Square;
import collections.interfaces.Triangle;

import java.util.Random;

public class ShapeApplication {
    public static void main(String[] args) {
        Random random = new Random();
        Shape[] shapeList = new Shape[random.nextInt(20)+1];
        for (int i = 0; shapeList.length > i; i++) {
            shapeList[i] = drawShape();
        }

        for (Shape shape : shapeList) {
            ShapeUtils.dispalyShapeInfo(shape);
        }

    }

    private static Shape drawShape() {
        Random random = new Random();
        int drawRandom = random.nextInt(3);
        double a = random.nextDouble() * 100 + 1;
        double b = random.nextDouble() * 100 + 1;
        double c = random.nextDouble() * 100 + 1;

        if (drawRandom == 0)
            return new Circle(a);
        else if (drawRandom == 1)
            return new Square(a);
        else
            return new Triangle(a, b, c);

    }
}
