public class MinMaxAve {

    public static int[] minMaxAve(int[] arr, int a, int b) {

        if (a >= 0 && a < arr.length && b >= 0 && b < arr.length) { //добавить null

            if (a > b) {
                int n;
                n = a;
                a = b;
                b = n;
            }

            int ave = 0, numbers = 0, min = arr[a], max = arr[a];

            for (int i = a; i <= b; i++, numbers++) {
                ave += arr[i];

                if (arr[i] < min) {
                    min = arr[i];
                } else {
                    max = arr[i];
                }
            }
            ave = Math.round(ave / numbers);

            return new int[]{min, max, ave}; //выводим нчало, конец, среднее
        }
        else {
            return new int[]{};
        }
    }
}
