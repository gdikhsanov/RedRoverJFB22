import org.testng.Assert;
import org.testng.annotations.Test;

public class IntersectionTest {

    @Test
    public void testPositiveNum_HappyPath() {

        int[] a = {1, 2, 2, 4, 5, 89};
        int[] b = {8, 9, 4, 2};

        int[] expectedResult = {2, 4};

        int[]  actualResult = Intersection.intersection(a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNegativeNum_HappyPath() {

        int[] a = {1, 2, 4, 5, 8, 9};
        int[] b =  {8, 9, -4, -2};

        int[] expectedResult = {8, 9};

        int[]  actualResult = Intersection.intersection(a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNoMatch_HappyPath() {

        int[] a = {1, 2, 4, 5, 89};
        int[] b =  {8, 9, 45};

        int[] expectedResult = {};

        int[]  actualResult = Intersection.intersection(a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testEmptyArr_Negative() {

        int[] a = {};
        int[] b =  {};

        int[] expectedResult = {};

        int[]  actualResult = Intersection.intersection(a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }


}

