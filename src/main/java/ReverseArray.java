public class ReverseArray {

    public static int[] reverseArray(int[] arr) {

        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        int[] resArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            resArr[i] = arr[arr.length - 1 - i];
        }

        return resArr;
    }
}
