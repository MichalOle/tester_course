package adv.exercise.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightFinder  {
    Map<String, Flight> flights = FlightRepository.getFlightTable();
    public Map<String, Flight> findFlightsFrom(String departure) {
        Map<String, Flight> selectedFlights = new HashMap<>();
        for (Map.Entry<String, Flight> stringFlightEntry : flights.entrySet()) {
//            int index = 0;
//            int index2 = 0;
//            index2++;
            if (stringFlightEntry.getValue().getDeparture().equals(departure)) {
//                index++;
                selectedFlights.put(stringFlightEntry.getKey(), stringFlightEntry.getValue());
            }
//            else if (index == 0 && flights.size() <= index2)
//                System.out.println("Nie ma takich lotow.");
        }
        return selectedFlights;
    }

    public Map<String, Flight> findFlightsTo(String arrival) {

        Map<String, Flight> selectedFlights = new HashMap<>();
        for (Map.Entry<String, Flight> stringFlightEntry : flights.entrySet()) {

//            int index = 0;
//            int index2 = 0;
//            ++index2;
            if (stringFlightEntry.getValue().getArrival().equals(arrival)) {
//                index++;
                selectedFlights.put(stringFlightEntry.getKey(), stringFlightEntry.getValue());
//            } else if (index == 0 && flights.size() <= index2) {
//                System.out.println("Nie ma takiego lotu.");
            }
        }
        return selectedFlights;
    }

}
