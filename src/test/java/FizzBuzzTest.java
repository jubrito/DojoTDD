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

    @Test
    void whenANumberThatIsNotMultipleOfThreeOrFiveIsEnteredShouldReturnTheSameNumber() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 7;

        String result = fizzBuzz.calc(number);

        assertEquals(result, "7");
    }

    @Test
    void whenANumberThatIsMultipleOfThreeIsEnteredShouldReturnFizz(){

        FizzBuzz fizzBuzz = new FizzBuzz();

        int number = 3;
        String result = fizzBuzz.calc(number);

        assertEquals(result, "Fizz");
    }

    @Test
    void whenANumberThatIsMultipleOfFiveIsEnteredShouldReturnBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        int number = 5;
        String result = fizzBuzz.calc(number);

        assertEquals(result, "Buzz");
    }
    @Test
    void whenANumberThatIsMultipleOfFiveAndThreeIsEnteredShouldReturnFizzBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        int number = 15;
        String result = fizzBuzz.calc(number);

        assertEquals(result, "FizzBuzz");
    }
}