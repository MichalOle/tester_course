package parametrized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {
    private StringManipulator stringManipulator = new StringManipulator();

    @ParameterizedTest
    @CsvSource(value = {"test,tset", "OtHEr,rehto", "EVent,tneve"})
    public void shouldReverseStringWithLowerCase(String text, String expected) {
        assertEquals(expected, stringManipulator.reverseWithLowerCase(text));
    }

    @ParameterizedTest
    @CsvSource(value = {"tets,4", "Other,5", "Event,5", "null,4"})
    public void shouldReturnNumberOfStringLetters(String text,int length){
        assertEquals(length,stringManipulator.getStringLengthWithoutSpaces(text));
    }

    @ParameterizedTest
    @CsvSource( delimiter =':', value = {"te,st:1", "..OtHEr :0", "E,V,e,n.t:3", "null :0"})
            public void shouldCountNumberOfCommas(String input, int expected){
        assertEquals(expected, stringManipulator.countNumberOfCommas(input));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/stringWithLowerCase.csv",numLinesToSkip = 1)
    public void shouldReverseStringFromCsvFileWithLowerCase(String input, String expected){
        assertEquals(expected,stringManipulator.reverseWithLowerCase(input));
    }
    @ParameterizedTest
    @CsvFileSource( delimiter =':', resources = "/stringWithCommas.csv",numLinesToSkip = 0)
    public void shouldCountNumberOfCommasFromCsvFile(String input, int expected){
        assertEquals(expected, stringManipulator.countNumberOfCommas(input));
    }
}