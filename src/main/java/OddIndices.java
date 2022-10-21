public class OddIndices {
    public static int[] oddIndices(int[] arr){

        int[] resultArr = new int[(int)(arr.length / 2)];
        int resultArrIndex = 0;

        for (int i = 1; i < arr.length; i+= 2, resultArrIndex++) {
            resultArr[resultArrIndex] = arr[i];
        }
        return resultArr;
    }
}
