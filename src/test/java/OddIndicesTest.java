import org.testng.Assert;
import org.testng.annotations.Test;

public class OddIndicesTest {

    @Test
    public void testOddIndices_HappyPath() {
        //AAA
        //arrange
        int[] arr = {-45, 590, 234, 985, 12, 68};

        int[] expectedResult = {590, 985, 68};

        //act
        int[] actualResult = OddIndices.oddIndices(arr);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testOddIndicesEmptyArr_HappyPath() {
        //AAA
        //arrange
        int[] arr = new int[0];

        int[] expectedResult = {};

        //act
        int[] actualResult = OddIndices.oddIndices(arr);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
