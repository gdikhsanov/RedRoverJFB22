import project_utils.Utils;

public class OddEvenElementsInArray {

    //Arrays 2.1.2

    public static int[] countOddEvenValuesInArray(int[] arr) {
        if (arr == null || arr.length == 0) {

            return new int[0];
        }
        return new int[]{Utils.countEvenInArray(arr), Utils.countOddInArray(arr)};
    }

    //Arrays 2.1.3

    public static int[][] createOddEvenArray(int[] arr /*from, int to, int length*/) {

//        int[] arr = Utils.randomArrayInt(from, to, length);

        if (arr == null || arr.length == 0) {

            return new int[0][0];
        }
        return new int[][]{Utils.evenArray(arr), Utils.oddArray(arr)};
    }

//    public static void main(String[] args) {
//        System.out.println(createOddEvenArray(new int[]{1,2,3,4,5,6}));
//        System.out.println(new int[]{1,2,3,4,5,6});
//    }

}
