package parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {
    private UserValidator userValidator = new UserValidator();

@ParameterizedTest
@ValueSource(strings = {"username","Adrian1993","Antek_93","Antek...--_"})
public void shouldReturnGivenStrings(String string){
    boolean result = userValidator.validateUsername(string);
    assertTrue(result);
}
    @ParameterizedTest
    @ValueSource(strings = {"username@","Adrian1993%","An"})
    public void shouldNotReturnGivenStrings(String string){
        boolean result = userValidator.validateUsername(string);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"username@op.pl","Username1993@gmail.com","username_93@polska.wp","username--_@op.pl","username.1@op.pl"})
    public void shouldReturnGivenExampleStrings(String string){
        boolean result = userValidator.validateEmail(string);
        assertTrue(result);
    }
    @ParameterizedTest
    @ValueSource(strings = {"username.@op.pl","username..1@op.pl","username_1@op.wppolska","username@op","username.1@op..pl","username.@op.1","username@op.op.op"})
    public void shouldNotReturnGivenExampleStrings(String string){
        boolean result = userValidator.validateEmail(string);
        assertFalse(result);
    }
}