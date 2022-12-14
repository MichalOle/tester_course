package collections.arrays.homework;

import collections.interfaces.interfacesHomowork.Audi;
import collections.interfaces.interfacesHomowork.Car;
import collections.interfaces.interfacesHomowork.Fiat;
import collections.interfaces.interfacesHomowork.Opel;

import java.util.Random;

public class CarApplication {
    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];
        for (int i = 0; cars.length > i; i++){
            cars[i] = drawCar();
        }
        for (Car car : cars) {

            CarUtils.describeCar(car);
        }
    }

    public static Car drawCar() {
        Random random = new Random();
        if (random.nextInt(3) == 0)
            return new Audi(random.nextInt(100) + 1);
        else if (random.nextInt(3) == 1)
            return new Opel(random.nextInt(100) + 1);
        else
            return new Fiat(random.nextInt(100) + 1);
    }
}

