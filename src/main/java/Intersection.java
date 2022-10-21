public class Intersection {

    public static int[] intersection(int[] arr1, int[] arr2) {

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

        return resultArr;
    }
}
