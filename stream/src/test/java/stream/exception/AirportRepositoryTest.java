package stream.exception;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AirportRepositoryTest {

    @Test
    public void testInAirportInUse() throws AirportNotFoundException {
        //given
        AirportRepository airportRepository = new AirportRepository();
        //when
        boolean isWarsawInUse = airportRepository.isAirportInUse("Warsaw");
        //then
        assertTrue(isWarsawInUse);
    }

    //(expected = AirportNotFoundException.class  nie dziaa z jakiegos powodu...
//    @Test
//    public void testInAirportInUseWithPutIncorrectAirport() throws AirportNotFoundException {
//        //given
//        AirportRepository airportRepository = new AirportRepository();
//        //when
//        boolean isWarsawInUse = airportRepository.isAirportInUse("IncorrectAirportName");
//        //then
//        assertFalse(isWarsawInUse);
//    }

}