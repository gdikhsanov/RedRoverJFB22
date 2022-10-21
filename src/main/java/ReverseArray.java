public class ReverseArray {

    public static int[] reverseArray(int[] arr) {

        int[] resArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            resArr[i] = arr[arr.length - 1 - i];
        }

        return resArr;
    }
}
