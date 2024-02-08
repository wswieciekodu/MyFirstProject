package unittest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    // This is easy unit test for function method and no dependencies

    // Ideal situation is to test all public methods
    // We test all private methods, by testing public methods
    // Easiest code to test is functional-like
    // To make code easy testable inject all dependencies

    // how test should looks like?
    // with given input (//given)
    // our function (//when - call testing function)
    // should return ( //then - here whe check if return value is as we expect using asserts)

    // tested object instance
    Calculator calculator = new Calculator();

    @Test
    public void sumMethodShouldReturn5WhenInputIs2And3() {
        // given
        int a = 2;
        int b = 3;
        // when
        int sum = calculator.sum(a, b);
        // then
        assertEquals(5, sum);
    }

    @Test
    public void subtractMethodShouldReturn10WhenInputIs12And2() {
        // given

        // when

        // then
    }

}