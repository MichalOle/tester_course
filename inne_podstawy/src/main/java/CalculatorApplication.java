class CaclculatorApplication {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double area = calculator.circleArea(10);
        System.out.printf("Area of the Circle with radius 10 equals: %.2f", area);

        double p = Calculator.PI;
        System.out.printf( "\n" +"The value of a pi constant is equal to : %.2f", p);
    }
}