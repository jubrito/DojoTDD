import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Triple A (AAA)
 *
 * Arrange
 * Act
 * Assert
 *
 */

class FizzBuzzTest {

    final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void whenMultipleOfThreeReturnFizz(){
        String verifiedFizzBuzz = fizzBuzz.verifyFizzBuzz(3);

        assertEquals("Fizz", verifiedFizzBuzz);
    }

    @Test
    void whenMultipleOfFiveReturnBuzz() {
        String verifiedFizzBuzz = fizzBuzz.verifyFizzBuzz(5);

        assertEquals("Buzz", verifiedFizzBuzz);
    }

    @Test
    void whenMultipleOfThreeAndFiveReturnFizzBuzz() {
        String verifiedFizzBuzz = fizzBuzz.verifyFizzBuzz(15);

        assertEquals("FizzBuzz", verifiedFizzBuzz);
    }

    @Test
    void whenNotMultipleOfThreeAndFiveShouldReturnInputNumber(){
        String verifiedFizzBuzz = fizzBuzz.verifyFizzBuzz(2);

        assertEquals("2", verifiedFizzBuzz);
    }

}