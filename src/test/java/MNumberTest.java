import org.testng.Assert;
import org.testng.annotations.Test;

public class MNumberTest {

    @Test
    public void testMultiple7And9_HappyPath() {

        int a = 63;

        String expectedResult = "Good Number";

        String  actualResult = MNumber.mNumber(a);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testMultiple9Only_HappyPath() {

        int a = 99;

        String expectedResult = "Bad Number";

        String  actualResult = MNumber.mNumber(a);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMultiple11Only_HappyPath() {

        int a = 22;

        String expectedResult = "Poor Number";

        String  actualResult = MNumber.mNumber(a);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNoMatch_HappyPath() {

        int a = 213;

        String expectedResult = "-1";

        String  actualResult = MNumber.mNumber(a);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testMultipleNegative_HappyPath() {

        int a = -63;

        String expectedResult = "Good Number";

        String  actualResult = MNumber.mNumber(a);

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testZero_HappyPath() {

        int a = 0;

        String expectedResult = "Good Number";

        String  actualResult = MNumber.mNumber(a);

        Assert.assertEquals(actualResult, expectedResult);
    }

}

