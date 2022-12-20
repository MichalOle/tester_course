package collections.interfaces;

import java.util.Objects;

public class Square implements Shape{
    private double side;
    public Square(double side){
        this.side = side;
    }
    public double getArea(){
        return Math.pow(side,2);
    }

    public double getPerimeter(){
        return 4*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area=" + getArea() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.side, side) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side);
    }
}
