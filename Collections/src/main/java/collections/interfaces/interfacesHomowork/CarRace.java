package collections.interfaces.interfacesHomowork;

public class CarRace {
    public static void main(String[] args) {
        Car audi = new Audi();
        Car opel = new Opel();
        Fiat fiat = new Fiat();
        doCar(audi);
        doCar(opel);
        doCar(fiat);

    }
    public static void doCar(Car car){
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println("Aktualna prędkość samochodu wynosi: " + car.getSpeed());
    }
}
