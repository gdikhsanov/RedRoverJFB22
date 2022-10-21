import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {

    @Test
    public void testOddNeg_HappyPath() {
        //AAA
        //arrange
        int number = -345;

        String expectedResult = "Odd";

        //act
        String actualResult = new OddEven().oddEven(number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testOddZero_HappyPath() {
        //AAA
        //arrange
        int number = 0;

        String expectedResult = "Even";

        //act
        String actualResult = new OddEven().oddEven(number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testOdd_HappyPath() {
        //AAA
        //arrange
        int number = 222222;

        String expectedResult = "Even";

        //act
        String actualResult = new OddEven().oddEven(number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
