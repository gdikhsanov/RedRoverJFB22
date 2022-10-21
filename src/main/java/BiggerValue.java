public class BiggerValue {
    public static int biggerValue(int a, int b) {
        return a > b
                ? a
                : a < b
                ? b
                : Integer.MAX_VALUE;
    }
}
