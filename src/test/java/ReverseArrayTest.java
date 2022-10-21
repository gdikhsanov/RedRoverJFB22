import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseArrayTest {

    @Test
    public void testPositiveNum_HappyPath() {

        int[] a = {2, 7, 3, 10};

        int[] expectedResult =  {10, 3, 7, 2};

        int[]  actualResult = ReverseArray.reverseArray(a);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testEmptyArr_Negative() {

        int[] a = {};

        int[] expectedResult =  {};

        int[]  actualResult = ReverseArray.reverseArray(a);

        Assert.assertEquals(actualResult, expectedResult);
    }



}

