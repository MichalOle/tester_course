package collections.interfaces.interfacesHomowork;

import java.util.Objects;

public class Fiat implements Car {
    private double actualSpeed = 50.00;
    private double increaseSpeed = 10.00;
    private double decreaseSpeed = 25.00;

    public Fiat() {

    }

    public Fiat(int value) {
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
        Fiat fiat = (Fiat) o;
        return Double.compare(fiat.actualSpeed, actualSpeed) == 0 && Double.compare(fiat.increaseSpeed, increaseSpeed) == 0 && Double.compare(fiat.decreaseSpeed, decreaseSpeed) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(actualSpeed, increaseSpeed, decreaseSpeed);
    }
}
