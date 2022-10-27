import org.testng.Assert;
import org.testng.annotations.Test;

import javax.sound.midi.Soundbank;

public class StringMethodsTest {
    //9.1
    @Test
    public void testRemoveSpaces_Spaces_HappyPath() {

        String s = "    Red Rover School   ";

        String expectedResult = "Лишние пробелы удалены";

        String actualResult = StringMethods.removeSpaces(s);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveSpaces_NoSpaces_HappyPath() {

        String s = "Red Rover School";

        String expectedResult = "Пробелов не было";

        String actualResult = StringMethods.removeSpaces(s);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveSpaces_EmptyString_Negative() {

        String s = "";

        String expectedResult = "Строка пустая";

        String actualResult = StringMethods.removeSpaces(s);

        Assert.assertEquals(actualResult, expectedResult);
    }
//@Test
//    public void testRemoveSpaces_NullString_HappyPath() {
//
//        String s = null; // Проверка на null встроена в String
//
//        String expectedResult = "Строка пустая" ;
//
//        String actualResult = StringMethods.removeSpaces(s);
//
//        Assert.assertEquals(actualResult, expectedResult);
//    }

//9.2

    @Test
    public void testRemoveAllAs_HappyPath() {

        String s = "taramasalata";

        String expectedResult = "trmslt";

        String actualResult = StringMethods.removeAllAs(s);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveAllAs_EmptyString_Negative() {

        String s = "";

        String expectedResult = "Строка пустая";

        String actualResult = StringMethods.removeAllAs(s);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //9.3
    @Test
    public void testRemoveAllZeros_HappyPath() {

        String s = "3504209706040000";

        String expectedResult = "35429764";

        String actualResult = StringMethods.removeAllZeros(s);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveAllZeros_ValidString_HappyPath() {

        String s = "1234485495839";

        String expectedResult = "This is a valid string";

        String actualResult = StringMethods.removeAllZeros(s);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveAllZeros_EmptyString_Negative() {

        String s = "";

        String expectedResult = "Строка пустая";

        String actualResult = StringMethods.removeAllZeros(s);

        Assert.assertEquals(actualResult, expectedResult);
    }
//9.4

    @Test
    public void testRemoveAllSpaces_HappyPath() {

        String s = "    R e d     Ro ve    r Sc   h ool   ";

        String expectedResult = "RedRoverSchool";

        String actualResult = StringMethods.removeAllSpaces(s);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //9.5
    @Test
    public void testCountAs_HappyPath() {

        String s = "Homenum Revelio";

        String expectedResult = "0, 15";

        String actualResult = StringMethods.countAs(s);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountAs_ZeroAndSpace_HappyPath() {

        String s = "3 tarAmasAlatA";

        String expectedResult = "6, 8";

        String actualResult = StringMethods.countAs(s);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //9.6
    @Test
    public void testCountJava_HappyPath() {

        String s = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current long-term support (LTS) versions. Oracle released the last zero-cost public update for the legacy version Java 8 LTS in January 2019 for commercial use, although it will otherwise still support Java 8 with public updates for personal use indefinitely. Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.";

        boolean expectedResult = true;

        boolean actualResult = StringMethods.countJava(s);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountJava_No_HappyPath() {

        String s = "99 little bugs in a code.\n"
                + "99 little bugs in a code.\n"
                + "Take one down, and patch it around.\n"
                + "235 critical bugs in the code.";

        boolean expectedResult = false;

        boolean actualResult = StringMethods.countJava(s);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountJava_Negative() {

        String s = "";

        boolean expectedResult = false;

        boolean actualResult = StringMethods.countJava(s);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //9.7
    @Test
    public void testInsertQuotes_HappyPath() {

        String a = "Abracadabra";

        String expectedResult = "\"Abracadabra\"";

        String actualResult = StringMethods.insertQuotes(a);
//        System.out.println(StringMethods.insertQuotes(a, b));

        Assert.assertEquals(actualResult, expectedResult);
    }


    //9.8.1
    @Test
    public void testInsert_OneQuotes_HappyPath() {

        String a = "Федор Достоевский писал: ";
        String b = "Надо любить жизнь больше, чем смысл жизни.";

        String expectedResult = "Федор Достоевский писал: \"Надо любить жизнь больше, чем смысл жизни.\"";

        String actualResult = StringMethods.insertQuotes(a, b);
//        System.out.println(StringMethods.insertQuotes(a, b));

        Assert.assertEquals(actualResult, expectedResult);
    }

    //9.8.2
    @Test
    public void testInsertQuotes_DoubleQuotes_HappyPath() {

        String a = "Наполеон Бонапарт писал";
        String b = "В моем словаре нет слова «невозможно».";

        String expectedResult = "Наполеон Бонапарт писал: \"В моем словаре нет слова \"невозможно\".\"";

        String actualResult = StringMethods.insertQuotes1(a, b);
//        System.out.println(StringMethods.insertQuotes1(a, b));

        Assert.assertEquals(actualResult, expectedResult);
    }

    //9.9
    @Test
    public void testCity1_HappyPath() {

        String a = "ташкент";

        String expectedResult = "Ташкент";

        String actualResult = StringMethods.city(a);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCity2_HappyPath() {

        String a = "ЧикаГО";

        String expectedResult = "Чикаго";

        String actualResult = StringMethods.city(a);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //9.10
    @Test
    public void testBetweenLetters_HappyPath() {

        String a = "ташкент";
        String b = "т";

        String expectedResult = "ташкент";

        String actualResult = StringMethods.betweenLetters(a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testBetweenLettersEn_HappyPath() {

        String a = "Whippersnapper";
        String b = "p";

        String expectedResult = "ppersnapp";

        String actualResult = StringMethods.betweenLetters(a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testBetweenLetters_ShortString_HappyPath() {

        String a = "p";
        String b = "p";

        String expectedResult = "p";

        String actualResult = StringMethods.betweenLetters(a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testBetweenLetters_EmptyString_Negative() {

        String a = "";
        String b = "p";

        String expectedResult = "";

        String actualResult = StringMethods.betweenLetters(a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testBetweenLetters_NotALetter_Negative() {

        String a = "pjgfgdhk";
        String b = "+";

        String expectedResult = "";

        String actualResult = StringMethods.betweenLetters(a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //9.11
    @Test
    public void testStartEnd_HappyPath() {

        String a = "Abracadabra";

        boolean expectedResult = true;

        boolean actualResult = StringMethods.startEnd(a);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testStartEnd_OneChar_HappyPath() {

        String a = "1";

        boolean expectedResult = true;

        boolean actualResult = StringMethods.startEnd(a);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //9.12
    @Test
    public void testSecondWord_HappyPath() {

        String a = " ташкент Вася ";

        String expectedResult = "Вася";

        String actualResult = StringMethods.secondWord(a);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSecondWord2_HappyPath() {

        String a = "Red Rover";

        String expectedResult = "Rover";

        String actualResult = StringMethods.secondWord(a);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSecondWord_ManySpaces_Negative() {

        String a = "Red Rover School";

        String expectedResult = "";

        String actualResult = StringMethods.secondWord(a);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //9.13
    @Test
    public void testDeleteBetween_HappyPath() {

        String s = "Red rover";
        int a = 1;
        int b = 4;

        String expectedResult = "Rover";

        String actualResult = StringMethods.deleteBetween(s, a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testDeleteBetween_SmallString_HappyPath() {

        String s = "Re";
        int a = 0;
        int b = 0;

        String expectedResult = "e";

        String actualResult = StringMethods.deleteBetween(s, a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }
 @Test
    public void testDeleteBetween_FirstLarger_HappyPath() {

        String s = "Red rover";
        int a = 4;
        int b = 1;

        String expectedResult = "Rover";

        String actualResult = StringMethods.deleteBetween(s, a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testDeleteBetween_OutOfBoundsIndex_Negative() {

        String s = "Red rover";
        int a = 0;
        int b = 9;

        String expectedResult = "";

        String actualResult = StringMethods.deleteBetween(s, a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testDeleteBetween_OutOfBoundsNegativeIndex_Negative() {

        String s = "Red rover";
        int a = -3;
        int b = 2;

        String expectedResult = "";

        String actualResult = StringMethods.deleteBetween(s, a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //9.14
    @Test
    public void testToArray_HappyPath() {

        String s = "QA for Everyone";

        String[] expectedResult = new String[]{"QA", "for", "Everyone"};

        String[] actualResult = StringMethods.toArray(s);

        Assert.assertEquals(actualResult, expectedResult);
    }

 @Test
    public void testToArray_EdgeAndInnerSpaces_HappyPath() {

        String s = "   QA for      Everyone   ";

        String[] expectedResult = new String[]{"QA", "for", "Everyone"};

        String[] actualResult = StringMethods.toArray(s);

        Assert.assertEquals(actualResult, expectedResult);
    }
@Test
    public void testToArray_NoSpaces_HappyPath() {

        String s = "QAforEveryone";

        String[] expectedResult = new String[]{"QAforEveryone"};

        String[] actualResult = StringMethods.toArray(s);

        Assert.assertEquals(actualResult, expectedResult);
    }
@Test
    public void testToArray_SpacesOnly_HappyPath() {

        String s = "     ";

        String[] expectedResult = new String[]{""};

        String[] actualResult = StringMethods.toArray(s);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //9.15
    @Test
    public void testFullName_HappyPath() {

        String s = "Александр Сергеевич Пушкин";

        String expectedResult = "Имя: Александр\n"
                + "Отчество: Сергеевич\n"
                + "Фамилия: Пушкин";

        String actualResult = StringMethods.fullName(s);

        Assert.assertEquals(actualResult, expectedResult);
    }
 @Test
    public void testFullName_MultiSpaces_HappyPath() {

        String s = "   Александр    Сергеевич    Пушкин   ";

        String expectedResult = "Имя: Александр\n"
                + "Отчество: Сергеевич\n"
                + "Фамилия: Пушкин";

        String actualResult = StringMethods.fullName(s);

        Assert.assertEquals(actualResult, expectedResult);
    }
@Test
    public void testFullName_MoreWords_Negative() {

        String s = "   Александр    Сергеевич    Пушкин   Колотушкин";

        String expectedResult = "";

        String actualResult = StringMethods.fullName(s);

        Assert.assertEquals(actualResult, expectedResult);
    }
@Test
    public void testFullName_LessWords_Negative() {

        String s = "   Александр    Сергеевич    ";

        String expectedResult = "";

        String actualResult = StringMethods.fullName(s);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //9.16
    @Test
    public void testRepeat_HappyPath() {

        String s = "Red";
        int a = 2;

        String expectedResult = "RedRed";

        String actualResult = StringMethods.repeat(s, a);

        Assert.assertEquals(actualResult, expectedResult);
    }

 @Test
    public void testRepeat_EdgeSpaces_HappyPath() {

        String s = "   Red   ";
        int a = 2;

        String expectedResult = "RedRed";

        String actualResult = StringMethods.repeat(s, a);

        Assert.assertEquals(actualResult, expectedResult);
    }

 @Test
    public void testRepeat_MiddleSpaces_Negative() {

        String s = "   Red hat  ";
        int a = 2;

        String expectedResult = "";

        String actualResult = StringMethods.repeat(s, a);

        Assert.assertEquals(actualResult, expectedResult);
    }


 @Test
    public void testRepeat_NegIndex_Negative() {

        String s = "   Redhat  ";
        int a = -5;

        String expectedResult = "";

        String actualResult = StringMethods.repeat(s, a);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //9.17
    @Test
    public void testLetterNumAtIndex_HappyPath() {

        String s = "aaaa";
        int a = 3;

        int expectedResult = 97;

        int actualResult = StringMethods.letterNumAtIndex(s, a);

        Assert.assertEquals(actualResult, expectedResult);
    }

 @Test
    public void testLetterNumAtIndex_Space_HappyPath() {

        String s = "aaa a";
        int a = 3;

        int expectedResult = 32;

        int actualResult = StringMethods.letterNumAtIndex(s, a);

        Assert.assertEquals(actualResult, expectedResult);
    }
@Test
    public void testLetterNumAtIndex_IndexOutOfBounds_Negative() {

        String s = "aaa a";
        int a = 5;

        int expectedResult = -1;

        int actualResult = StringMethods.letterNumAtIndex(s, a);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //9.18
    @Test
    public void testCompareOfThree_HappyPath() {

        String s = "aAaa";
        String s1 = "aaAa";
        String s2 = "Aaaa";

        boolean expectedResult = true;

        boolean actualResult = StringMethods.compareOfThree(s, s1, s2);

        Assert.assertEquals(actualResult, expectedResult);
    }
 @Test
    public void testCompareOfThree_EdgeSpaces_HappyPath() {

        String s = "    aAaa";
        String s1 = "aaAa     ";
        String s2 = "      Aaaa     ";

        boolean expectedResult = true;

        boolean actualResult = StringMethods.compareOfThree(s, s1, s2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCompareOfThree_EmptyStrings_HappyPath() { //Пустая строка не слово, но они равны

        String s = "";
        String s1 = "";
        String s2 = "";

        boolean expectedResult = true;

        boolean actualResult = StringMethods.compareOfThree(s, s1, s2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCompareOfThree_DifferentSpaces_HappyPath() {//Пустая строка не слово, но они равны :)

        String s = "   ";
        String s1 = " ";
        String s2 = "           ";

        boolean expectedResult = true;

        boolean actualResult = StringMethods.compareOfThree(s, s1, s2);

        Assert.assertEquals(actualResult, expectedResult);
    }


}

