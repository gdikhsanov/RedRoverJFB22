import project_utils.Utils;

public class KthLargest {

    public static int kthLargest(int[] arr, int k) {

        if (k < arr.length && k != 0) {
            return Utils.sortArray(arr)[arr.length - k];
        }
        else {
            return 0;
        }
    }
}
