import org.testng.Assert;
import org.testng.annotations.Test;

public class ManipulationsWithArraysTest {

    //Arrays 2.1.4

    @Test
    public void testGetTheGreaterHalf_EvenArrR_HappyPath() {

        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] expectedResult = {5, 6, 7, 8, 9};

        int[] actualResult = ManipulationsWithArrays.getTheGreaterHalf(a);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetTheGreaterHalf_EvenArrL_HappyPath() {

        int[] a = {9, 9, 9, 9, 4, 5, 6, 7, 8, 9};

        int[] expectedResult = {9, 9, 9, 9, 4};

        int[] actualResult = ManipulationsWithArrays.getTheGreaterHalf(a);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetTheGreaterHalf_OddArrR_HappyPath() {

        int[] a = {1, 1, 2, 3, 4, 5, 6, 7, 8};

        int[] expectedResult = {5, 6, 7, 8};

        int[] actualResult = ManipulationsWithArrays.getTheGreaterHalf(a);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetTheGreaterHalf_OddArrL_HappyPath() {

        int[] a = {10, 1, 9, 3, 4, 1, 2, 3, 8};

        int[] expectedResult = {10, 1, 9, 3};

        int[] actualResult = ManipulationsWithArrays.getTheGreaterHalf(a);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetTheGreaterHalf_OddSmallArrL_HappyPath() {

        int[] a = {10, 1, 9};

        int[] expectedResult = {10};

        int[] actualResult = ManipulationsWithArrays.getTheGreaterHalf(a);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetTheGreaterHalf_EmptyArr_Negative() {

        int[] a = {};

        int[] expectedResult = {};

        int[] actualResult = ManipulationsWithArrays.getTheGreaterHalf(a);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetTheGreaterHalf_NullArr_Negative() {

        int[] a = null;

        int[] expectedResult = {};

        int[] actualResult = ManipulationsWithArrays.getTheGreaterHalf(a);

        Assert.assertEquals(actualResult, expectedResult);
    }

}

