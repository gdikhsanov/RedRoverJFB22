import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrOddValuesTest {

    @Test
    public void testOddValues_HappyPath() {
        //AAA
        //arrange
        int[] arr = {-45, 590, 234, 985, 12, 68};

        int[] expectedResult = {-45, 985};

        //act
        int[] actualResult = ArrOddValues.arrOddValues(arr);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
