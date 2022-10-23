public class ManipulationsWithArrays {

    // Arrays 2.1.4
    public static int[] getTheGreaterHalf(int[] arr) {

        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        int resultArrLength = (arr.length % 2 == 0
                ? arr.length / 2
                : (arr.length - 1) / 2 ); // без центрального индекса

        int[] resultArr = new int[resultArrLength];
        int leftSum = 0;
        int rightSum = 0;
        int j = arr.length - 1;

        for (int i = 0; i < resultArrLength; i++, j--) {
            leftSum += arr[i];
            rightSum += arr[j];
        }

        if (leftSum > rightSum) {
            for (int i = 0; i < resultArrLength; i++) {
                resultArr[i] = arr[i];
            }
        }else {
            int oddArrAdd = (arr.length % 2 == 0
                    ? 0
                    : 1); //

            for (int i = arr.length - resultArrLength; i < arr.length; i++) {
                resultArr[i - resultArrLength - oddArrAdd] = arr[i];
            }
        }

        return resultArr;
    }
}
