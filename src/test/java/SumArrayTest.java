import  org.testng.Assert;
import org.testng.annotations.Test;

public class SumArrayTest {

    @Test
    public void testSumPositive_HappyPath() {
        //AAA
        //arrange
        int[] arr = {0, 1, 2, 3, 4, 5};

        int expectedResult = 15;

        //act
        int actualResult = SumArray.sumArray(arr);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSumNegative_HappyPath() {
        //AAA
        //arrange
        int[] arr = {-7, -3};

        int expectedResult = -10;

        //act
        int actualResult = SumArray.sumArray(arr);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSumEmpty_HappyPath() {
        //AAA
        //arrange
        int[] arr = new int[0];

        int expectedResult = 0;

        //act
        int actualResult = SumArray.sumArray(arr);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
