package adv.exercise.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightRepository {

    public static Map<String,Flight> getFlightTable(){
        Map<String,Flight> flightRepository = new HashMap<>();
        flightRepository.put("Lot nr 1",new Flight("Amsterdam","Nowy York"));
        flightRepository.put("Lot nr 2",new Flight("Amsterdam","Warszawa"));
        flightRepository.put("Lot nr 3",new Flight("Bruksela","Warszawa"));
        return flightRepository;
        }

    }

