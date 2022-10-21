import org.testng.Assert;
import org.testng.annotations.Test;

public class AreNumbersEqualTest {

    @Test
    public void testPosPos_HappyPath() {

        int a = 89;
        int b = 89;

        int expectedResult = 0;

        int actualResult = AreNumbersEqual.areNumbersEqual(a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNegPos_HappyPath() {

        int a = -89;
        int b = 89;

        int expectedResult = -1;

        int actualResult = AreNumbersEqual.areNumbersEqual(a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testPosNeg_HappyPath() {

        int a = 89;
        int b = -89;

        int expectedResult = 1;

        int actualResult = AreNumbersEqual.areNumbersEqual(a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }
}

