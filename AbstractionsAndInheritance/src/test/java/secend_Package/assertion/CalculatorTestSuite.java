package secend_Package.assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 6;
        int b = 5;
        int sumResult = calculator.Add(a, b);
        assertEquals(11, sumResult);
        int subResult = calculator.Subtract(a, b);
        assertEquals(1, subResult);
        a = 1;
        b = 0;
        int powResult = calculator.Pow(a, b);
        assertEquals(1, powResult);
    }

}
