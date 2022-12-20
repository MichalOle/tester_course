package collections.interfacesHomowork;

public class Fiat implements Car {
    private double actualSpeed = 50.00;
    private double increaseSpeed = 10.00;
    private double decreaseSpeed = 25.00;

    public Fiat() {

    }

    public Fiat(int value) {
        increaseSpeed = value;
    }

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
