import project_utils.Utils;

import java.util.Arrays;

public class SumOfTwo {
    public static Object[] sumOfTwo(int[] arr, int a) {

        int objArrLength = 0;
        int[] fountNumbers = new int[arr.length];
        int fountNumbersIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] + arr[j] == a
                        && !(Utils.isExistInArr(fountNumbers, arr[i]) || Utils.isExistInArr(fountNumbers, arr[j]))) {
                    fountNumbers[fountNumbersIndex] = arr[i]; // Достаточно i т.к. сумму j проверит потом c i и найдёт её в массиве
                    fountNumbersIndex++;
                    objArrLength++;
                }
            }
        }

        fountNumbers = new int[arr.length];
        fountNumbersIndex = 0;

        Object[] resultArr = new Object[objArrLength];
        int resultArrIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] + arr[j] == a
                        && !(Utils.isExistInArr(fountNumbers, arr[i]) || Utils.isExistInArr(fountNumbers, arr[j]))) {
                    fountNumbers[fountNumbersIndex] = arr[i]; // Достаточно i т.к. сумму j проверит потом c i и найдёт её в массиве
                    fountNumbersIndex++;
                    resultArr[resultArrIndex] = new int[]{arr[i], arr[j]};
                    resultArrIndex++;

                }
            }
        }

        return resultArr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(sumOfTwo(new int[]{4, 3, 7, 12, 5, 2, 9, 4, 12}, 125)));
    }
}
