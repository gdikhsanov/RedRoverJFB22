import org.testng.Assert;
import org.testng.annotations.Test;

public class KthLargestTest {

    @Test
    public void testPositiveNum_HappyPath() {

        int[] a = {4, 3, 7, 13, 5, 2, 9, 4, 12};
        int b = 3;

        int expectedResult =  9;

        int actualResult = KthLargest.kthLargest(a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testPositiveNumEqual_HappyPath() {

        int[] a = {4, 3, 7, 13, 12, 2, 9, 4, 12};
        int b = 3;

        int expectedResult =  12;

        int actualResult = KthLargest.kthLargest(a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testPositiveNumZeroInd_HappyPath() {

        int[] a = {4, 3, 7, 13, 12, 2, 9, 4, 12};
        int b = 0;

        int expectedResult =  0;

        int actualResult = KthLargest.kthLargest(a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testEmptyArr_HappyPath() {

        int[] a = {};
        int b = 0;

        int expectedResult =  0;

        int actualResult = KthLargest.kthLargest(a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }


}

