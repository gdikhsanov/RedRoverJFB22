public class StringMethods {
    //9.1
    public static String removeSpaces(String s) {
        if (s == null || s.isEmpty()) {
            return "Строка пустая";
        } else if (s.trim().equals(s)) {
            return "Пробелов не было";
        } else {
            s = s.trim();
            return "Лишние пробелы удалены";
        }
    }

    //9.2
    public static String removeAllAs(String s) {
        if (s == null || s.isEmpty()) {

            return "Строка пустая";
        } else {

            return s.replace("a", "");
        }
    }

    //9.3
    public static String removeAllZeros(String s) {
        if (s == null || s.isEmpty()) {

            return "Строка пустая";
        }

        s = s.replace(" ", "");

        if (s.matches("[0-9]") || !s.equals(s.replace("0", ""))) {

            return s.replace("0", "");
        } else {

            return "This is a valid string";
        }
    }

    //9.4

    public static String removeAllSpaces(String s) {
        if (s == null || s.isEmpty()) {

            return "Строка пустая";
        }

        return s.replace(" ", "");
    }
//9.5

    public static String countAs(String s) {
        if (s == null || s.isEmpty()) {

            return "Строка пустая";
        }

        int counter = 0;


        for (int i = 0; i < s.length(); i++) {
            if (s.trim().toLowerCase().charAt(i) == 'a') {
                counter++;
            }
        }

        return String.valueOf(counter).concat(", ").concat(String.valueOf(s.trim().length() - counter));
    }

//9.6

    public static Boolean countJava(String s) {
        if (s == null || s.isEmpty()) {

            return false;
        }
        return s.contains("Java");
    }

    //9.7

    public static String insertQuotes(String s) {
        if (s == null || s.isEmpty()) {

            return "";
        }

        return "\"".concat(s).concat("\"");
    }

//9.8.1

    public static String insertQuotes(String a, String b) {
        if (a.isEmpty() || b.isEmpty()) {

            return "";
        } else if (a.contains("писал")) {

            return a.concat("\"").concat(b).concat("\"");
        } else {

            return "";
        }
    }

//9.8.2

    public static String insertQuotes1(String a, String b) {
        if (a.isEmpty() || b.isEmpty()) {

            return "";
        } else if (a.contains("писал")) {

            return a.concat(": \"").concat(b).replace("«", "\"").replace("»", "\"").concat("\"");
        } else {

            return "";
        }
    }

//9.9

    public static String city(String s) {
        if (s == null || s.isEmpty()) {

            return "";
        }

        return s.substring(0, 1).toUpperCase().concat(s.substring(1).toLowerCase());
    }
//9.10

    public static String betweenLetters(String s, String letter) {
        if (s == null || s.isEmpty() || !(letter.matches("[a-z]") || letter.matches("[A-Z]")
                || letter.matches("[а-я]") || letter.matches("[А-Я]"))) {

            return "";
        }

        return s.substring(s.indexOf(letter), s.lastIndexOf(letter) + 1);
    }
//9.11

    public static boolean startEnd(String s) {

        //return s == null || s.isEmpty() || s.toLowerCase().charAt(0) == s.toLowerCase().charAt(s.length() - 1);
        if ( s == null || s.isEmpty() ) {
            return false;
        }
        return s.toLowerCase().lastIndexOf(s.toLowerCase().charAt(0)) == s.length() - 1;
    }

//9.12

    public static String secondWord(String s) {
        if (s == null || s.isEmpty() || !s.trim().contains(" ") || s.trim().indexOf(" ") != s.trim().lastIndexOf(" ")) {
            // Проверяем, что после обрезки крайних пробелов, внутренний пробел только один.
            return "";
        }

        return s.trim().substring(s.trim().indexOf(" ") + 1);
    }


    //9.13
    //Написать метод, который принимает строку, и 2 индекса. Метод удаляет все, что находится между двумя индексами включительно
    //Test Data:
    //“Red rover”, 1, 4 → “Rover”
    public static String deleteBetween(String s, int a, int b) {
        if (s == null || s.isEmpty() || s.length() <= 1 || (a + b) < 0 || a > s.length() - 1 || b > s.length() - 1) {
            //при длине 1, удаляет сам себя.
            //валидируем индексы - не больше границ

            return "";
        } else if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (a == 0) {
            return s.substring(b + 1);
        } else
            return s.substring(0, a).concat(s.substring(b + 1));
    }

    //9.14

    public static String[] toArray(String s) {
        if (s == null || s.length() == 0) {

            return new String[0];
        }

        return s.trim().replaceAll(" +", " ").split(" ");
    } //режем пробелы до и после, заменяем любую последовательность пробелов на один, делим на массив по пробелам

//9.15

    public static String fullName(String s) {
        if (s == null || s.length() == 0) {

            return "";
        }

        String[] arr = s.trim().replaceAll(" +", " ").split(" ");

        if (arr.length != 3) {

            return "";
        } else {

            return "Имя: " + arr[0] + "\nОтчество: " + arr[1] + "\nФамилия: " + arr[2];
        }

    }
//9.16

    public static String repeat(String s, int a) {
        if (s == null || s.length() == 0 || a <= 0 || s.trim().contains(" ")) { //только одно слово, коэфициент больше нуля

            return "";
        }

        return s.trim().repeat(a);
    }
//9.16

    public static int letterNumAtIndex(String s, int a) {
        if (s == null || s.length() == 0 || a < 0 || a > s.length() - 1) { //коэфициент больше нуля

            return -1;
        }

        return s.charAt(a);
    }

    //9.16
    //Логика - обрезаем пробелы до и после, валидируем на одно слово и сравниваем оставшуюся тсроку.
    // НО,  можно было бы без валидации на одно слово. Т.к. даже если несколько слов
    // будет странно, если одинаковые строки с внутренними пробелами будут false
    public static boolean compareOfThree(String a, String b, String c) {
        if ((a == null || b == null || a.length() == 0 && b.length() == 0 && c.length() == 0) //Пустая строка не слово, но они равны :)
                || ((a.trim().equalsIgnoreCase(b.trim()) && a.trim().equalsIgnoreCase(c.trim())) // сравниваем строки после обрезки
                && !(a.trim().contains(" ") || b.trim().contains(" ") || c.trim().contains(" ")))) { // Валидация на одно слово

            return true;
        } else

            return false;
    }
}
