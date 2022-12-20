package secend_Package.assertion;

import org.junit.jupiter.api.Test;

public class AppTestSuite {
    @Test
    public void testapp() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = -8;
        int sum = calculator.Add(a, b);
        int subtract = calculator.Subtract(a, b);
        int pow = calculator.Pow(2, 1);
        boolean score = ResultChecker.assertEquals(-2, sum);
        if (score) {
            System.out.println("Wynik jest zgodny z oczekiwaniami");
        } else {
            System.out.println("Wynik jest błędny. Metoda sum działa poprawnie");
        }
        score = ResultChecker.assertEquals(14, subtract);

        if (score) {
            System.out.println("Wynik jest zgodny z oczekiwaniami. Metoda sub działą poprawnie.");
        } else {
            System.out.println("Wynik jest błędny. Metoda subtract działa poprawnie");
        }
        score = ResultChecker.assertEquals(3, pow);

        if (score) {
            System.out.println("Wynik jest zgodny z oczekiwaniami. Metoda pow działą poprawnie.");
        } else {
            System.out.println("Wynik jest błędny. Metoda pow działa poprawnie");
        }
    }
}
