import project_utils.Utils;

import java.util.Arrays;

public class NumberOccurrences {
    public static Object[] numberOccurrences(int[] arr) {

        Utils.sortArray(arr);

        int uniqNumbers = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                uniqNumbers++;
            }
        }

        Object[] resultArr = new Object[uniqNumbers];

        if (arr.length == 0) {
            resultArr = new Object[0];
        } else {

            int counter = 1;
            int resultArrIndex = 0;

            for (int i = 1; i < arr.length; i++) {
                if (i == 1 && arr[i] != arr[i - 1]) {
                    resultArr[resultArrIndex] = new int[]{arr[0], 1};
                    resultArrIndex++;
                } else if (arr[i] == arr[i - 1] && i == arr.length - 1) { //проверка на последний сначала, чтобы добавить последний элемент
                    resultArr[resultArrIndex] = new int[]{arr[i], counter + 1}; // прибавляем 1 за последний элемент массива
                } else if (arr[i] == arr[i - 1]) {
                    counter++;
                } else if (arr[i] != arr[i - 1] && i != arr.length - 1) { //про последний - избыточное условие
                    resultArr[resultArrIndex] = new int[]{arr[i - 1], counter};
                    resultArrIndex++;
                    counter = 1;
                }
            }
        }
        return resultArr;
    }

//    public static void main(String[] args) {
//        System.out.println(Arrays.deepToString(numberOccurrences(new int[]{3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1})));
//
//    }
}
