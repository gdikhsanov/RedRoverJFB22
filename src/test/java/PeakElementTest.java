import org.testng.Assert;
import org.testng.annotations.Test;

public class PeakElementTest {

    @Test
    public void testPositiveNum_HappyPath() {

        int[] a = {3, 2, 7, 5, 1, 9, 23, 1};

        int[] expectedResult =  {3, 7, 23};

        int[]  actualResult = PeakElement.peakElement(a);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNegativeNum_HappyPath() {

        int[] a = {3, 2, -7, 5, 1, 9, 23, 1};

        int[] expectedResult =  {3, 5, 23};

        int[]  actualResult = PeakElement.peakElement(a);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testEmptyArr_Negative() {

        int[] a = {};

        int[] expectedResult =  {};

        int[]  actualResult = PeakElement.peakElement(a);

        Assert.assertEquals(actualResult, expectedResult);
    }



}

