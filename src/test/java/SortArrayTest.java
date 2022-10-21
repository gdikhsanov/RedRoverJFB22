import org.testng.Assert;
import org.testng.annotations.Test;

public class SortArrayTest {

    @Test
    public void testPositiveNum_HappyPath() {

        int[] a = {4, 3, 7, 12, 5, 2, 9, 4, 12};

        int[] expectedResult =  {2, 3, 4, 4, 5, 7, 9, 12, 12};

        int[]  actualResult = SortArray.sortArray(a);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testNegativeNum_HappyPath() {

        int[] a = {4, 3, 7, -12, 5, 2, 9, 4, 12};

        int[] expectedResult =  {-12, 2, 3, 4, 4, 5, 7, 9, 12};

        int[]  actualResult = SortArray.sortArray(a);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testEmptyArr_HappyPath() {

        int[] a = {};

        int[] expectedResult =  {};

        int[]  actualResult = SortArray.sortArray(a);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSmallArr_HappyPath() {

        int[] a = {2};

        int[] expectedResult =  {2};

        int[]  actualResult = SortArray.sortArray(a);

        Assert.assertEquals(actualResult, expectedResult);
    }


}

