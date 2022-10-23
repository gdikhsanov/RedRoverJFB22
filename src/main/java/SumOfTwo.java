public class SumOfTwo {

/*  // метод из Utils
    public static boolean isExistInArr(int[]arr,int a){
        if (arr == null || arr.length == 0) {
            return false;
        }
        for(int i:arr){
            if(i==a){
                return true;
            }
        }
        return false;
    }
  */
    public static int[][] /* можно Qbject[] */ sumOfTwo(int[] arr, int a) {
        //({4, 3, 7, 12, 5, 2, 9, 4, 12}, 12)  → {{3, 9}, {7, 5}}

        if (arr == null || arr.length == 0) {
            return new int[0][0];
        }

        int objArrLength = 0; // количество уникальных чисел т.е. число индексов итогового двумерного массива
        int[] fountNumbers = new int[arr.length]; //Временный массив найденных чисел, чтобы не повторяться (максимально необходимой длины.)
        int fountNumbersIndex = 0; // индекс временного массива для записи нового числа

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] + arr[j] == a //если сумма = нужной и любой элемент не присутствует в массиве найденных (+ не сравниваем с собой)
                        && !(project_utils.Utils.isExistInArr(fountNumbers, arr[i]) // метод проверяет, что в массиве нет такого числа
                        || project_utils.Utils.isExistInArr(fountNumbers, arr[j]))) {
                    fountNumbers[fountNumbersIndex] = arr[i];           // Пишем элемент во временный маасив. Достаточно i т.к. сумму
                    fountNumbersIndex++;                                // j с i проверит потом и всё равно найдёт её во временном массиве.
                    objArrLength++;
                }
            }
        }

        fountNumbers = new int[arr.length]; // обнуляем временный массив найденных
        fountNumbersIndex = 0; // обнуляем индекс временного массива для записи нового числа

        int[][] resultArr = new int[objArrLength][2]; // создаём итоговый массив найденной длины // можно Qbject[] resultArr = new int[objArrLength];
        int resultArrIndex = 0; // индекс итогового массива для записи

        for (int i = 0; i < arr.length; i++) { //повторяем прошлый цикл
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] + arr[j] == a
                        && !(project_utils.Utils.isExistInArr(fountNumbers, arr[i]) // метод проверяет, что в массиве нет такого числа
                        || project_utils.Utils.isExistInArr(fountNumbers, arr[j]))) {
                    fountNumbers[fountNumbersIndex] = arr[i];
                    fountNumbersIndex++; // две переменные для наглядности - можно оставить одну
                    resultArr[resultArrIndex] = new int[]{arr[i], arr[j]}; // вставляем пары в ячейки двумерного массива (повторений не будет)
                    resultArrIndex++; // две переменные для наглядности - можно оставить одну

                }
            }
        }

        return resultArr;
    }
}
