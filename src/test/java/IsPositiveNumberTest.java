import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveNumberTest {

    @Test
    public void testPositive_HappyPath() {

        int a = 555;
        boolean expectedResult = true;

        boolean actualResult = IsPositiveNumber.isPositiveNumber(a);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNegative_HappyPath() {

        int a = -555;
        boolean expectedResult = false;

        boolean actualResult = IsPositiveNumber.isPositiveNumber(a);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testZero_HappyPath() {

        int a = 0;
        boolean expectedResult = true;

        boolean actualResult = IsPositiveNumber.isPositiveNumber(a);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
