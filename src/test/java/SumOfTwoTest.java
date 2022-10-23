import org.testng.Assert;
import org.testng.annotations.Test;

public class SumOfTwoTest {

    @Test
    public void test_HappyPath() {

        int[] a = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int n = 12;

        Object[] expectedResult =  {new int[]{3, 9}, new int[]{7, 5}};

        Object[] actualResult = SumOfTwo.sumOfTwo(a, n);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testRepeat_HappyPath() {

        int[] a = {3, 3, 3, 3, 9, 9, 9, 9, 12};
        int n = 12;

        Object[] expectedResult =  {new int[]{3, 9}};

        Object[] actualResult = SumOfTwo.sumOfTwo(a, n);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRepeatNegative_HappyPath() {

        int[] a = {3, 3, 3, -3, 9, -9, 9, 9, 12};
        int n = -12;

        Object[] expectedResult =  {new int[]{-3, -9}};

        Object[] actualResult = SumOfTwo.sumOfTwo(a, n);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNoMatches_HappyPath() {

        int[] a = {3, 3, 3, 3, 9, 9, 9, 9, 12};
        int n = 125;

        Object[] expectedResult =  {}; // Ноль элементов в массиве объектов

        Object[] actualResult = SumOfTwo.sumOfTwo(a, n);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testArrOfOne_Negative() {

        int[] a = {1}; //Нет пар элементов
        int n = 1;

        Object[] expectedResult =  {}; // Ноль элементов в массиве объектов

        Object[] actualResult = SumOfTwo.sumOfTwo(a, n);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testEmptyArr_Negative() {

        int[] a = {};
        int n = 0;

        Object[] expectedResult =  {}; // Ноль элементов в массиве объектов

        Object[] actualResult = SumOfTwo.sumOfTwo(a, n);

        Assert.assertEquals(actualResult, expectedResult);
    }
}

