package adv.exercise.homework;

import java.util.HashMap;
import java.util.Map;

public class FlightApplication {
    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();

        System.out.println(FlightRepository.getFlightTable());
        System.out.println(FlightRepository.getFlightTable().size());
        System.out.println("---------------");
        System.out.println(flightFinder.findFlightsFrom("Amsterdam"));
        System.out.println(flightFinder.findFlightsFrom("Amsterdam").size());
        System.out.println(flightFinder.findFlightsTo("Warszawa"));
        System.out.println(flightFinder.findFlightsTo("Amsterdam"));
        System.out.println(flightFinder.findFlightsTo("Amsterdam").size());


    }
}
