package collections.lists;

import collections.interfaces.Circle;
import collections.interfaces.Shape;
import collections.interfaces.Square;
import collections.interfaces.Triangle;

import java.util.LinkedList;
import java.util.List;

public class GeneralShapesListApplication {
    public static void main(String[] args) {
        List<Shape> shapes = new LinkedList<>();
        shapes.add(new Square(5));
        shapes.add(new Circle(4));
        shapes.add(new Triangle(2.02,4.93,6.88));
        Square sqr1 = new Square(8);
        shapes.add(sqr1);
        System.out.println(shapes.size());
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        System.out.println(" ");
        //removing objects from collection by indexes and variables
        shapes.remove(2);
        shapes.remove(sqr1);
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        //removing  object  from collection by using object from beyond of collection "sqr2"
        Square sqr2 = new Square(5);
        shapes.remove(sqr2);
        // OR shapes.remove(new Square(value-sameLikeInList));
        System.out.println(" ");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
