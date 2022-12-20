package collections.interfacesHomowork;

public class Opel implements Car{
    private double actualSpeed = 50.00;
    private double increaseSpeed = 14.00;
    private double decreaseSpeed = 25.00;


    @Override
    public double getSpeed() {
        return actualSpeed;
    }

    @Override
    public void increaseSpeed() {
        actualSpeed = actualSpeed + increaseSpeed;
    }

    @Override
    public void decreaseSpeed() {
        actualSpeed = actualSpeed - decreaseSpeed;
    }
}
