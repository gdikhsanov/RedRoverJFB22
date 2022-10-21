import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeOnTheRightTest {

    @Test
    public void test_HappyPath() {

        int[] a = {4, -3, 7, -12, 5, -2, 9, 4, 12};

        int[] expectedResult =  {4, 7, 5, 9, 4, 12, -3, -12, -2};

        int[] actualResult = NegativeOnTheRight.negativeOnTheRight(a);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testEmptyArr_HappyPath() {

        int[] a = {};

        int[] expectedResult =  {};

        int[] actualResult = NegativeOnTheRight.negativeOnTheRight(a);

        Assert.assertEquals(actualResult, expectedResult);
    }



}

