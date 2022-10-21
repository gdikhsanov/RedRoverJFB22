public class SortArray {

    public static int[] sortArray(int[] arr) {
        boolean isSorted = false;

        while(!isSorted)
            {
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
                }
                else {
                    count = 0;
                }
            }
        return arr;
    }
}
