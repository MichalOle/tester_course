package collections.interfaces;

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
}
