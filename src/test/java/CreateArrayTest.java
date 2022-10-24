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

    //Arrays 3.1

    @Test
    public void testGetPhoneNumberAndCountry_USA_HappyPath() {

        int[] arr = new int[]{1, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7};

        String[] expectedResult = {"1(800)123-45-67", "United States of America"};

        String[] actualResult = CreateArray.getPhoneNumberAndCountry(arr);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetPhoneNumberAndCountry_Canada_HappyPath() {

        int[] arr = new int[]{1, 8, 0, 7, 1, 2, 3, 4, 5, 6, 7};

        String[] expectedResult = {"1(807)123-45-67", "Canada"};

        String[] actualResult = CreateArray.getPhoneNumberAndCountry(arr);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetPhoneNumberAndCountry_Kazakhstan_HappyPath() {

        int[] arr = new int[]{7, 7, 7, 7, 1, 2, 3, 4, 5, 6, 7};

        String[] expectedResult = {"7(777)123-45-67", "Kazakhstan"};

        String[] actualResult = CreateArray.getPhoneNumberAndCountry(arr);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetPhoneNumberAndCountry_Russia_HappyPath() {

        int[] arr = new int[]{7, 9, 1, 3, 9, 2, 3, 4, 5, 6, 7};

        String[] expectedResult = {"7(913)923-45-67", "Russia"};

        String[] actualResult = CreateArray.getPhoneNumberAndCountry(arr);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetPhoneNumberAndCountry_UnitedKingdom12Digits_HappyPath() {

        int[] arr = new int[]{4, 4, 7, 4, 2, 9, 6, 6, 3, 7, 7, 3};

        String[] expectedResult = {"4(474)296-63-773", "United Kingdom"};

        String[] actualResult = CreateArray.getPhoneNumberAndCountry(arr);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetPhoneNumberAndCountry_Satellite5DigitPrefix17DigitsNumber_HappyPath() {

        int[] arr = new int[]{8, 8, 2, 1, 6, 9, 6, 6, 3, 7, 7, 3, 6, 3, 7, 7, 3};

        String[] expectedResult = {"8(821)696-63-77363773", "Thuraya (Mobile Satellite service)"};

        String[] actualResult = CreateArray.getPhoneNumberAndCountry(arr);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetPhoneNumberAndCountry_OutOfBoundsDigit_Negative() {

        int[] arr = new int[]{99, 9, 1, 3, 9, 2, 3, 4, 5, 6, 7};

        String[] expectedResult = {"Error"};

        String[] actualResult = CreateArray.getPhoneNumberAndCountry(arr);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetPhoneNumberAndCountry_OutOfBoundsLength18_Negative() {

        int[] arr = new int[]{8, 8, 2, 1, 6, 9, 6, 6, 3, 7, 7, 3, 6, 3, 7, 7, 3, 9};

        String[] expectedResult = {"Error"};

        String[] actualResult = CreateArray.getPhoneNumberAndCountry(arr);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetPhoneNumberAndCountry_SmallArr_Negative() {

        int[] arr = new int[]{9, 7};

        String[] expectedResult = {"Error"};

        String[] actualResult = CreateArray.getPhoneNumberAndCountry(arr);

        Assert.assertEquals(actualResult, expectedResult);
    }

}

