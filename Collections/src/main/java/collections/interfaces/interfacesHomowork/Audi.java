package collections.interfaces.interfacesHomowork;

import java.util.Objects;

public class Audi implements Car {
    private double actualSpeed = 50.00;
    private double increaseSpeed = 15.00;
    private double decreaseSpeed = 25.00;

    public Audi(){

    }
    public Audi(int value){
        increaseSpeed = value;
        increaseSpeed();
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Audi audi = (Audi) o;
        return Double.compare(audi.actualSpeed, actualSpeed) == 0 && Double.compare(audi.increaseSpeed, increaseSpeed) == 0 && Double.compare(audi.decreaseSpeed, decreaseSpeed) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(actualSpeed, increaseSpeed, decreaseSpeed);
    }
}
