public class NegativeOnTheRight {
    public static int[] negativeOnTheRight(int[] arr) {

        int[] resultArr = new int[arr.length];
        int posIndex = 0;
        int negIndex = arr.length - 1;
        int j = 0;

        for (int i = arr.length - 1; i >= 0 ; i--, j++) {
            if (arr[i] < 0) {
                resultArr[negIndex] = arr[i];
                negIndex--;
            }

            if (arr[j] >= 0){
                resultArr[posIndex] = arr[j];
                posIndex++;
            }
        }

        return resultArr;
    }
}
