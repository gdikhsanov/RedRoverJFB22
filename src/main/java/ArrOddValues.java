import project_utils.Utils;

public class ArrOddValues {
    public static int[] arrOddValues(int[] intArr){
        int oddCount = 0;
        for (int number: intArr
             ) {
            if (!Utils.isEven(number)){
                oddCount++;
            }
        }

        int[] resultArr = new int[oddCount];
        int resultArrIndex = 0;

        for (int j : intArr) {
            if (!Utils.isEven(j)) {
                resultArr[resultArrIndex] = j;
                resultArrIndex++;
            }
        }
        return resultArr;
    }
}
