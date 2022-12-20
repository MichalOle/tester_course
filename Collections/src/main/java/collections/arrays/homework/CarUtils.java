package collections.arrays.homework;


import collections.interfaces.interfacesHomowork.Audi;
import collections.interfaces.interfacesHomowork.Car;
import collections.interfaces.interfacesHomowork.Fiat;
import collections.interfaces.interfacesHomowork.Opel;

public class CarUtils {
    public static void describeCar(Car car) {
            System.out.println("<--------------------------->");
            System.out.println("Car kind: " + getCarName(car));
            System.out.println("Car Speed: " + car.getSpeed());
        }


    private static String getCarName(Car car) {
        if (car instanceof Audi)
            return "Audi";
        else if (car instanceof Fiat)
            return "Fiat";
        else if (car instanceof Opel)
            return "Opel";
        else
            return "Nieznana marka.";
    }
}
