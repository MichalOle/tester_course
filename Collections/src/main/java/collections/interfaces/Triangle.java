package collections.interfaces;

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
}
