import java.util.Arrays;

public class Temp {

    public static int lengthOutputArray(int[] inputArray, int n) {
        int length = 0;
        for (int i = 0; i < inputArray.length - 1; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] + inputArray[j] == n && inputArray[i] != n && inputArray[j] != n) {
                    length++;

                }
            }
        }
        return length;
    }
    // формируем массив искомых пар
    public static int[][] SummOfTwo(int[] inputArray, int n) {
        int length = lengthOutputArray(inputArray, n);
        int[][] outputArray = new int[length][2];
        for (int i = 0,k = 0; i < inputArray.length - 1; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] + inputArray[j] == n && inputArray[i] !=n && inputArray[j] != n) {
                    outputArray[k][0] = inputArray[i];
                    outputArray[k][1] = inputArray[j];
                    k++;

                }
            }
        }
        return outputArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(Temp.SummOfTwo(new int[]{3, 3, 2, 2, 10, 10, 9, 9, 12, 0}, 12)));
    }
}
