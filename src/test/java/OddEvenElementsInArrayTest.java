import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.Utils;

public class OddEvenElementsInArrayTest {

    //Arrays 2.1.2

    @Test
    public void testCountOddEvenValuesInArray_HappyPath() {

        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] expectedResult = {5, 5};

        int[] actualResult = OddEvenElementsInArray.countOddEvenValuesInArray(a);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testCountOddEvenValuesInArray_NoOdd_HappyPath() {

        int[] a = {0, 2, 4, 6, 8};

        int[] expectedResult = {5, 0};

        int[] actualResult = OddEvenElementsInArray.countOddEvenValuesInArray(a);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountOddEvenValuesInArray_Zero_HappyPath() {

        int[] a = {0};

        int[] expectedResult = {1, 0};

        int[] actualResult = OddEvenElementsInArray.countOddEvenValuesInArray(a);

        Assert.assertEquals(actualResult, expectedResult);
    }



    @Test
    public void testCountOddEvenValuesInArray_EmptyArr_Negative() {

        int[] a = {};

        int[] expectedResult = {};

        int[] actualResult = OddEvenElementsInArray.countOddEvenValuesInArray(a);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //Arrays 2.1.3

    @Test
    public void testCreateOddEvenArray_HappyPath() {


//        int from = 1;
//        int to = 5;
//        int length = 10;


        int[] arr = {4, 4, 4, 2, 1, 2, 5, 3, 4, 2}/*Utils.randomArrayInt(from, to, length)*/;

        int[][] expectedResult = {{4, 4, 4, 2, 2, 4, 2}, {1, 5, 3}};

        int[][] actualResult = OddEvenElementsInArray.createOddEvenArray(arr /*from, to, length*/);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCreateOddEvenArray_SmallArr_HappyPath() {


//        int from = 1;
//        int to = 5;
//        int length = 10;

        int[] arr = {4}/*Utils.randomArrayInt(from, to, length)*/;

        int[][] expectedResult = {{4}, {}};

        int[][] actualResult = OddEvenElementsInArray.createOddEvenArray(arr /*from, to, length*/);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCreateOddEvenArray_ZeroArr_Negative() {


//        int from = 1;
//        int to = 5;
//        int length = 10;

        int[] arr = {}/*Utils.randomArrayInt(from, to, length)*/;

        int[][] expectedResult = {};

        int[][] actualResult = OddEvenElementsInArray.createOddEvenArray(arr /*from, to, length*/);

        Assert.assertEquals(actualResult, expectedResult);
    }





}

