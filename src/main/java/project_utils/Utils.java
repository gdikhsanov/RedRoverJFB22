package project_utils;

public class Utils {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isExistInArr(int[] arr, int a) {
        for (int i : arr
        ) {
            if (i == a) {
            return true;
            }
        }
        return false;
    }

    public static int[] sortArray(int[] arr) {
        boolean isSorted = false;

        while (!isSorted) {
            int count = 0;
            for (int i = 0; i < arr.length - 1; i++) {

                if (arr[i] > arr[i + 1]) {
                    int n = arr[i];

                    arr[i] = arr[i + 1];
                    arr[i + 1] = n;
                    count++;
                }

            }
            if (count == 0) {
                isSorted = true;
            } else {
                count = 0;
            }
        }
        return arr;
    }


}
