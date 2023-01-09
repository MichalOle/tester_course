package parametrized_tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class NumberCheckerTest {
    private NumberChecker numberChecker = new NumberChecker();

    @Test
    public void shouldBeDivisibleByThree(){
        boolean result = numberChecker.isDivisibleByThree(3);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {3,12,0,-3})
    public void shouldReturnTrueForNumberDivisibleByThree(int number){
        boolean result = numberChecker.isDivisibleByThree(number);
        assertTrue(result);
    }
    @ParameterizedTest
    @ValueSource(ints = {2,-1})
    public void shouldReturnFalseForNumberDivisibleByThree(int number){
        boolean result = numberChecker.isDivisibleByThree(number);
        assertFalse(result);
    }



}