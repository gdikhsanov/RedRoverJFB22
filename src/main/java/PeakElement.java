public class PeakElement {

    public static int[] peakElement(int[] arr) {

        if (arr == null || arr.length == 0) {
            return new int[0];
        } else if (arr.length == 1) {
            return new int[]{arr[0]};
        }

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == 0 && arr[i] > arr[i + 1]) {
                count++;
            } else if (i != arr.length - 1 && arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                count++;
            } else if (i == arr.length - 1 && arr[i] > arr[i - 1]) {
                count++;
            }
        }

        int[] resultArr = new int[count];
        int resultArrInd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == 0 && arr[i] > arr[i + 1]) {
                resultArr[resultArrInd] = arr[i];
                resultArrInd++;
            } else if (i != arr.length - 1 && arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                resultArr[resultArrInd] = arr[i];
                resultArrInd++;
            } else if (i == arr.length - 1 && arr[i] > arr[i - 1]) {
                resultArr[resultArrInd] = arr[i];
                resultArrInd++;
            }
        }

        return resultArr;
    }
}
