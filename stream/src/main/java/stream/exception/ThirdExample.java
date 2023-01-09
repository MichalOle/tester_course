package stream.exception;

public class ThirdExample {
    public static void main(String[] args) {
        AirportRepository airportrepositiry = new AirportRepository();

        try {
            boolean isVinnaInUse = airportrepositiry.isAirportInUse("Vienna");
            System.out.println("Vienna status: " + isVinnaInUse);
        } catch (AirportNotFoundException e) {
            System.out.println("Sorry this city is out of service");
        }
        finally {
            System.out.println("Thanks for using ours airlains");
        }


    }
}
