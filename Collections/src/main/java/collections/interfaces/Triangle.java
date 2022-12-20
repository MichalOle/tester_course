package collections.interfaces;

import java.util.Objects;

public class Triangle implements Shape {
    private double side;
    private double height;
    private double longSide;

    public Triangle(double side, double height, double longSide) {
        this.height = height;
        this.longSide = longSide;
        this.side = side;
    }

    @Override
    public double getArea() {
        return 0.5 * (side * longSide);
    }

    @Override
    public double getPerimeter() {
        return side + longSide + height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side=" + side +
                ", height=" + height +
                ", longSide=" + longSide +
                ", area=" + getArea() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.side, side) == 0 && Double.compare(triangle.height, height) == 0 && Double.compare(triangle.longSide, longSide) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side, height, longSide);
    }
}
