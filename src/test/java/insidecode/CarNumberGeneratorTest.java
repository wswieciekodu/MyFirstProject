package insidecode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarNumberGeneratorTest {

    // This is easy unit test for function method and no dependencies

    // Ideal situation is to test all public methods
    // We test all private methods, by testing public methods
    // Easiest code to test is functional-like
    // To make code easy testable inject all dependencies

    // how test should looks like?
    // with given input (//given)
    // our function (//when - call testing function)
    // should return ( //then - here whe check if return value is as we expect using asserts)

    CarNumberGenerator carNumberGenerator = new CarNumberGenerator();

    @Test
    void shouldGenerateNumberInStateAtTheBeginningAndSixDigitsFormat() {
        // given
        String state = "MAL";
        // when
        String generatedNumber = carNumberGenerator.generateNumber(state);
        // then
        assertEquals("MAL 000001", generatedNumber);
    }
}