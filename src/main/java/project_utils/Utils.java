package project_utils;

import java.util.Arrays;

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

    public static int countEvenInArray(int[] arr) {

        if (arr == null || arr.length == 0) {
            return -1;
        }

        int count = 0;
        for (int i : arr
        ) {
            if (i % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int countOddInArray(int[] arr) {

        if (arr == null || arr.length == 0) {
            return -1;
        }

        int count = 0;
        for (int i : arr
        ) {
            if (i % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static int[] evenArray(int[] arr) {

        int[] resultArr = new int[countEvenInArray(arr)];
        int resultArrIndex = 0;

        for (int i : arr
        ) {
            if (i % 2 == 0) {
                resultArr[resultArrIndex] = i;
                resultArrIndex++;
            }
        }
        return resultArr;
    }

    public static int[] oddArray(int[] arr) {

        int[] resultArr = new int[countOddInArray(arr)];
        int resultArrIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                resultArr[resultArrIndex] = arr[i];
                resultArrIndex++;
            }
        }

        return resultArr;
    }

    public static int[] randomArrayInt(int from, int to, int length) {

        from = Math.abs(from);
        to = Math.abs(to);
        length = Math.abs(length);

        int[] resultArr = new int[length];

        for (int i = 0; i < length; i++) {
            resultArr[i] = (int)(Math.random() * (to - from + 1)) + from;
        }

        return resultArr;
    }

//    public static void main(String[] args) {
//        System.out.println(Arrays.toString(randomArrayInt(1, 5, 10)));
//    }
}
