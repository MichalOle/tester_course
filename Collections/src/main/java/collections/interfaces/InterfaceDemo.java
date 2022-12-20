package collections.interfaces;

public class InterfaceDemo {
    public static void main(String[] args) {
        Square square = new Square(5.00);
        Circle circle = new Circle(10);
        Triangle triangle = new Triangle(2,5,6);
        System.out.println(square.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(triangle.getArea());
        System.out.println(" ");
        showShapeDetails(square);
        System.out.println(" ");
        showShapeDetails(circle);
        System.out.println(" ");
        showShapeDetails(triangle);
    }
//    private static void showSquareDetails(Square square){
//        System.out.println(square.getArea());
//        System.out.println(square.getPerimeter());
//    }
//    private static void  showTriangleDetails(Triangle triangle){
//        System.out.println(triangle.getArea());
//        System.out.println(triangle.getPerimeter());
//    }
//
//    public static void showCircleDetails(Circle circle) {
//        System.out.println(circle.getArea());
//        System.out.println(circle.getPerimeter());
//    }
    private static void showShapeDetails(Shape shape){
        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());
    }
}
