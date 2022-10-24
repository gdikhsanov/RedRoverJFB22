public class ManipulationsWithArrays {

    // Arrays 2.1.4
    public static int[] getTheGreaterHalf(int[] arr) {

        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        int resultArrLength = (int)arr.length/ 2; // без центрального индекса

        int[] resultArr = new int[resultArrLength];
        int leftSum = 0;
        int rightSum = 0;
        //[0 1 2 3 4 5 6 7 8]

        for (int i = 0, j = arr.length - 1; i < resultArrLength; i++) {
            leftSum += arr[i];
            rightSum += arr[j];
            j--;
        }

        if (leftSum > rightSum) {
            for (int i = 0; i < resultArrLength; i++) {
                resultArr[i] = arr[i];
            }
        }else if (leftSum <= rightSum) {
//            int oddArrAdd = (arr.length % 2 == 0
//                    ? 0
//                    : 1); //

            for (int i = arr.length - resultArrLength, j = 0; i < arr.length; i++, j++) {
                resultArr[j] = arr[i];
            }
        }

        return resultArr;
    }
}
