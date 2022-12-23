package adv.exercise.homework;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTest {
    //given
    public static FlightFinder constructorOfFlightFinder = new FlightFinder();

    @Test
    public void insertIncorrectValueToMethodFindFlightFrom(){
        //given
        //when
        int result = constructorOfFlightFinder.findFlightsFrom("123").size();
      result += constructorOfFlightFinder.findFlightsFrom("Warszawa").size();
      result += constructorOfFlightFinder.findFlightsFrom("").size();
       // then
        System.out.println(result);
        assertEquals(0,result);

    }
    @Test
    public void insertCorrectValueToMethodFindFlightFrom(){
        //given
        //when
        constructorOfFlightFinder.findFlightsFrom("Amsterdam");
        //then
        assertEquals(2,constructorOfFlightFinder.findFlightsFrom("Amsterdam").size());
    }

    @Test
    public void insertIncorrectValueToMethodFindFlightTo() {
        //given
        //when
        int result = constructorOfFlightFinder.findFlightsTo("123").size();
        result += constructorOfFlightFinder.findFlightsTo("Amsterdam").size();
        result += constructorOfFlightFinder.findFlightsTo("").size();
        // then
        System.out.println(result);
        assertEquals(0, result);
    }
    @Test
    public void insertCorrectValueToMethodFindFlightTo() {
        //given
        //when
        int result = constructorOfFlightFinder.findFlightsTo("Warszawa").size();

        // then
        System.out.println(result);
        assertEquals(2, result);
    }
}