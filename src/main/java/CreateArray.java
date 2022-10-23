public class CreateArray {

    //Arrays 1.1.4

    public static String[] createArrayFromText(String st) {
        if (st == null) {
            return new String[0];
        }
        return st.split(" ");
    }

    //Arrays 2.1.1


    public static int[] createIntArrayFromText(String s) {
        if (s == null || s.equals("")) {
            return new int[0];
        }

        String[] sArr = s.split(" ");
        int[] result = new int[sArr.length];

        for (int i = 0; i < sArr.length; i++) {
            result[i] = (int)Double.parseDouble(sArr[i]);
        }
        return result;
    }

    //Arrays 2.1.5

    public static int[] multiplesOf(int number){

        if (number < 1 || number > 10) {
            return new int[0];
        }

        int[] resultArr = new int[11];

        for (int i = 0; i < resultArr.length; i++) {

            resultArr[i] = i * number;
        }

        return resultArr;
    }




}
