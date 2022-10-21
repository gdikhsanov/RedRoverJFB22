import org.testng.Assert;
import org.testng.annotations.Test;

public class MinMaxAveTest {

    @Test
    public void testPositiveInd_HappyPath() {
        //AAA
        //arrange
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int a = 2;
        int b = 6;

        int[] expectedResult = {3, 7, 5};

        //act
        int[] actualResult = MinMaxAve.minMaxAve(arr, a, b);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testNegativeInd_HappyPath() {
        //AAA
        //arrange
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int a = -2;
        int b = 6;

        int[] expectedResult = {};

        //act
        int[] actualResult = MinMaxAve.minMaxAve(arr, a, b);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testArrOfTwo_HappyPath() {
        //AAA
        //arrange
        int[] arr = new int[]{1, -6};
        int a = 1;
        int b = 0;

        int[] expectedResult = {-6, 1, -2}; //выводим нчало, конец, среднее

        //act
        int[] actualResult = MinMaxAve.minMaxAve(arr, a, b);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testArrOfOne_HappyPath() {
        //AAA
        //arrange
        int[] arr = new int[]{2};
        int a = 0;
        int b = 0;

        int[] expectedResult = {2, 2, 2};

        //act
        int[] actualResult = MinMaxAve.minMaxAve(arr, a, b);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testEqualsInd_HappyPath() {
        //AAA
        //arrange
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int a = 2;
        int b = 2;

        int[] expectedResult = {3, 3, 3}; //     (3 + 3) / 1 = 3, - всего одна итерация ИЛИ добавить условие ошибки при равных индексах

        //act
        int[] actualResult = MinMaxAve.minMaxAve(arr, a, b);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testEmptyArr_Negative() {
        //AAA
        //arrange
        int[] arr = new int[]{};
        int a = 0;
        int b = 0;

        int[] expectedResult = {};

        //act
        int[] actualResult = MinMaxAve.minMaxAve(arr, a, b);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testOutOfBoundsInd_Negative() {
        //AAA
        //arrange
        int[] arr = new int[]{1, 2, 3};
        int a = 12;
        int b = 0;

        int[] expectedResult = {};

        //act
        int[] actualResult = MinMaxAve.minMaxAve(arr, a, b);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
