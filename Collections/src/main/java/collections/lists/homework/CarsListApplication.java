package collections.lists.homework;


import collections.arrays.homework.CarUtils;
import collections.interfaces.interfacesHomowork.Audi;
import collections.interfaces.interfacesHomowork.Car;
import collections.interfaces.interfacesHomowork.Fiat;
import collections.interfaces.interfacesHomowork.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> carsList = new ArrayList<>();
        carsList.add(new Audi());
        carsList.add(new Audi(75));
        carsList.add(new Opel(99));
        carsList.add(new Fiat(45));
        for (Car car : carsList) {
            CarUtils.describeCar(car);
        }

        carsList.remove(0);
        carsList.remove(new Opel(99));
        System.out.println(" ");
        for (Car car : carsList) {
            CarUtils.describeCar(car);
        }
        System.out.println("Na liście obecnie znajduje się : " + carsList.size() + " samochody/ów");
    }
}
