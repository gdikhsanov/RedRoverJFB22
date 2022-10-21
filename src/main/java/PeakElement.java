public class PeakElement {

    public static int[] peakElement(int[] arr) {

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
