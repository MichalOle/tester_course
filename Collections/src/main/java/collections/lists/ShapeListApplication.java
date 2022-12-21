package collections.lists;

import collections.interfaces.Circle;
import collections.interfaces.Square;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ShapeListApplication {
    public static void main(String[] args) {
        List<Square> shapes = new ArrayList<>();
        Square sqr1 = new Square(10);
        Square sqr2 = new Square(3);
        shapes.add(sqr1);
        shapes.add(sqr2);
        shapes.add(0,new Square(5));
        System.out.println(shapes.size());
        System.out.println(shapes.get(0));
        System.out.println(" ");
        for (Square shape : shapes) {
            if(shape.getArea()>20)
               System.out.println(shape);
        }
        List<Circle> crl = new LinkedList<>();
        crl.add(new Circle(5));
        for (Circle circle : crl) {
            System.out.println(circle);
        }
    }
}
