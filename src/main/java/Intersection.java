import project_utils.Utils;

public class Intersection {
                                                                // ПЕРЕДЕЛАТЬ.
    public static int[] intersection(int[] arr1, int[] arr2) { //проверить совпадения чисел в одном массиве
                                                                // или удалить одинаковые элементы отсортированного массива
        int count = 0;

        for (int i : arr1
             ) {
            for (int j : arr2
                 ) {
                if (i == j) {
                    count++;
                }
            }
        }

        int[] resultArr = new int[count];

        int resultArrIndex = 0;
        for (int i : arr1
        ) {
            for (int j : arr2
            ) {
                if (i == j) {
                    resultArr[resultArrIndex] = i;
                    resultArrIndex++;
                }
            }
        }

//        Utils.sortArray(resultArr);
//
//       int[] resultArr2 = new int[resultArr.length];
//
//        for (int i = 1; i < resultArr.length; i++) {
//
//            if (resultArr[i] == resultArr[i - 1]){
//                resultArr2 = new int[resultArr2.length] ;
//                for (int j = 0; j < resultArr2.length; j++) {
//                    resultArr2[j] = resultArr[j+1];
//                }
//            }
//
//        }

        return resultArr; // тут выдаёт массивс повторами
    }
}
