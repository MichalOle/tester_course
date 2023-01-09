package parametrized_tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class StringValidatorTest {
    private StringValidator stringValidator = new StringValidator();

    @Test
    public void shouldReturnFalseIfTheTextIsNotEmpty() {
        assertFalse(stringValidator.isBlank("text"));
    }

    @Test
    public void shouldReturnFalseIfTheTextIsEmpty() {
        assertTrue(stringValidator.isBlank(""));
    }

    @Test
    public void shouldReturnTrueIfStringHasOnlySpaces() {
        assertTrue(stringValidator.isBlank("     "));
    }

    @Test
    public void shouldReturnFalseIfTheTextIsNull() {
        assertTrue(stringValidator.isBlank(null));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "    "})
    public void shouldReturnTrueIfStringIsEmptyOrHasOnlySpaces(String tekst) {
        assertTrue(stringValidator.isBlank(tekst));
    }

    @ParameterizedTest
//    @NullSource
//    @EmptySource
    @NullAndEmptySource
    public void shouldReturnTrueIfStringIsNull(String text) {
//        System.out.println("|" + text + "|"); -usefull for checking entry data
        assertTrue(stringValidator.isBlank(text));
    }

    @ParameterizedTest
    @ValueSource(strings = {"tekst", "123", "Adas1"})
    public void shouldReturnFalseIfStringIsNotEmpty(String text) {
        assertFalse(stringValidator.isBlank(text));
    }

}