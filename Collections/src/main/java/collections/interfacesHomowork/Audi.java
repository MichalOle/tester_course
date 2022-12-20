package collections.interfacesHomowork;

public class Audi implements Car {
    private double actualSpeed = 50.00;
    private double increaseSpeed = 15.00;
    private double decreaseSpeed = 25.00;

    public Audi(){

    }
    public Audi(int value){
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
