package secend_Package.assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeCheckerTestSuite {
    //konstruktor ten pozwala zaoszczedzic kilka linijek kodu. Bo nie trzeba do kazdego testu wprowadzac "checker'a", zeby utworzyc nowy obk.
    private PrimeChecker checker = new PrimeChecker();
    @Test
    public void shouldReturnFalseWhenPassingNotPrimeNumber() {
        boolean result = checker.isPrime(14);
        assertFalse(result);
        checker.incrementCount();
        System.out.println("Count" + checker.getCount());

    }
    @Test
    public void shouldReturnTrueWhenPassingPrimeNumber() {
        boolean result = checker.isPrime(13);
        assertTrue(result);
    }
    @Test
    public void shouldReturnTrueWhenPassingTwo() {
        boolean result = checker.isPrime(2);
        assertTrue(result);
    }
    @Test
    public void shouldReturnFalseWhenPassingZero() {
        boolean result = checker.isPrime(0);
        assertFalse(result);
    }
    @Test
    public void shouldReturnFalseWhenPassingNegativeNumber() {
        boolean result = checker.isPrime(-1);
        assertFalse(result);
    }
    @Test
    public void shouldReturnFalseWhenPassingOne() {
        //tutaj zostawiłem osobny konstruktor. Jak widać również działa. Nie występuje nadpisanie.
        PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(1);
        assertFalse(result);
        checker.incrementCount();
        System.out.println("Count" + checker.getCount());}
}
