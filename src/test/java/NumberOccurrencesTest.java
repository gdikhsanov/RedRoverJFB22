import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberOccurrencesTest {

    @Test
    public void test_HappyPath() {

        int[] a = {3, 2, 5, 3, 22, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1};

        Object[] expectedResult =  {new int[]{1, 4}, new int[]{2, 4}, new int[]{3, 4}, new int[]{4, 3}, new int[]{5, 4}, new int[]{22, 1}};

        Object[] actualResult = NumberOccurrences.numberOccurrences(a);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNegativeNum_HappyPath() {

        int[] a = {3, 2, -5, 3, 1, -5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1};

        Object[] expectedResult =  {new int[]{-5, 2}, new int[]{1, 4}, new int[]{2, 4}, new int[]{3, 4}, new int[]{4, 3}, new int[]{5, 2}};

        Object[] actualResult = NumberOccurrences.numberOccurrences(a);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testEmptyArr_Negative() {

        int[] a = {};

        Object[] expectedResult =  {};

        Object[] actualResult = NumberOccurrences.numberOccurrences(a);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testArrOfOne_HappyPath() {

        int[] a = {3};

        Object[] expectedResult =  {new int[]{3, 1}};

        Object[] actualResult = NumberOccurrences.numberOccurrences(a);

        Assert.assertEquals(actualResult, expectedResult);
    }


}

