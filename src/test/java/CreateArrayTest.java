import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateArrayTest {

    //Arrays 1.1.4

    @Test
    public void testCreateArrayFromText_HappyPath() {

        String s = "It was an apple pie";

        String[] expectedResult = new String[]{"It", "was", "an", "apple", "pie"};

        String[] actualResult = CreateArray.createArrayFromText(s);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCreateArrayFromTextEmptyString_Negative() {

        String s = "";

        String[] expectedResult = new String[]{""};

        String[] actualResult = CreateArray.createArrayFromText(s);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCreateArrayFromTextNullString_Negative() {

        String s = null;

        String[] expectedResult = new String[]{};

        String[] actualResult = CreateArray.createArrayFromText(s);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //Arrays 2.1.1

    @Test
    public void testCreateIntArrayFromText_HappyPath() {

        String s = "3 4 1 8 10 12.3";

        int[] expectedResult = {3, 4, 1, 8, 10, 12};

        int[] actualResult = CreateArray.createIntArrayFromText(s);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCreateIntArrayFromTextEmptyString_Negative() {

        String s = "";

        int[] expectedResult = {};

        int[] actualResult = CreateArray.createIntArrayFromText(s);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //Arrays 2.1.5

    @Test
    public void testmultiplesOf_HappyPath() {

        int a = 2;

        int[] expectedResult = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        int[] actualResult = CreateArray.multiplesOf(a);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testmultiplesOf_OutOfBounds_Negative() {

        int a = 234;

        int[] expectedResult = {};

        int[] actualResult = CreateArray.multiplesOf(a);

        Assert.assertEquals(actualResult, expectedResult);
    }


}

