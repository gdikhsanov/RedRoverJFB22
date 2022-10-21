import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggerValueTest {

    @Test
    public void testBiggerValue_HappyPath() {
        //AAA
        //arrange
        int a = 3333;
        int b = 9999;

        int expectedResult = 9999;

        //act
        int actualResult = BiggerValue.biggerValue(a, b);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testBiggerValueZero_HappyPath() {
        //AAA
        //arrange
        int a = 3333;
        int b = 0;

        int expectedResult = 3333;

        //act
        int actualResult = BiggerValue.biggerValue(a, b);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testBiggerValueBothZero_HappyPath() {
        //AAA
        //arrange
        int a = 0;
        int b = 0;

        int expectedResult = Integer.MAX_VALUE;

        //act
        int actualResult = BiggerValue.biggerValue(a, b);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
