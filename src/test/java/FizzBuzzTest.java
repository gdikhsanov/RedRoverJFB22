import org.testng.Assert;
import org.testng.annotations.Test;

public class FizzBuzzTest {
    //1. Positve testing Happy path
    // if start <= end
    // return rray

    @Test
    public void testStartLessThenEnd_HappyPath() {
        //AAA
        //arrage
        int start = 1;
        int end = 20;
        String[] expectedResult = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13",
                "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz" };

        //act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testStartLessThenEndNegative_HappyPath() {
        //AAA
        //arrage
        int start = -20;
        int end = -1;
        String[] expectedResult = {"Buzz", "-19", "Fizz", "-17", "-16", "FizzBuzz", "-14", "-13", "Fizz",
                "-11", "Buzz", "Fizz", "-8", "-7", "Fizz", "Buzz", "-4", "Fizz", "-2", "-1" };

        //act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testStartEqualsEnd_HappyPath() {
        //AAA
        //arrage
        int start = 1;
        int end = 1;
        String[] expectedResult = {"1" };

        //act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


    //2. Negative testing
    // start > end
    // return new String[0];
    @Test
    public void testStartGreaterTenEnd_Negative() {
        //AAA
        //arrage
        int start = 20;
        int end = 1;
        String[] expectedResult = {};

        //act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);


    }
}
